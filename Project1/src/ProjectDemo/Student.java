package ProjectDemo;

public class Student {

	int age,roll_no;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.age=21;
		st.roll_no=9;
		System.out.println("Age :"+ st.age);
		System.out.println("Roll No :"+ st.roll_no);
		st.display1();
		st.display2();
		System.out.println("Checking for staging");
	}

}
