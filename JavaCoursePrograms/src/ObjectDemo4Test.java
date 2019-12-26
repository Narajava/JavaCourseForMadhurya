
public class ObjectDemo4Test {

	public static void main(String[] args) {
		ObjectDemo4 objectDemo4=new ObjectDemo4();
		Order order=objectDemo4.getOrderDetails();
		
		System.out.println("******Order Details******");
		System.out.println("Order Id "+order.id);
		System.out.println("Product Id "+order.productId);
		System.out.println("Product Name "+order.getProductName());
		System.out.println("Quantity "+order.getQuantity());
		

	}

}
