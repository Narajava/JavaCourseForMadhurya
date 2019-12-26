public class ThreadWaitTest 
{
    public static void main(String [] args) 
    {
    	
    	XYZ obj=new XYZ();
    	obj.start();
        System.out.print("1 ");
        synchronized(args)
        {
            System.out.print("2 ");
            try 
            {
                    args.wait(); /* Line 11 */
                    args.notify();
            }
            catch(InterruptedException e){ 
            	e.printStackTrace();
            }
        }
        System.out.print("3 ");
    }
}


class XYZ extends Thread{

	@Override
	public synchronized void run() {
		while(true) {
			notify();
		}
	}
	
	
}