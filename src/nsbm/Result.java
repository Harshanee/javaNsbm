/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Harshanee
 */
public class Result extends javax.swing.JFrame {

    ResultMake rm = new ResultMake();
    DBOperation dbops = new DBOperation();
    //ArrayList<Undergraduate> rList;

    String s1;

    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        //loadResult();

    }

    //void loadResult() {
    // rList = dbops.getResultsdetails();
    //UndergraduateDetails und1 = new UndergraduateDetails(rList);
    //tblUndergraduate.setModel(und1);
    //}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtSub11 = new javax.swing.JTextField();
        txtSub12 = new javax.swing.JTextField();
        txtSub13 = new javax.swing.JTextField();
        txtOSub11 = new javax.swing.JTextField();
        txtOSub12 = new javax.swing.JTextField();
        txtOSub13 = new javax.swing.JTextField();
        txtOSub14 = new javax.swing.JTextField();
        txtMMark11 = new javax.swing.JTextField();
        txtMMark12 = new javax.swing.JTextField();
        txtMMark13 = new javax.swing.JTextField();
        txtMark11 = new javax.swing.JTextField();
        txtMark12 = new javax.swing.JTextField();
        txtMark13 = new javax.swing.JTextField();
        txtMark14 = new javax.swing.JTextField();
        txtMCr11 = new javax.swing.JTextField();
        txtMCr12 = new javax.swing.JTextField();
        txtMCr13 = new javax.swing.JTextField();
        txtCr11 = new javax.swing.JTextField();
        txtCr12 = new javax.swing.JTextField();
        txtCr13 = new javax.swing.JTextField();
        txtCr14 = new javax.swing.JTextField();
        txtRegId = new javax.swing.JTextField();
        btnCalculateGpa = new javax.swing.JButton();
        txtGpa = new javax.swing.JTextField();
        btnAddResult = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        txtSub11.setEditable(false);

        txtSub12.setEditable(false);

        txtSub13.setEditable(false);

        txtOSub11.setEditable(false);

        txtOSub12.setEditable(false);

        txtOSub13.setEditable(false);

        txtOSub14.setEditable(false);

        txtMark12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMark12ActionPerformed(evt);
            }
        });

        txtMCr11.setEditable(false);

        txtMCr12.setEditable(false);

        txtMCr13.setEditable(false);

        txtCr11.setEditable(false);

        txtCr12.setEditable(false);
        txtCr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCr12ActionPerformed(evt);
            }
        });

        txtCr13.setEditable(false);

        txtCr14.setEditable(false);

        txtRegId.setEditable(false);

        btnCalculateGpa.setBackground(new java.awt.Color(102, 153, 255));
        btnCalculateGpa.setText("Calculate GPA");
        btnCalculateGpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateGpaActionPerformed(evt);
            }
        });

        txtGpa.setEditable(false);

        btnAddResult.setBackground(new java.awt.Color(102, 153, 255));
        btnAddResult.setText("Add Result");
        btnAddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRegId)
                            .addComponent(txtOSub14, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(txtOSub13)
                            .addComponent(txtOSub12)
                            .addComponent(txtOSub11)
                            .addComponent(txtSub11)
                            .addComponent(txtSub12)
                            .addComponent(txtSub13))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMMark12)
                                    .addComponent(txtMMark11)
                                    .addComponent(txtMark11)
                                    .addComponent(txtMMark13))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMark12)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMark13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMark14))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalculateGpa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCr11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txtCr12)
                            .addComponent(txtCr13)
                            .addComponent(txtCr14)
                            .addComponent(txtMCr12)
                            .addComponent(txtMCr11)
                            .addComponent(txtMCr13))
                        .addGap(119, 119, 119))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddResult)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtRegId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSub11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMMark11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMCr11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSub12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMMark12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMCr12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSub13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMMark13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMCr13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOSub11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMark11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCr11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOSub12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMark12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCr12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOSub13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMark13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCr13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOSub14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMark14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCr14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalculateGpa)))
                .addGap(74, 74, 74)
                .addComponent(btnAddResult)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void clearFields() {
        txtMMark11.setText("");
        txtMMark12.setText("");
        txtMMark13.setText("");
        txtMark11.setText("");
        txtMark12.setText("");
        txtMark13.setText("");
        txtMark14.setText("");
        txtGpa.setText("");
    }

    private void txtMark12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMark12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMark12ActionPerformed

    private void txtCr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCr12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCr12ActionPerformed

    private void btnAddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddResultActionPerformed
        ResultMake r = new ResultMake();
        Result r1 = new Result();
        r.setRegid((txtRegId.getText()));
        r.setMmark11((txtMMark11.getText()));
        r.setMmark12((txtMMark12.getText()));
        r.setMmark13((txtMMark13.getText()));
        r.setMark11((txtMark11.getText()));
        r.setMark12((txtMark12.getText()));
        r.setMark13((txtMark13.getText()));
        r.setMark14((txtMark14.getText()));
        r.setGpa(txtGpa.getText());

        boolean result = dbops.addResult(r);

        if (result) {
            JOptionPane.showMessageDialog(this, "Sucessfully Inserted!!");
            clearFields();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Already Exits RegID"+ txtRegId.getText()+"  Details.");
            clearFields();
            this.dispose();
        }

        
    }//GEN-LAST:event_btnAddResultActionPerformed

    private void btnCalculateGpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateGpaActionPerformed
        double g1 = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0, g6 = 0, g7 = 0, g = 0;

        if ("A+".equals(txtMMark11.getText())) {
            g1 = 4.25 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("A".equals(txtMMark11.getText())) {
            g1 = 4.00 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("A-".equals(txtMMark11.getText())) {
            g1 = 3.75 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("B+".equals(txtMMark11.getText())) {
            g1 = 3.25 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("B".equals(txtMMark11.getText())) {
            g1 = 3.00 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("B-".equals(txtMMark11.getText())) {
            g1 = 2.75 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("C+".equals(txtMMark11.getText())) {
            g1 = 2.25 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("C".equals(txtMMark11.getText())) {
            g1 = 2.00 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("C-".equals(txtMMark11.getText())) {
            g1 = 1.75 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("D+".equals(txtMMark11.getText())) {
            g1 = 1.25 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("D".equals(txtMMark11.getText())) {
            g1 = 1.00 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("D-".equals(txtMMark11.getText())) {
            g1 = 0.75 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("E".equals(txtMMark11.getText())) {
            g1 = 0 * Integer.parseInt(txtMCr11.getText());

        }
        else if ("F".equals(txtMMark11.getText())) {
            g1 = 0 * Integer.parseInt(txtMCr11.getText());

        }
        
        
         if ("A+".equals(txtMMark12.getText())) {
            g2 = 4.25 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("A".equals(txtMMark12.getText())) {
            g2 = 4.00 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("A-".equals(txtMMark12.getText())) {
            g2 = 3.75 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("B+".equals(txtMMark12.getText())) {
            g2 = 3.25 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("B".equals(txtMMark12.getText())) {
            g2 = 3.00 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("B-".equals(txtMMark12.getText())) {
            g2 = 2.75 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("C+".equals(txtMMark12.getText())) {
            g2 = 2.25 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("C".equals(txtMMark12.getText())) {
            g2 = 2.00 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("C-".equals(txtMMark12.getText())) {
            g2 = 1.75 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("D+".equals(txtMMark12.getText())) {
            g2 = 1.25 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("D".equals(txtMMark12.getText())) {
            g2 = 1.00 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("D-".equals(txtMMark12.getText())) {
            g2 = 0.75 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("E".equals(txtMMark12.getText())) {
            g2 = 0 * Integer.parseInt(txtMCr12.getText());

        }
        else if ("F".equals(txtMMark12.getText())) {
            g2 = 0 * Integer.parseInt(txtMCr12.getText());

        }
        

        
         if ("A+".equals(txtMMark13.getText())) {
            g3 = 4.25 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("A".equals(txtMMark13.getText())) {
            g3 = 4.00 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("A-".equals(txtMMark13.getText())) {
            g3 = 3.75 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("B+".equals(txtMMark13.getText())) {
            g3 = 3.25 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("B".equals(txtMMark13.getText())) {
            g3 = 3.00 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("B-".equals(txtMMark13.getText())) {
            g3 = 2.75 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("C+".equals(txtMMark13.getText())) {
            g3 = 2.25 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("C".equals(txtMMark13.getText())) {
            g3 = 2.00 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("C-".equals(txtMMark13.getText())) {
            g3 = 1.75 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("D+".equals(txtMMark13.getText())) {
            g3 = 1.25 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("D".equals(txtMMark13.getText())) {
            g3 = 1.00 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("D-".equals(txtMMark13.getText())) {
            g3 = 0.75 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("E".equals(txtMMark13.getText())) {
            g3 = 0 * Integer.parseInt(txtMCr13.getText());

        }
        else if ("F".equals(txtMMark13.getText())) {
            g3 = 0 * Integer.parseInt(txtMCr13.getText());

        } 

        
         
         if ("A+".equals(txtMark11.getText())) {
            g4 = 4.25 * Integer.parseInt(txtCr11.getText());

        }
        else if ("A".equals(txtMark11.getText())) {
            g4 = 4.00 * Integer.parseInt(txtCr11.getText());

        }
        else if ("A-".equals(txtMark11.getText())) {
            g4 = 3.75 * Integer.parseInt(txtCr11.getText());

        }
        else if ("B+".equals(txtMark11.getText())) {
            g4 = 3.25 * Integer.parseInt(txtCr11.getText());

        }
        else if ("B".equals(txtMark11.getText())) {
            g4 = 3.00 * Integer.parseInt(txtCr11.getText());

        }
        else if ("B-".equals(txtMark11.getText())) {
            g4 = 2.75 * Integer.parseInt(txtCr11.getText());

        }
        else if ("C+".equals(txtMark11.getText())) {
            g4 = 2.25 * Integer.parseInt(txtCr11.getText());

        }
        else if ("C".equals(txtMark11.getText())) {
            g4 = 2.00 * Integer.parseInt(txtCr11.getText());

        }
        else if ("C-".equals(txtMark11.getText())) {
            g4 = 1.75 * Integer.parseInt(txtCr11.getText());

        }
        else if ("D+".equals(txtMark11.getText())) {
            g4 = 1.25 * Integer.parseInt(txtCr11.getText());

        }
        else if ("D".equals(txtMark11.getText())) {
            g4 = 1.00 * Integer.parseInt(txtCr11.getText());

        }
        else if ("D-".equals(txtMark11.getText())) {
            g4 = 0.75 * Integer.parseInt(txtCr11.getText());

        }
        else if ("E".equals(txtMark11.getText())) {
            g4 = 0 * Integer.parseInt(txtCr11.getText());

        }
        else if ("F".equals(txtMark11.getText())) {
            g4 = 0 * Integer.parseInt(txtCr11.getText());

        } 

        
         
         if ("A+".equals(txtMark12.getText())) {
            g5 = 4.25 * Integer.parseInt(txtCr12.getText());

        }
        else if ("A".equals(txtMark12.getText())) {
            g5 = 4.00 * Integer.parseInt(txtCr12.getText());

        }
        else if ("A-".equals(txtMark12.getText())) {
            g5 = 3.75 * Integer.parseInt(txtCr12.getText());

        }
        else if ("B+".equals(txtMark12.getText())) {
            g5 = 3.25 * Integer.parseInt(txtCr12.getText());

        }
        else if ("B".equals(txtMark12.getText())) {
            g5 = 3.00 * Integer.parseInt(txtCr12.getText());

        }
        else if ("B-".equals(txtMark12.getText())) {
            g5 = 2.75 * Integer.parseInt(txtCr12.getText());

        }
        else if ("C+".equals(txtMark12.getText())) {
            g5 = 2.25 * Integer.parseInt(txtCr12.getText());

        }
        else if ("C".equals(txtMark12.getText())) {
            g5 = 2.00 * Integer.parseInt(txtCr12.getText());

        }
        else if ("C-".equals(txtMark12.getText())) {
            g5 = 1.75 * Integer.parseInt(txtCr12.getText());

        }
        else if ("D+".equals(txtMark12.getText())) {
            g5 = 1.25 * Integer.parseInt(txtCr12.getText());

        }
        else if ("D".equals(txtMark12.getText())) {
            g5 = 1.00 * Integer.parseInt(txtCr12.getText());

        }
        else if ("D-".equals(txtMark12.getText())) {
            g5 = 0.75 * Integer.parseInt(txtCr12.getText());

        }
        else if ("E".equals(txtMark12.getText())) {
            g5 = 0 * Integer.parseInt(txtCr12.getText());

        }
        else if ("F".equals(txtMark12.getText())) {
            g5 = 0 * Integer.parseInt(txtCr12.getText());

        }
         

         
        if ("A+".equals(txtMark13.getText())) {
            g6 = 4.25 * Integer.parseInt(txtCr13.getText());

        }
        else if ("A".equals(txtMark13.getText())) {
            g6 = 4.00 * Integer.parseInt(txtCr13.getText());

        }
        else if ("A-".equals(txtMark13.getText())) {
            g6 = 3.75 * Integer.parseInt(txtCr13.getText());

        }
        else if ("B+".equals(txtMark13.getText())) {
            g6 = 3.25 * Integer.parseInt(txtCr13.getText());

        }
        else if ("B".equals(txtMark13.getText())) {
            g6 = 3.00 * Integer.parseInt(txtCr13.getText());

        }
        else if ("B-".equals(txtMark13.getText())) {
            g6 = 2.75 * Integer.parseInt(txtCr13.getText());

        }
        else if ("C+".equals(txtMark13.getText())) {
            g6 = 2.25 * Integer.parseInt(txtCr13.getText());

        }
        else if ("C".equals(txtMark13.getText())) {
            g6 = 2.00 * Integer.parseInt(txtCr13.getText());

        }
        else if ("C-".equals(txtMark13.getText())) {
            g6 = 1.75 * Integer.parseInt(txtCr13.getText());

        }
        else if ("D+".equals(txtMark13.getText())) {
            g6 = 1.25 * Integer.parseInt(txtCr13.getText());

        }
        else if ("D".equals(txtMark13.getText())) {
            g6 = 1.00 * Integer.parseInt(txtCr13.getText());

        }
        else if ("D-".equals(txtMark13.getText())) {
            g6 = 0.75 * Integer.parseInt(txtCr13.getText());

        }
        else if ("E".equals(txtMark13.getText())) {
            g6 = 0 * Integer.parseInt(txtCr13.getText());

        }
        else if ("F".equals(txtMark13.getText())) {
            g6 = 0 * Integer.parseInt(txtCr13.getText());

        }  
       
        

        if ("A+".equals(txtMark14.getText())) {
            g7 = 4.25 * Integer.parseInt(txtCr14.getText());

        }
        else if ("A".equals(txtMark14.getText())) {
            g7 = 4.00 * Integer.parseInt(txtCr14.getText());

        }
        else if ("A-".equals(txtMark14.getText())) {
            g7 = 3.75 * Integer.parseInt(txtCr14.getText());

        }
        else if ("B+".equals(txtMark14.getText())) {
            g7 = 3.25 * Integer.parseInt(txtCr14.getText());

        }
        else if ("B".equals(txtMark14.getText())) {
            g7 = 3.00 * Integer.parseInt(txtCr14.getText());

        }
        else if ("B-".equals(txtMark14.getText())) {
            g7 = 2.75 * Integer.parseInt(txtCr14.getText());

        }
        else if ("C+".equals(txtMark14.getText())) {
            g7 = 2.25 * Integer.parseInt(txtCr14.getText());

        }
        else if ("C".equals(txtMark14.getText())) {
            g7 = 2.00 * Integer.parseInt(txtCr14.getText());

        }
        else if ("C-".equals(txtMark14.getText())) {
            g7 = 1.75 * Integer.parseInt(txtCr14.getText());

        }
        else if ("D+".equals(txtMark14.getText())) {
            g7 = 1.25 * Integer.parseInt(txtCr14.getText());

        }
        else if ("D".equals(txtMark14.getText())) {
            g7 = 1.00 * Integer.parseInt(txtCr14.getText());

        }
        else if ("D-".equals(txtMark14.getText())) {
            g7 = 0.75 * Integer.parseInt(txtCr14.getText());

        }
        else if ("E".equals(txtMark14.getText())) {
            g7 = 0 * Integer.parseInt(txtCr14.getText());

        }
        else if ("F".equals(txtMark14.getText())) {
            g7 = 0 * Integer.parseInt(txtCr14.getText());

        } 

       

        g = (g1 + g2 + g3 + g4 + g5 + g6 + g7) / 15;
        System.out.println("gpa" + g);
        
        txtGpa.setText(Double.toString(g));
        
        //ResultMake r = new ResultMake();
        //r.setGpa(Double.toString(g));
        //boolean result = dbops.addResult(r);

       

        
        
        
        

    }//GEN-LAST:event_btnCalculateGpaActionPerformed

    void setFields(Undergraduate u1) {
        System.out.println("RRR1");

        txtRegId.setText(Integer.toString(u1.getRegID()));
        rm.setRegid(txtRegId.getText());

        txtOSub11.setText(u1.getSubject11());
        rm.setMark(txtOSub11.getText());
        s1 = dbops.SubCode(rm);
        txtCr11.setText(s1);

        txtOSub12.setText(u1.getSubject12());
        rm.setMark(txtOSub12.getText());
        s1 = dbops.SubCode(rm);
        txtCr12.setText(s1);

        txtOSub13.setText(u1.getSubject13());
        rm.setMark(txtOSub13.getText());
        s1 = dbops.SubCode(rm);
        txtCr13.setText(s1);

        txtOSub14.setText(u1.getSubject14());
        rm.setMark(txtOSub14.getText());
        s1 = dbops.SubCode(rm);
        txtCr14.setText(s1);
        
        txtSub11.setText("1101");
        txtSub12.setText("1102");
        txtSub13.setText("1103");
        txtMCr11.setText("2");
        txtMCr12.setText("3");
        txtMCr13.setText("3");

        System.out.println("RRR2");
    }

   

    
   
    

    

    
   

   

   

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddResult;
    private javax.swing.JButton btnCalculateGpa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCr11;
    private javax.swing.JTextField txtCr12;
    private javax.swing.JTextField txtCr13;
    private javax.swing.JTextField txtCr14;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtMCr11;
    private javax.swing.JTextField txtMCr12;
    private javax.swing.JTextField txtMCr13;
    private javax.swing.JTextField txtMMark11;
    private javax.swing.JTextField txtMMark12;
    private javax.swing.JTextField txtMMark13;
    private javax.swing.JTextField txtMark11;
    private javax.swing.JTextField txtMark12;
    private javax.swing.JTextField txtMark13;
    private javax.swing.JTextField txtMark14;
    private javax.swing.JTextField txtOSub11;
    private javax.swing.JTextField txtOSub12;
    private javax.swing.JTextField txtOSub13;
    private javax.swing.JTextField txtOSub14;
    private javax.swing.JTextField txtRegId;
    private javax.swing.JTextField txtSub11;
    private javax.swing.JTextField txtSub12;
    private javax.swing.JTextField txtSub13;
    // End of variables declaration//GEN-END:variables
}
