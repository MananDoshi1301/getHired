/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;



import models.EmployeeSignUp2_db;


/**
 *
 * @author astrodist
 */
public class EmployeeSignUp2 extends javax.swing.JFrame {

//    static EmployeeSignUp1_db ep;
    

    /**
     * Creates new form EmployeeSignUp2
     */
    public EmployeeSignUp2() {
        initComponents();
        
    }

    EmployeeSignUp2(String fname, String lname, String hireexp, String jobtitle, String tel, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        EmployeeSignUp2_qualification_combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EmployeeSignUp2_institute_textfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EmployeeSignUp2_score_textfield = new javax.swing.JTextField();
        EmployeeSignUp2_completionyear_textfield = new javax.swing.JTextField();
        EmployeeSignUp2_error_textfield = new javax.swing.JLabel();
        EmployeeSignUp2_degree_combobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);

        jLabel3.setBackground(java.awt.Color.black);
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("  Qualifications");
        jLabel3.setToolTipText("");

        jButton1.setBackground(java.awt.Color.black);
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setLabel("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Next");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton2FocusLost(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        EmployeeSignUp2_qualification_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "SSC", "HSC", "Graduate", "Post-Graduate", "Diploma", "PhD" }));
        EmployeeSignUp2_qualification_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSignUp2_qualification_comboboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel1.setText("Most Relevant Qualification:");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel2.setText("Name of Degree obtained:");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel4.setText("Name of Institution:");
        jLabel4.setToolTipText("");

        EmployeeSignUp2_institute_textfield.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        EmployeeSignUp2_institute_textfield.setToolTipText("");
        EmployeeSignUp2_institute_textfield.setActionCommand("<Not Set>");
        EmployeeSignUp2_institute_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSignUp2_institute_textfieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel5.setText("Year of Completion:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel6.setText("Score Obtained (CGPA):");
        jLabel6.setToolTipText("");

        EmployeeSignUp2_score_textfield.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        EmployeeSignUp2_score_textfield.setToolTipText("");
        EmployeeSignUp2_score_textfield.setActionCommand("<Not Set>");
        EmployeeSignUp2_score_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSignUp2_score_textfieldActionPerformed(evt);
            }
        });

        EmployeeSignUp2_completionyear_textfield.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        EmployeeSignUp2_completionyear_textfield.setToolTipText("");
        EmployeeSignUp2_completionyear_textfield.setActionCommand("<Not Set>");
        EmployeeSignUp2_completionyear_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSignUp2_completionyear_textfieldActionPerformed(evt);
            }
        });

        EmployeeSignUp2_error_textfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EmployeeSignUp2_degree_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Bachelor of Architecture", "Bachelor of Science", "Bachelor of Business Administration", "Bachelor of Commerce", "Bachelor of Computer Information Systems", "Bachelor of Criminal Justice", "Bachelor of Engineering", "Bachelor of Arts", "Master of Accountancy", "Master of Applied Science", "Master of Arts", "Master of Business Administration", "Master of Commerce", "Master of IT" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 245, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmployeeSignUp2_error_textfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeSignUp2_qualification_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmployeeSignUp2_institute_textfield)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(EmployeeSignUp2_completionyear_textfield, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmployeeSignUp2_score_textfield, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(EmployeeSignUp2_degree_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeSignUp2_qualification_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeSignUp2_institute_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmployeeSignUp2_degree_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeSignUp2_completionyear_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeSignUp2_score_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmployeeSignUp2_error_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EmployeeSignUp1 sp = new EmployeeSignUp1();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EmployeeSignUp2_qualification_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSignUp2_qualification_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeSignUp2_qualification_comboboxActionPerformed

    private void EmployeeSignUp2_institute_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSignUp2_institute_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeSignUp2_institute_textfieldActionPerformed

    private void EmployeeSignUp2_score_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSignUp2_score_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeSignUp2_score_textfieldActionPerformed

    private void EmployeeSignUp2_completionyear_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSignUp2_completionyear_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeSignUp2_completionyear_textfieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String institute, degreename, year, score, error = "";
        String qualification = EmployeeSignUp2_qualification_combobox.getSelectedItem().toString();
        institute = EmployeeSignUp2_institute_textfield.getText();
        degreename = EmployeeSignUp2_degree_combobox.getSelectedItem().toString();
        year = EmployeeSignUp2_completionyear_textfield.getText();
        score = EmployeeSignUp2_score_textfield.getText();
        
        
        boolean numeric2 = true;
        try {
            Double num2 = Double.parseDouble(year);
        }catch (NumberFormatException e) {
                numeric2 = false;
        }
        
        boolean numeric1 = true;
        try {
            Double num1 = Double.parseDouble(score);
        }catch (NumberFormatException e) {
                numeric1 = false;
        }
        
        if(qualification == "None" || institute.isEmpty() || degreename == "None" || year.isEmpty() || score.isEmpty()){
            error = "Please fill all the fields";
        }
        else if(numeric2 == false){
                   error = "Enter only numeric values for completion of year";
        }
        else if(numeric1 == false){
                   error = "Enter only numeric values for score";
        }
        
        
        if(error.isEmpty()){               

            EmployeeSignUp2_db ep1 = new EmployeeSignUp2_db(qualification, institute, degreename, year, score);
            EmployeeSignUp3.EmployeeSignUp2_db = ep1;
            
            EmployeeSignUp3 sp = new EmployeeSignUp3();
            sp.setVisible(true);
            this.dispose();
        }
        else{
            EmployeeSignUp2_error_textfield.setText(error);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusLost
        // TODO add your handling code here:
        EmployeeSignUp2_error_textfield.setText("");
    }//GEN-LAST:event_jButton2FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeSignUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSignUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSignUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSignUp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSignUp2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmployeeSignUp2_completionyear_textfield;
    private javax.swing.JComboBox<String> EmployeeSignUp2_degree_combobox;
    private javax.swing.JLabel EmployeeSignUp2_error_textfield;
    private javax.swing.JTextField EmployeeSignUp2_institute_textfield;
    private javax.swing.JComboBox<String> EmployeeSignUp2_qualification_combobox;
    private javax.swing.JTextField EmployeeSignUp2_score_textfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
