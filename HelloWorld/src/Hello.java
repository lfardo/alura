public class Hello {

	public static void main(String[] args) {

		int a,b,c,x;
		
		a = 6;
		b = 3;
		c = 2;
		
		x=0;
				
	   for (int i=1; i<=9; i=i+2) {
		   if (a%2==0) {
			   x = x+2*b;
			   System.out.println("Passou aqui!");
		   } else {
			   x = x -c;
		   } 
		   
		   a = a -1;
	   }
	   
	   System.out.println(x);
	}
	
}
