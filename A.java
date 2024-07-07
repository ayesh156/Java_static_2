class B {

	static int i = 20;

	static{
		int i = 10;
		System.out.println("B block 1");
		System.out.println(A.i);
	}
}

class A extends B {

	static int i = 50;

	static{
		System.out.println("A block 1");
		System.out.println(B.i);
	}

	static{
		System.out.println("A block 2");
	}

	public static void main(String[] args){

		System.out.println("main");

	}

	static{
		System.out.println("A block 3");
	}

}