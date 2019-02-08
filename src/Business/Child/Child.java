/*
 * To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Business.Child;

import Business.Employee.Employee;

/**
*
* @author deeps
*/
public class Child {
   private String name;
   private Employee fosterParent;

   @Override
   public String toString() {
       return this.name; //To change body of generated methods, choose Tools | Templates.
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getDob() {
       return dob;
   }

   public void setDob(String dob) {
       this.dob = dob;
   }

   public String getGender() {
       return gender;
   }

   public void setGender(String gender) {
       this.gender = gender;
   }

   public String getStatus() {
       return status;
   }

   public void assignFosterParent(Employee fosterParent)
   {
       if(this.fosterParent==null)
       {
           this.fosterParent = fosterParent;
       }
   }

   public Employee getFosterParent()
   {
       return this.fosterParent;
   }

   public void setStatus(String status) {
       this.status = status;
   }
   private String dob;
   private String gender;
   private String status;
}