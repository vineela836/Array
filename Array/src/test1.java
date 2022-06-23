
public class test1 {

	public static void main(String[] args) {
		
		int a[]= {15,63,96,35,86,99};
		int c=0;
		int b=0;
		
		System.out.println("Even Numbers:-");
		for(int i=0;i<a.length;i++) {
		 if(a[i]%2==0){ 
			 c++;
		System.out.println(a[i] + " ");
		
	   }
		 
	}
		
		System.out.println(c + " ");
		
		System.out.println("Odd Numbers:-");
		for(int i=0;i<a.length;i++) {
		 if(a[i]%2!=0){ 
			 b++;
		System.out.println(a[i] + " ");
		
	   }
		 
	}
		System.out.println(b + " ");
		

}
}