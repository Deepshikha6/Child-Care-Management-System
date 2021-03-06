/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.OrphanageEmployee;
import Business.Enterprise.Enterprise;
import Business.Organization.CaretakerOrganization;
import Business.Organization.Organization;
import Business.Role.CaretakerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author deeps
 */
public class AddChild extends javax.swing.JPanel {

    /**
     * Creates new form AddChild
     */
    private JPanel panelRight;
       private UserAccount userAccount;
    private Organization organization;
     private Enterprise enterprise;
    // private EcoSystem system;
    public AddChild(JPanel container, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        this.panelRight=container;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        //this.system = system;
        initComponents();
        Organization employeeOrganization= null;
         for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof CaretakerOrganization)
            {
                employeeOrganization = org;
            }
        }
        for (Employee e:employeeOrganization.getEmployeeDirectory().getEmployeeList()){
       empList.addItem(e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        childName = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        addChildBtn = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        empList = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(250, 150, 146));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Date of Birth");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Gender");

        addChildBtn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        addChildBtn.setText("Add Child");
        addChildBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChildBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Employee");

        empList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        empList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(male)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(empList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(female))
                            .addComponent(childName, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(dob)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addChildBtn)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(childName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(male))
                .addGap(17, 17, 17)
                .addComponent(female)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(empList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addChildBtn)
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                panelRight.remove(this);
                CardLayout cd = (CardLayout)panelRight.getLayout();
                cd.previous(panelRight);
                Component[] components = panelRight.getComponents();
                for(Component c: components)
                {
                 if(c instanceof AdminWorkArea)
               {
                   
                      AdminWorkArea awa = (AdminWorkArea)c;
                  for(Component d: awa.getComponents())
                  {
                      if(d instanceof JTabbedPane)
                      {
                           JTabbedPane tabs = (JTabbedPane) d;
                            Component current = tabs.getSelectedComponent();
                     
                      EmployeeMangement em = (EmployeeMangement)current;
                         em.populateTable();
                      }
                     
                }
         }
                }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addChildBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChildBtnActionPerformed
        // TODO add your handling code here:
        Employee em = (Employee) empList.getSelectedItem();
        OrphanageEmployee oe = (OrphanageEmployee)em;
        
        if(male.isSelected()){
        oe.addChild(childName.getText(),"Male",dob.getText());
        JOptionPane.showMessageDialog(null,"Child added to employee "+ em.getName());
        }
        if(female.isSelected()){
        oe.addChild(childName.getText(),"Female",dob.getText());
        JOptionPane.showMessageDialog(null,"Child added to employee "+ em.getName());
        }
    }//GEN-LAST:event_addChildBtnActionPerformed

    private void empListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empListActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_empListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addChildBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField childName;
    private javax.swing.JTextField dob;
    private javax.swing.JComboBox empList;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton male;
    // End of variables declaration//GEN-END:variables
}
