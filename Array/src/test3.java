
public class test3 {




	public static void main(String[] args) {
		
	
	int a[]= {10,20,30,40,50};
			
			int sum=0;
			int c=0;
			
			for(int i=0;i<a.length;i++) 
			{
				c++;
			   sum=sum+a[i]; 
			   
			   double avg=sum/a.length;
			}
			System.out.println("Avg of Elements:-" +sum/c);
	}
		

	}



