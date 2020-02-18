package com.mits.corejava.variables;



public class StaticType2 {
	
	public static String m1()
	{
		/* System.out.println(StaticType1.m1());//static to static(directly)
		 // System.out.println(m2());//static to static
		// StaticType1 obj = new StaticType1();
		 //System.out.println(obj.m4());//static to non-static(creating object)
		//StaticType1 obj1 = new StaticType1();
		 System.out.println(obj1.m3());//static to non-static
		StaticType2 obj2 = new StaticType2();
		System.out.println(obj2.m4());//static to non-static*/
		return "in static m1()";
	}
	public static String m2()
	{
		return "in static m2()";
	}
	public  String  m3()
     {       
		/*System.out.println( StaticType1.m1());////non static to static(directly) 
		System.out.println(m2());//non static to static (directly)*/
		return "in non-static m3()";
	}
	public String m4()
	{   
		System.out.println(m3());//non-static to non-static(without class name)
		StaticType1 obj1 = new StaticType1();
		System.out.println(obj1.m3()); //non-static to non-static(creating object) 
		return "in non-static m4()";
	}
	
	

}
