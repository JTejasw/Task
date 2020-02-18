package com.mits.corejava.collection;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet> {
          
	 private int empId;
     private String empName;
     private int empSal;

     public EmployeeTreeSet(int id, String name, int sal) {
         this.empId = id;
         this.empName = name;
         this.empSal = sal;
     }
     public void setEmpId(int empId) {
         this.empId = empId;
      }
     public void setEmpName(String empName) {
        this.empName = empName;
     }
     public void setEmpSal(int empSal) {
         this.empSal = empSal;
      }


     public int getEmpId() {
         return empId;
     }

     

     public String getEmpName() {
        return empName;
     }


     public int getEmpSal() {
        return empSal;
     }

    
     public String toString() {
        return empId + " : " + empName + " : " + empSal;
     }

    
    	
		public int compareTo(EmployeeTreeSet emp) {
			 if (this.empId == emp.getEmpId()) {
                 return 0;
             } else if (this.empId < emp.getEmpId()) {
                 return -1;
             }
             return 1;
			
		}
			
		


	

}
