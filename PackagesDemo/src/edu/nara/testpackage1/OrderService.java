package edu.nara.testpackage1;

public class OrderService {
	
	private void createOrder() {
		System.out.println("OrderService.CreateOrder");
	}
	
	protected void updateOrder() {
		System.out.println("OrderService.UpdateOrder");
	}
	
	void deleteOrder() {
		System.out.println("OrderService.DeleteOrder");
	}
	
	void test() {
		createOrder();
	}
}
