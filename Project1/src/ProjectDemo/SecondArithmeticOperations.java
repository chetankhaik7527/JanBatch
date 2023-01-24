package ProjectDemo;

public class SecondArithmeticOperations {

	
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
			SecondArithmeticOperations op= new SecondArithmeticOperations();
			int sumop,subop1,subop,mulop,divop;
			divop=op.div(10, 2);
			subop=op.sub(divop, 2);
			sumop=op.sum(subop, 2);
			subop1=op.sub(sumop, 2);
			mulop=op.mul(subop1, 2);
			System.out.println("Result of (((((10/2)-2)+2)-2)*2) :"+ mulop);
			
	}

}
