package ProjectDemo;

public class ArithmeticOperations {
	
	public int sum(int x, int y)
	{
		return x+y;
	}
	public int sub(int x, int y)
	{
		return x-y;
	}
	public int mul(int x, int y)
	{
		return x*y;
	}
	public int div(int x, int y)
	{
		return x/y;
	}
	public static void main(String[] args) {
		ArithmeticOperations op= new ArithmeticOperations();
		int sumop,sumop1,subop,mulop,divop;
		sumop=op.sum(10, 2);
		sumop1=op.sum(sumop,2);
		subop=op.sub(sumop1, 2);
		mulop=op.mul(subop,2);
		divop=op.div(mulop,2);
		System.out.println("Result of (((((10+2)+2)-2)*2)/2) :"+ divop);
		
	}

}
