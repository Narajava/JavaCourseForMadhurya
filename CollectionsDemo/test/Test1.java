import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		List<String> strList=new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		
		System.out.println();
		strList.add(1,"d");
		
		System.out.println(strList);
		
		
		HashSet<String> strSet=new HashSet<>();
		strSet.add("a");
		strSet.add("b");
		strSet.add("c");
		
		System.out.println();
		//strSet.add(1,"d");
		
		System.out.println(strSet);

	}

}
