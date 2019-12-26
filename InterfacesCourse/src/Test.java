
public class Test {

	public static void main(String[] args) {
       OrderService orderService=new OrderServiceImpl2Child();
       orderService.createOrder();
       orderService.updateOrder();
       orderService.deleteOrder();
	}

}
