package employee.view;

import employee.dao.EmployeeDao;
import employee.model.Employee;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EmployeeView extends javax.swing.JFrame {
    
    EmployeeDao dao = new EmployeeDao();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EmployeeView.class.getName());

    public EmployeeView() {
        initComponents();
        ShowAllEmployee();
    }
    
    public void ShowAllEmployee(){
        List<Employee> list = dao.showAll();
         
        DefaultTableModel model = new DefaultTableModel();
        String[] names= {"Id", "Name", "Email", "Phone", "Salary"};
        model.setColumnIdentifiers(names);
        
        tblEmployee.setModel(model);
        
        for(Employee e : list){
            model.addRow(new Object[]{e.getId(), e.getName(), e.getEmail(), e.getPhone(), e.getSalary()});
        
        }
        
    
    
    }
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEmpSave = new javax.swing.JButton();
        btnEmpUpdate = new javax.swing.JButton();
        btnEmpDelete = new javax.swing.JButton();
        txtEmpId = new javax.swing.JTextField();
        txtEmpName = new javax.swing.JTextField();
        txtEmpEmail = new javax.swing.JTextField();
        txtEmpSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmpPhone1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 614));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 614));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jPanel2.setBackground(new java.awt.Color(102, 114, 146));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE PERSONAL DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(141, 157, 182));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("SALARY");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("EMAIL");

        btnEmpSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmpSave.setText("SAVE");
        btnEmpSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpSaveMouseClicked(evt);
            }
        });

        btnEmpUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmpUpdate.setText("UPDATE");
        btnEmpUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpUpdateMouseClicked(evt);
            }
        });
        btnEmpUpdate.addActionListener(this::btnEmpUpdateActionPerformed);

        btnEmpDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmpDelete.setText("DELETE");
        btnEmpDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpDeleteMouseClicked(evt);
            }
        });
        btnEmpDelete.addActionListener(this::btnEmpDeleteActionPerformed);

        txtEmpName.addActionListener(this::txtEmpNameActionPerformed);

        txtEmpEmail.addActionListener(this::txtEmpEmailActionPerformed);

        txtEmpSalary.addActionListener(this::txtEmpSalaryActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PHONE");

        txtEmpPhone1.addActionListener(this::txtEmpPhone1ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpSave)
                        .addGap(36, 36, 36)
                        .addComponent(btnEmpUpdate)
                        .addGap(35, 35, 35)
                        .addComponent(btnEmpDelete)
                        .addGap(144, 144, 144))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmpPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpSave)
                    .addComponent(btnEmpUpdate)
                    .addComponent(btnEmpDelete)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "EMAIL", "PHONE", "SALARY"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpDeleteActionPerformed

    private void txtEmpSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpSalaryActionPerformed

    private void txtEmpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpEmailActionPerformed

    private void btnEmpUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpUpdateActionPerformed

    private void btnEmpSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpSaveMouseClicked
        Employee e = new Employee();

        e.setName(txtEmpName.getText());
        e.setEmail(txtEmpEmail.getText());
        e.setPhone(txtEmpSalary.getText());
        e.setSalary(Integer.parseInt(txtEmpSalary.getText()));

        EmployeeDao dao = new EmployeeDao();

        dao.saveEmployee(e);

    }//GEN-LAST:event_btnEmpSaveMouseClicked

    private void btnEmpUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpUpdateMouseClicked
        Employee e = new Employee();
        e.setName(txtEmpName.getText());
        e.setEmail(txtEmpEmail.getText());
        e.setPhone(txtEmpSalary.getText());
        e.setSalary(Integer.parseInt(txtEmpSalary.getText()));

        EmployeeDao dao = new EmployeeDao();

        dao.updateEmployee(e);

    }//GEN-LAST:event_btnEmpUpdateMouseClicked

    private void btnEmpDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpDeleteMouseClicked
        Employee e = new Employee();

        e.setId(Integer.parseInt(txtEmpId.getText()));

        EmployeeDao dao = new EmployeeDao();
        dao.deleteEmployee(e);
    }//GEN-LAST:event_btnEmpDeleteMouseClicked

    private void txtEmpPhone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpPhone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpPhone1ActionPerformed

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new EmployeeView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpDelete;
    private javax.swing.JButton btnEmpSave;
    private javax.swing.JButton btnEmpUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtEmpEmail;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpPhone1;
    private javax.swing.JTextField txtEmpSalary;
    // End of variables declaration//GEN-END:variables
}
