package com.mits.corejava.Thread;
class T{  
		  
		 void printTable(int n){  
		   synchronized(this){//synchronized block  
		     for(int i=1;i<=5;i++){  
		      System.out.println(n*i);  
		      try{  
		       Thread.sleep(400);  
		      }catch(Exception e){System.out.println(e);}  
		     }  
		   }  
		 }//end of the method  
		}  
	  
		class MyTh1 extends Thread{  
		Table t=new Table();  
		
		public void run(){  
		t.printTable(5);  
		}  
		  
		}  
		class MyTh2 extends Thread{  
		Table t=new Table();
		public void run(){  
		t.printTable(100);  
		}  
		}  
		  
		public class SynchronizedDemoBlock{  
		public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyTh1 t1=new MyTh1();  
		MyTh2 t2=new MyTh2();  
		t1.start();  
		t2.start();  
		}  
		}  

