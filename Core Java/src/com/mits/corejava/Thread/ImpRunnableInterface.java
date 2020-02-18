package com.mits.corejava.Thread;

public class ImpRunnableInterface implements Runnable {
	public void run() {
	     System.out.println("inside run start");
			
			for(int i=0; i<10; i++) {
				
				System.out.println(Thread.currentThread().getName()+"\t"+i);
			}
				
			
			System.out.println("inside run end");
	}
public static void main(String[] args) {
		ImpRunnableInterface iri=new ImpRunnableInterface();
		Thread t = new Thread(iri);
		 t.start(); 
		Thread t1 = new Thread(iri,"PrintNumbers Thread");
		
		//implicitly invokes run() method
         t1.start();
		System.out.println("main thread end...");
	}

	
	
	
	

}
