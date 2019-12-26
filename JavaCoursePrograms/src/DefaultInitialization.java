
public class DefaultInitialization {
	
	byte b;
	
	static short s;
	
	static int a;
	
	long l;
	
	float f;
	
	double d;
	
	char c;
	
	boolean flag;
	
	String str;
	
	HelloWorld obj2;
	
	

	public static void main(String[] args) {
		
		//int x;
		//System.out.println(x); 
		
		
		DefaultInitialization obj=new DefaultInitialization();
		System.out.println("byte default value "+obj.b);
		System.out.println("short default value "+obj.s);
		System.out.println("int default value "+obj.a);
		System.out.println("long default value "+obj.l);
		System.out.println("float default value "+obj.f);
		System.out.println("double default value "+obj.d);
		System.out.println("char default value "+obj.c);
		System.out.println("boolean default value "+obj.flag);
		System.out.println("String default value "+obj.str);
		System.out.println("HelloWorld default value "+obj.obj2);
	}

}
