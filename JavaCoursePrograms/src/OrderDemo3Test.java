
public class OrderDemo3Test {

	public static void main(String[] args) {
		Order order=new Order();
		order.setId(101);
		order.setProductId(11);
		//order.setProductName("Toys");
		//order.setQuantity(100);
		
		
		ObjectDemo3 objectDemo3=new ObjectDemo3();
		objectDemo3.showOrderDetails(order);
		
		objectDemo3.add(8);

	}

}
