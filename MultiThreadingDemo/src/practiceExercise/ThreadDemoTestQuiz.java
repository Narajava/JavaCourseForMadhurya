package practiceExercise;

class ThreadDemo extends Thread 
{ 
    ThreadDemo() {} 
    ThreadDemo(Runnable r) {
    	Thread t=new Thread(r);
    	t.start();
    } 
    public void run() 
    { 
        System.out.print("Inside Thread ");
    } 
} 
class RunnableDemo implements Runnable 
{ 
    public void run() 
    { 
        System.out.print(" Inside Runnable"); 
    } 
} 
public class ThreadDemoTestQuiz 
{  
    public static void main(String[] args) 
    { 
        new ThreadDemo().start(); 
        new ThreadDemo(new RunnableDemo()).start(); 
    } 
} 