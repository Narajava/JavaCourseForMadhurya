
public class Demo4 {

	  CheckPointService service;
	//CheckPointService service=new CheckPointService();

	public void caller() {
		//if (service != null) {
			service.add();
	//}

	}

	public static void main(String[] args) {
		Demo4 demo4 = new Demo4();
		try {
			demo4.caller();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException e");
			e.printStackTrace();
		}
		System.out.println("Hi");
	}

}
