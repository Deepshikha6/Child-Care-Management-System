/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.OrphanageEmployee;

/**
 *
 * @author bhash
 */
public class ChangeEnterpriseRequest extends WorkRequest {
 
      private String changeEnterpriseResult;
      private OrphanageEmployee orphanEmployee;

    public OrphanageEmployee getOrphanEmployee() {
        return orphanEmployee;
    }

    public void setOrphanEmployee(OrphanageEmployee orphanEmployee) {
        this.orphanEmployee = orphanEmployee;
    }
      
    public String getTestResult() {
        return changeEnterpriseResult;
    }

    public void setTestResult(String changeEnterpriseResult) {
        this.changeEnterpriseResult = changeEnterpriseResult;
    }

    
    
    
}
