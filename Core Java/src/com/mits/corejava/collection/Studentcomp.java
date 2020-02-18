package com.mits.corejava.collection;

import java.util.*;

public class Studentcomp {    
   int rollno;    
   String name;    
  int age;    
    Studentcomp(int rollno,String name,int age){    
    this.rollno=rollno;    
    this.name=name;    
    this.age=age;    
    }  
  
    public int getRollno() {  
        return rollno;  
    }  
  
    public void setRollno(int rollno) {  
        this.rollno = rollno;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
  
    }    


 
  class TestSort1{    
  public static void main(String args[]){    
  ArrayList<Studentcomp> al=new ArrayList<Studentcomp>();    
  al.add(new Studentcomp(101,"Vijay",23));    
  al.add(new Studentcomp(106,"Ajay",27));    
  al.add(new Studentcomp(105,"Jai",21));   
//Sorting elements on the basis of name  
  Comparator<Studentcomp> cm1=Comparator.comparing(Studentcomp::getName);  
   Collections.sort(al,cm1);  
   
   System.out.println("Sorting by Name");  
   
     for(Studentcomp st: al){  
     System.out.println(st.rollno+" "+st.name+" "+st.age);  
     }  
   //Sorting elements on the basis of age  
    Comparator<Studentcomp> cm2=Comparator.comparing(Studentcomp::getAge);  
Collections.sort(al,cm2);  
   System.out.println("Sorting by Age");  
   for(Studentcomp st: al){  
     System.out.println(st.rollno+" "+st.name+" "+st.age);  
     }    
  }    
  }    