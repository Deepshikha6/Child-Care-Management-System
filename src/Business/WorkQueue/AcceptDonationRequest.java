/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author bhash
 */
public class AcceptDonationRequest extends WorkRequest {
 
     private String donationAcceptanceResult;

    public String getTestResult() {
        return donationAcceptanceResult;
    }

    public void setTestResult(String donationAcceptanceResult) {
        this.donationAcceptanceResult = donationAcceptanceResult;
    }

   

    
    
}
