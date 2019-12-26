
public class OrderServiceImpl implements OrderService {

	@Override
	public void createOrder() {
	System.out.println("createOrder");
	}

	@Override
	public void updateOrder() {
		System.out.println("updateOrder");	
	}

	@Override
	public void deleteOrder() {
		System.out.println("deleteOrder");
	}
	
	public static void main(String[] args) {
		
		//OrderService orderService=new OrderService(); : CE
		//OrderServiceImpl orderService=new OrderServiceImpl(); : It is not recommended.
		OrderService orderService=new OrderServiceImpl();
		orderService.createOrder();
		
		
	}
	
}
