package edu.nara.testpackage1;

public class TestWIthInSamePackage {

	public static void main(String[] args) {
		
		OrderService orderService=new OrderService();
		orderService.deleteOrder();
		orderService.updateOrder();
		
		
		OrderService2 orderService2=new OrderService2();
		orderService2.deleteOrder();
		orderService2.updateOrder();
		

	}

}
