package Even_Odd;

public class Largest_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 5, -15, 20, -30};
		int max = a[0];
		
		for(int i = 0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max = a[i];
								
			}
		}
		System.out.println(max);

	}

}
