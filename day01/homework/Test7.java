public class Test7{

	public static void main(String [] args){
		int a = 10;
		int b = 20;
		
		System.out.println("����ǰ:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("������:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}