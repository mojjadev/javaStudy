package com.mjm.java.lambda;

@FunctionalInterface
interface MyFunction{
	void run();
}

class LambdaEx1 {
	
	static void execute(MyFunction f) {	//매개변수의 타입이 MyFunction인 메서드
		f.run();
	}	
	
	static MyFunction getMyFunction() {	//반환 타입이 MyFunction인 메서드
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랍다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {	//익명 클래스로 run()을 구현
			
			@Override
			public void run() {	//public을 반드시 붙여야 함
				// TODO Auto-generated method stub
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(() -> System.out.println("run()"));
	}

}
