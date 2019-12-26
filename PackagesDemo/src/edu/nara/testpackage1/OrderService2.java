package edu.nara.testpackage1;

class OrderService2 {
	
	public void createOrder() {
		System.out.println("OrderService2.CreateOrder");
	}
	
	protected void updateOrder() {
		System.out.println("OrderService2.UpdateOrder");
	}
	
	void deleteOrder() {
		System.out.println("OrderService2.DeleteOrder");
	}
	
	void test() {
		createOrder();
	}
}
