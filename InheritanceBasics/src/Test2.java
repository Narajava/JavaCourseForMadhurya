
public class Test2 {

	public static void main(String[] args) {
		
		GoodStudent goodStudent=new GoodStudent();
		goodStudent.read();
		goodStudent.visitLibrary();
		goodStudent.sleep();
		
		BadStudent badStudent=new BadStudent();
		badStudent.sleep();
		badStudent.watchMovies();
		

	}

}
