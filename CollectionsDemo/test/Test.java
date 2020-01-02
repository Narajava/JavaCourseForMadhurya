import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
      List<Integer> intList=new ArrayList<>();
      
      String val="2";
      //int value1=Integer.parseInt(val);
    //  Float.parseFloat(val);
      
      intList.add(new Integer(2));
      intList.add(3);
      double value=getSum(intList);
	}

	private static double getSum(List<? extends Number> intList) {
		
		intList.add(2,null);
		intList.add(3,null);
		
		intList.add(4,null);
		
		
		double sum=0;
		for(Number num:intList) {
			sum+=num.doubleValue();
		}
		
		return sum;
	}

}
