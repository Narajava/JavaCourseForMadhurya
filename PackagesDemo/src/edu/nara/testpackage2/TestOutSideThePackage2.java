package edu.nara.testpackage2;

import edu.nara.testpackage1.OrderService;

public class TestOutSideThePackage2 extends OrderService {

	public static void main(String[] args) {
		
		OrderService orderService=new OrderService();
	//	orderService.deleteOrder();
	//	orderService.updateOrder();
		
		TestOutSideThePackage2 obj=new TestOutSideThePackage2();
		obj.updateOrder();
		
		/*OrderService2 orderService2=new OrderService2();
		orderService2.deleteOrder();
		orderService2.updateOrder();*/
		

	}

}
