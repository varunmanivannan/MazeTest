abstract class Mazet12{

	void m1(){
		System.out.println("abstract class m1 method");
	}
	
	abstract void m2();
	
	abstract int m3();

}

class Use extends Mazet12{
	void m2(){
		System.out.println("Use class m2 method");
	}
	
	int m3(){
		System.out.println("Use class m3 method");
		return 1;
	}
	
	public static void main(String[] args){
		Use u = new Use();
		u.m1();
		u.m2();
		u.m3();
	}
} 