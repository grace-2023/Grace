package myAssignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=24;
	
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			System.out.println(num+ "is a prime number");
		}
		
			else
			{
				System.out.println(num+ "is not a prime number");
		}
		break;
	}
	
	}

}
