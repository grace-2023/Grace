package homeassigment.week2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[]= {1,2,3,5,6};
		int array2[]= {5,6,3,9,8};
		

		
		Arrays.sort(array1);
		
		Arrays.sort(array2);
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if((array1[i])!=array2[j])
				{
				
					System.out.println(array1[i]);
				}
			}
	}

	}
}
