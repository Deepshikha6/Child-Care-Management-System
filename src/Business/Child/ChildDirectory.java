/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deeps
 */
public class ChildDirectory {
    private List<Child> childList;

    public ChildDirectory() {
        childList = new ArrayList<Child>();
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }
   public Child createChild(String name,String gen, String dob){
        Child child1 = new Child();
        child1.setName(name);
       // child1.setStatus(status);
        child1.setGender(gen);
        child1.setDob(dob);
        childList.add(child1);
        return child1;
    } 
}
