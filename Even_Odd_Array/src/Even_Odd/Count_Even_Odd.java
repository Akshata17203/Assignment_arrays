package Even_Odd;

public class Count_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11, 12, 13, 14, 15}; 
		
		int even_count = 0;
	    int odd_count = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	        if (a[i] % 2 == 0)
	            even_count++;
	        else
	            odd_count++;
	    }	 
	    System.out.println ("Even count : " +even_count);
	    System.out.println( "Odd count : " +odd_count);
		
	}

}
