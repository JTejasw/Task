package com.mits.corejava.Thread;


	class Table{  
		 synchronized void printTable(int n){//synchronized method  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);
		     try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     }  
		}  
	}  
class MyThread1 extends Thread{  
		Table t;  
		MyThread1(Table t){  
		this.t=t;  
		}  
		public void run(){  
		 t.printTable(5);  
		System.out.println(Thread.currentThread().getName());
		}  
		  
		}  
class MyThread2 extends Thread{  
		Table t;  
		MyThread2(Table t){  
		this.t=t;  
		}  
		public void run(){
	
		t.printTable(100); 
		System.out.println(Thread.currentThread().getName());
		}  
		}  
		  
public class SynchronizedDemoMethod{  
		public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
		}  


