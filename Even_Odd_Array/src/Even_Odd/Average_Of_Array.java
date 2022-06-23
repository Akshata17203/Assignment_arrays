package Even_Odd;

public class Average_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {10,20,30,40,50};
		int avg = 0;
		
		System.out.print("The average of numbers: ");
		for(int i = 0;i < A.length;i++)
		{
			avg = avg + A[i];	
			
		}
			double of_avg = avg/A.length;
			System.out.println(of_avg);	
		}
	}


