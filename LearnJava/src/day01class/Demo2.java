package day01class;

public class Demo2 {

	String s;
	int a ;
	
	Demo2(String s, int a)
	{
		this.s=s;
		this.a=a;
		
	}
	
	public static void main(String[] args) {
		
		Demo2 d= new Demo2("delson", 32);
		System.out.println(d.s);
		System.out.println(d.a);
		Demo2 d2= new Demo2("Geo", 34);
		System.out.println(d2.s);
		System.out.println(d2.a);
		

	}

}
