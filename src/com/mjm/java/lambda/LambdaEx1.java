package com.mjm.java.lambda;

@FunctionalInterface
interface MyFunction{
	void run();
}

class LambdaEx1 {
	
	static void executr(MyFunction f) {	//�Ű������� Ÿ���� MyFunction�� �޼���
		f.run();
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
