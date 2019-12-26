
public class ThisDemo1 {
	
	int id=10;
	
	public void pirntValues(int id) {
		System.out.println(id);
		System.out.println(this.id);
	}
	
	public static void main(String[] args) {
		ThisDemo1 obj=new ThisDemo1();
		obj.pirntValues(15);
	}

}
