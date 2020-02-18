package com.mits.corejava.Thread;

public class DemonstrateThread {

	public static void main(String[] args) {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Thread Id : "+Thread.currentThread().getId());
		try  
        {  
            Thread.sleep(500);  
        }catch(InterruptedException e){
        	System.out.println(e);
        	} 
		
		System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
		
		System.out.println("Thread Norm Priority : "+Thread.NORM_PRIORITY);
			

	}

}
