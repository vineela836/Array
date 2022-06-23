
public class test2 {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		
		int sum=0;
		
		System.out.println("Sum of given elements are :- 10,20,30");
		
		for(int i=0;i<=a.length-1;i++) //a.length-1=2 // 0 1 2 
		{
		   sum=sum+a[i]; //10+20+30
		}
		System.out.println("Sum of Elements:-" +sum);
}
}
 