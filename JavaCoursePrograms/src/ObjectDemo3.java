
public class ObjectDemo3 {
	
	public void showOrderDetails(Order order) {
		System.out.println("******Order Details******");
		System.out.println("Order Id "+order.id);
		System.out.println("Product Id "+order.productId);
		System.out.println("Product Name "+order.getProductName());
		System.out.println("Quantity "+order.getQuantity());
	}
	
	public void add(int a) {
		System.out.println("Printing a "+a);
	}

}
