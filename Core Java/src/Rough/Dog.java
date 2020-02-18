package Rough;

 class Animal {
	 public  void m1()
		{
			System.out.println("Hello...");
		}
		//  method
		public void m2()
		{
			System.out.println("Hello tejaswini...");
		}
	
}

	 public  class Dog  extends Animal{  
		public void m3(){
		System.out.println("a method");
		}
		public  void m4()
		{
			System.out.println("Hello1 ...");
		}
		// method
		public void c1()
		{
			System.out.println("Hello vamsi...");
		}
		static void method(Animal a) {  
		       Dog d=(Dog)a;//downcasting  
		       System.out.println("ok downcasting performed");  
		  }  
		
		
		  
		/*class B extends Down{  
		public void b(){System.out.println("b method");}  
		}  
		*/
		/*class Call{  
		void invoke(Animal p){
				A a=(A)p;//Downcasting   
	              a.a();  
		}*/
	/*	
		B b=(B)p;//Downcasting   
		 b.b();
		} */ 
		  
		 
		//}
		//public	class Downcasting{  
			public static void main(String args[]){  
			//Down p=new B();  
				Animal a=new Dog();  
			    Dog.method(a);  
			   
		//	Call c=new Call();  
			//c.invoke(p);
			//c.invoke(p1);
		
			}  
			}  
