
public class test5 {
	public static void main(String args[]) {
		
		int a[]={10, 5, -15, 20, -30};
		
		int b = a[0];
		for(int i=0;i<a.length;i++)
		{
			 if(a[i] > b)
			 {
				 b=a[i];
			 }
		}
		System.out.println("The Largest Number is = "   +b);
		
	}

}
