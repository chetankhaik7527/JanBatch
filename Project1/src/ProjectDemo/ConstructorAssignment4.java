package ProjectDemo;

public class ConstructorAssignment4 {

	public ConstructorAssignment4(){
		this(1,2,3);
		System.out.println("\n Default Constructor");
	}
	public ConstructorAssignment4(int a){
		this();
		System.out.println("\n One Parameterized Constructor");
	}
	public ConstructorAssignment4(int a, int b){
		this(1,2,3,4);
		System.out.println("\n Two Parameterized Constructor");
	}
	public ConstructorAssignment4(int a, int b, int c){
		System.out.println("\n Three Parameterized Constructor");
	}
	public ConstructorAssignment4(int a, int b, int c, int d){
		this(1);
		System.out.println("\n Four Parameterized Constructor");
	}
	public static void main(String[] args) {
		ConstructorAssignment4 c1=new ConstructorAssignment4(1,2);
		

	}

}
