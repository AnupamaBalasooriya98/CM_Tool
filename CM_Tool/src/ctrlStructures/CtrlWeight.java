/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrlStructures;

import cm_tool.Home;
import static cm_tool.Home.jDesktopPane1;
import static cm_tool.Home.path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author anupama
 */
public class CtrlWeight extends javax.swing.JInternalFrame {

    CtrlTbl tbl;
    
    /**
     * Creates new form CtrlWeight
     */
    public CtrlWeight() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Control Structure type");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Weight");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel4.setText("A conditional control structure such as an 'if' or 'else-if' condition");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel5.setText("Each 'case' statement in a 'switch-case' control structure");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel6.setText("The 'switch' statement in a 'switch-case' control structure ");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel7.setText("An iterative control structure such as a 'for', 'while', or 'do-while' loop");

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setText("2");

        jTextField2.setText("3");

        jTextField3.setText("2");

        jTextField4.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Show a success message
        JOptionPane.showMessageDialog(this, "Done");
        
        // Return to the previous intrface
        if (tbl == null) {
            jDesktopPane1.removeAll();
            CtrlTbl x = new CtrlTbl();
            jDesktopPane1.add(x).setVisible(true);
            this.dispose();
        } else {
            jDesktopPane1.removeAll();
            jDesktopPane1.add(tbl).setVisible(true);
            this.dispose();
        }
        
        ctrlStructures();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Go back to the previous interface
        if (tbl == null) {
            jDesktopPane1.removeAll();
            CtrlTbl x = new CtrlTbl();
            jDesktopPane1.add(x).setVisible(true);
            this.dispose();
        } else {
            jDesktopPane1.removeAll();
            jDesktopPane1.add(tbl).setVisible(true);
            this.dispose();
        }
        
        ctrlStructures();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void ctrlStructures() {
        // get values of weights
        String wtcsIfElse = jTextField1.getText(); // A conditional control structure such as an 'if' or 'else-if' condition
        String wtcsForWhile = jTextField2.getText(); // An iterative control structure such as a 'for', 'while', or 'do-while' loop
        String wtcsSwitch = jTextField3.getText(); // The 'switch' statement in a 'switch-case' control structure 
        String wtcsCase = jTextField4.getText(); // Each 'case' statement in a 'switch-case' control structure

        // number of conditions in single line
        int count = 1;
        
        // Weights for each control structure
        int forIfElse = Integer.parseInt(wtcsIfElse);
        int forForWhile = Integer.parseInt(wtcsForWhile);
        int forSwitch = Integer.parseInt(wtcsSwitch);
        int forCase = Integer.parseInt(wtcsCase);
        int noCtrl = 0;
        
        // complexity of previous program
        int previous = 0;
        
        // calculate ccs
        int valIfElse = forIfElse * count;
        int valForWhile = forForWhile * count;
        int valSwitch = forSwitch * count;
        int valCase = forCase * count;
        int valNothing = noCtrl * count;
        
        // convert that values into string
        String nc = String.valueOf(count);
        String nothing = String.valueOf(noCtrl);
        String ccspps = String.valueOf(previous);
        
        // convert calculated values into string
        String ccsIfElse = String.valueOf(valIfElse);
        String ccsForWhile = String.valueOf(valForWhile);
        String ccsSwitch = String.valueOf(valSwitch);
        String ccsCase = String.valueOf(valCase);
        String ccsNothing = String.valueOf(valNothing);
        
        // get file path to the uploaded file
        String filepath = path.getText();

        File file = new File(filepath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            // give the table header
            String[] colNames = {"#", "Line", "Wtcs", "NC", "Ccspps", "Ccs"};

            DefaultTableModel model = (DefaultTableModel) CtrlTbl.jTable1.getModel();

            model.setColumnIdentifiers(colNames);

            Object[] lines = br.lines().toArray();

            // read the file line by line and check for the control structures
            for (int i = 1; i <= lines.length; i++) {
                String line = lines[i].toString();

                String col = String.valueOf(i);

                // A conditional control structure such as an 'if' or 'else-if' condition
                if (line.contains(" if") || line.contains(" else if")) {
                    String[] data = {col, line, wtcsIfElse, nc, ccspps, ccsIfElse};
                    model.addRow(data);
                }

                // An iterative control structure such as a 'for', 'while', or 'do-while' loop
                if (line.contains(" for") || line.contains(" while") || line.contains(" do")) {
                    String[] data = {col, line, wtcsForWhile, nc, ccspps, ccsForWhile};
                    model.addRow(data);
                }

                // The 'switch' statement in a 'switch-case' control structure 
                if (line.contains(" switch")) {
                    String[] data = {col, line, wtcsSwitch, nc, ccspps, ccsSwitch};
                    model.addRow(data);
                }

                // Each 'case' statement in a 'switch-case' control structure
                if (line.contains(" case")) {
                    String[] data = {col, line, wtcsCase, nc, ccspps, ccsCase};
                    model.addRow(data);
                } // Lines without any control structure
                else {
                    String[] data = {col, line, nothing, "0", ccspps, ccsNothing};
                    model.addRow(data);
                }

                // Set column sizes
                CtrlTbl.jTable1.setAutoResizeMode(CtrlTbl.jTable1.AUTO_RESIZE_NEXT_COLUMN);
                TableColumnModel colModel = CtrlTbl.jTable1.getColumnModel();
                colModel.getColumn(0).setPreferredWidth(25);
                colModel.getColumn(1).setPreferredWidth(400);
                colModel.getColumn(2).setPreferredWidth(35);
                colModel.getColumn(3).setPreferredWidth(25);
                colModel.getColumn(4).setPreferredWidth(50);
                colModel.getColumn(5).setPreferredWidth(25);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    Home h;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
