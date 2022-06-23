package Even_Odd;

public class ArrayOfEvenOdd {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		System.out.println("Even:");  
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2 == 0)
			{  
				System.out.println(a[i]);  
			}  
		}  
		System.out.println("Odd:");  
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2 != 0)
			{  
				System.out.println(a[i]);  
			}  		

		}
	}

}
