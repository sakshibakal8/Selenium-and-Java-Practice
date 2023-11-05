package selenium;

public  class Sab implements SabInterface {
	static   int a;
	 static  int b;
	 public Sab() {
		 System.out.println("I am default constructor");		
		}
	public Sab(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("I am overloader constructor");
	}
	 String Ids(String Idss)
	{
//		System.out.println(Idss);
		return Idss+"Bakal";
		
	}
	

	public static void main(String[] args) {
		
		Sab sab  = new Sab();
//		Sab S1=new Sab(5,5);
//		
//		
////		Ids("Sakshi");
//		int n1=1;
//		n1=2;
//		System.out.println(n1);
//		Sab s=new Sab(5,5);
//		Sab s1=new Sab(9,9);
//		
//		Sab a1=new Sab(4,4);
//		
//		System.out.println("s1 a:"+s1.a);
//		System.out.println("s1 b:"+s1.b);
//		
//		
//		System.out.println("s a:"+s.a);
//		System.out.println("s b:"+s.b);
//		
//		
//		System.out.println("a1 a:"+a1.a);
//		System.out.println("a1 b:"+a1.b);
//		
//		
//		
//		/*
//		 * 
//s1 a:5
//s1 b:7
//s a:5
//s b:5
//		 * String name = s.Ids("Sakshi"); System.out.println(name);
//		 */
//		
//		
//		
//		
//		int i=4;
//		int j=4;
//		
//		
//		// TODO Auto-generated method stub
//
////	    
//		
//		for(int i1=4 ;i1<10;i1++)
//		{
//			if(i1==7)
//				{
//				  break;
//				  
//				}
//			System.out.println(i1);
//			System.out.println();
//		}
//		
//		int[] num = {12,343,12,323,11};
//		for(int a: num)
//			
//		{
//			System.out.println(a);
//		}
//	}
//
//
//	public void Car() {
//		// TODO Auto-generated method stub
//		System.out.println("BMW");
//	}

}
	public void Car() {
		// TODO Auto-generated method stub
		
	}
}
