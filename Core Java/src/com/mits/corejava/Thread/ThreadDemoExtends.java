package com.mits.corejava.Thread;
/**
 * @author mitsind759
 * Extending Thread Class
 */
public class ThreadDemoExtends extends Thread {//open class
	public void run() {//run method  for thread
		System.out.println("inside run() start");
		
		System.out.println("thread1 in running method");
		run1();//classing method

		System.out.println("inside run - Thread Name : "+Thread.currentThread().getName());
		System.out.println("inside run - Thread Id : "+Thread.currentThread().getId());
		System.out.println("inside run - Thread Priority : "+Thread.currentThread().getPriority());
		System.out.println("inside run() end");
	}
	public void run1() {//run method  general method
		System.out.println("thread in run1 method");
	}
	public static void main(String[] args) {//main
        System.out.println("inside main...start");
		System.out.println("inside main - Thread Name : "+Thread.currentThread().getName());
		System.out.println("inside main - Thread Id : "+Thread.currentThread().getId());
		System.out.println("inside main - Thread Priority : "+Thread.currentThread().getPriority());
		
		ThreadDemoExtends td = new ThreadDemoExtends();//creating object
		td.start();//using start method
		
		System.out.println("inside main() end");
		

	}
}//end class
