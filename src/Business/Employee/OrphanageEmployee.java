/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Child.Child;
import Business.Child.ChildDirectory;

/**
 *
 * @author deeps
 */
public class OrphanageEmployee extends Employee
{
    private ChildDirectory childrenList;

    public OrphanageEmployee() {
        super();
        childrenList = new ChildDirectory();
    }

    public ChildDirectory getChildrenList() {
        return childrenList;
    }
    
    public void addChild(String name,String gen, String dob)
    {
        childrenList.createChild(name, gen, dob);
    }
    
    public int getChildrenAssignedCount()
    {
        return this.childrenList.getChildList().size();
    }
}
