package ProjectDemo;

public class ConstructorAssignment5 {

	void display(){
		
		System.out.println("\n Default Method");
	}
	public void display1(int a){
		
		System.out.println("\n One Parameterized Method");
	}
	public void display2(int a, int b){
		this.display4(1,2,3,4);
		this.display();
		this.display1(1);
		this.display3(1,2,3);
		System.out.println("\n Two Parameterized Method");
	}
	public void display3(int a, int b, int c){
		System.out.println("\n Three Parameterized Method");
	}
	public void display4(int a, int b, int c, int d){
		System.out.println("\n Four Parameterized Method");
	}
	public static void main(String[] args) {
		ConstructorAssignment5 c1=new ConstructorAssignment5();
		c1.display2(1, 2);
	}
}