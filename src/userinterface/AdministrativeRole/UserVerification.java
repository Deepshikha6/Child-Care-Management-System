/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.FosterParent;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AcceptDonationRequest;
import Business.WorkQueue.UserVerificationWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.UserRole.Email;

/**
 *
 * @author bhash
 */
public class UserVerification extends javax.swing.JPanel {

    /**
     * Creates new form UserVerification
     */
    private JPanel panelRight;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    public UserVerification(JPanel panelRight, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.panelRight = panelRight;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        populateTable();
        
    }
void populateTable()
{
    DefaultTableModel model = (DefaultTableModel) authorizeRequestQueueTable.getModel();
        
        model.setRowCount(0);
    for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            
            if(org.getName().equals("Admin Organization"))
        {
        
            
        for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            if(request instanceof UserVerificationWorkRequest)
            {
            Object[] row = new Object[4];
            row[0] = request;
            String result = ((UserVerificationWorkRequest) request).getTestResult();
            row[1] = result == null ? "Waiting" : result;
            row[2] = request.getSender();
            row[3] = request.getEmailID();
            
            model.addRow(row);
            }
        }
        }
}
}
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        authorizeRequestQueueTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 150, 146));

        authorizeRequestQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Waiting/Verified", "Sender", "Sender Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(authorizeRequestQueueTable);

        jButton2.setBackground(new java.awt.Color(250, 150, 146));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Verify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(635, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow =authorizeRequestQueueTable.getSelectedRow();
          if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select row");
        }
          else
          {
          
            UserVerificationWorkRequest  acceptRequest = (UserVerificationWorkRequest) authorizeRequestQueueTable.getValueAt(selectedRow, 0);
            acceptRequest.setTestResult("Confirmed");
            
            UserAccount  userAccount = (UserAccount)authorizeRequestQueueTable.getValueAt(selectedRow, 2);
            FosterParent fosterParent = (FosterParent)userAccount.getEmployee();
            fosterParent.setAccountVerified(true);
            
        String  emailUserSignup = (String)authorizeRequestQueueTable.getValueAt(selectedRow, 3);
        Email  em = new Email(emailUserSignup,"Your Email has been Verfied. Thank You For Your Patience. You Can Now login!");
        em.sendEmail();
        acceptRequest.setStatus("Accepted");
        
        populateTable();
 
          }   
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable authorizeRequestQueueTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
