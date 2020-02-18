
package com.mits.corejava.serlization;

import java.io.*;

class Employee implements Externalizable {  
	 transient int id;  
	 String name;  
	 public Employee() {  
		 
		 }
	public Employee(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }
	
		@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=in.readInt();
			
		 name=(String) in.readObject();
		 
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}  
	
	}  

