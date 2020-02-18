package com.mits.corejava.abstractdemo;

abstract class Animal{
	 String name;
abstract  void getName();
abstract  void makeNoise();

}
 class Dog extends Animal
{

	@Override
	void getName() {
		System.out.println(" animal name is dog ");
		
	}

	@Override
	void makeNoise() {
		System.out.println("dog makes noise barks");
		
	}
	
	
}
class Cat extends Animal
{

	@Override
	void getName() {
		System.out.println(" animal name is cat ");
		
	}

	@Override
	void makeNoise() {
		System.out.println("dog makes noise meow");
		
		
	}
	

	
	
}
public class AnimalAdstract {
	

	public static void main(String[] args) {
		 Animal objanimal =new Dog();
		 objanimal.getName();
		 objanimal.makeNoise();
		  objanimal =new Cat();
		 objanimal.getName();
		 objanimal.makeNoise();
		 Dog objdog =new Dog();
		 objdog.getName();
		objdog.makeNoise();
		 Cat objcat =new Cat();
		 objcat.getName();
		objcat.makeNoise();
	
	}

}
