package com.mjm.java.lambda;

@FunctionalInterface
interface MyFunction{
	void run();
}

class LambdaEx1 {
	
	static void executr(MyFunction f) {	//매개변수의 타입이 MyFunction인 메서드
		f.run();
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
