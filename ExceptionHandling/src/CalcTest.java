
public class CalcTest {

	public static void main(String[] args) {
		Calc obj=new Calc();
		int divisionResult=0;
		try {
			divisionResult = obj.devide(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("divisionResult " +divisionResult);
        System.out.println("Done");
	}

}
