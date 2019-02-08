/*
 * To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Business.Employee;

import Business.Child.Child;

/**
*
* @author deeps
*/
public class FosterParent extends Employee
{
   Child fosterChild;
   boolean accountVerified;
   boolean adopt;

   public FosterParent() {
       super();
       fosterChild = null;
       accountVerified = false;
       adopt=false;
   }

   public void assignFosterChild(Child child)
   {
       if(fosterChild == null)
       {
           fosterChild = child;
           fosterChild.assignFosterParent(this);
       }
   }

    public boolean isAccountVerified() {
        return accountVerified;
    }

    public void setAccountVerified(boolean accountVerified) {
        this.accountVerified = accountVerified;
    }

   public Child getFosterChild()
   {
       return this.fosterChild;
   }

    public boolean isAdopt() {
        return adopt;
    }

    public void setAdopt(boolean adopt) {
        this.adopt = adopt;
    }
   
   
}