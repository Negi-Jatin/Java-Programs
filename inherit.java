class inherit{
	public static void main(String args[]){
		A obj = new A();
		obj.display();
	}
}
class A{
	final int x = 10;
	void display(){
		System.out.println(x);
	}
}
