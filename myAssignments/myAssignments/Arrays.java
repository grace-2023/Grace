package myAssignments;



public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	int[] arrcounts= {1,5,7,8,9,0,4,5,2,5,5,5,5,};
	System.out.println(arrcounts.length);
	int count=0;
	for(int i=0; i<arrcounts.length;i++)
	{
		if(arrcounts[i]==5)
		{
			count++;
		}
	}
	System.out.println("Number of times 5 occured in the array is " +count);
	
	
	}
}

		

