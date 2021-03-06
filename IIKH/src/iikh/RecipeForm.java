/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iikh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author abhinav
 */
public class RecipeForm extends javax.swing.JFrame {

    /**
     * Creates new form RecipeForm
     */
    Database db;
    public RecipeForm() {
        initComponents();
        db = new Database();
        
        ArrayList<String> arr = db.repNames();
        ListRecipe.removeAllItems();
        for(String x: arr)
        ListRecipe.addItem(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        ListRecipe = new javax.swing.JComboBox();
        AddRecipe = new javax.swing.JButton();
        DelRecipe = new javax.swing.JButton();
        ViewRecipe = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingr = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        inst = new javax.swing.JTextArea();
        EditRecipe = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Recipe Interface");

        jLabel2.setText("Name:");

        jLabel3.setText("Ingredients:");

        jLabel4.setText("Instructions");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        ListRecipe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListRecipeActionPerformed(evt);
            }
        });

        AddRecipe.setText("Add Recipe");
        AddRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecipeActionPerformed(evt);
            }
        });

        DelRecipe.setText("Delete Recipe");
        DelRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelRecipeActionPerformed(evt);
            }
        });

        ViewRecipe.setText("View Recipe");
        ViewRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecipeActionPerformed(evt);
            }
        });

        ingr.setColumns(20);
        ingr.setRows(5);
        jScrollPane1.setViewportView(ingr);

        inst.setColumns(20);
        inst.setRows(5);
        jScrollPane2.setViewportView(inst);

        EditRecipe.setText("Edit Recipe");
        EditRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRecipeActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(jScrollPane1))))
                        .addGap(51, 51, 51)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ListRecipe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(ViewRecipe)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddRecipe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditRecipe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DelRecipe)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewRecipe)
                    .addComponent(ListRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DelRecipe)
                                    .addComponent(EditRecipe)
                                    .addComponent(AddRecipe)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back)
                            .addComponent(clear))
                        .addGap(132, 132, 132))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListRecipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListRecipeActionPerformed

    private void AddRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecipeActionPerformed
        // TODO add your handling code here:
        
        String ingrs[] = ingr.getText().split("\\r?\\n");
        ArrayList<String>arrList = new ArrayList<>(Arrays.asList(ingrs)) ;
        String insts[] = inst.getText().split("\\r?\\n");
        ArrayList<String>arrList2 = new ArrayList<>(Arrays.asList(insts)) ;
        if(ingrs[0].equals("") || insts[0].equals("")){
            JOptionPane.showMessageDialog (jOptionPane1, "Enter valid values");
        }
        else{
            JOptionPane.showMessageDialog(jOptionPane1, "Recipe has been added");
            db.addRecipe(name.getText(), arrList, arrList2);

            name.setText("");
            ingr.setText("");
            inst.setText("");
            
            ArrayList<String> arr = db.repNames();
            ListRecipe.removeAllItems();
            for(String x: arr)
            ListRecipe.addItem(x);
        }
    }//GEN-LAST:event_AddRecipeActionPerformed

    private void ViewRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRecipeActionPerformed
        // TODO add your handling code here
        
        String rep = ListRecipe.getSelectedItem().toString();
        db.getRecipe(rep);
        ingr.setText("");
        inst.setText("");
        name.setText(rep);
        ArrayList<String> itm = db.indegrients;
        ArrayList<String> mtd = db.method;
        for(String x : itm)
            ingr.append(x + "\n");
        for(String x: mtd)
            inst.append(x + "\n");
        
    }//GEN-LAST:event_ViewRecipeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Greeter gt= new Greeter();
        gt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void DelRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelRecipeActionPerformed
        // TODO add your handling code here:
        db.removeRecipe(ListRecipe.getSelectedItem().toString());
        
        ArrayList<String> arr = db.repNames();
        ListRecipe.removeAllItems();
        for(String x: arr)
        ListRecipe.addItem(x);
        
        name.setText("");
        ingr.setText("");
        inst.setText("");
    }//GEN-LAST:event_DelRecipeActionPerformed

    private void EditRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRecipeActionPerformed
        // TODO add your handling code here:
        String ingrs[] = ingr.getText().split("\\r?\\n");
        ArrayList<String>arrList = new ArrayList<>(Arrays.asList(ingrs)) ;
        String insts[] = inst.getText().split("\\r?\\n");
        ArrayList<String>arrList2 = new ArrayList<>(Arrays.asList(insts)) ;
        
        if(ingrs[0].equals("") || insts[0].equals("")){
            JOptionPane.showMessageDialog (jOptionPane1, "Enter valid values");
        }
        else{
            JOptionPane.showMessageDialog(jOptionPane1, "Recipe has been added");
            db.editRecipe(ListRecipe.getSelectedItem().toString(), name.getText(), arrList, arrList2);
        
            ArrayList<String> arr = db.repNames();
            ListRecipe.removeAllItems();
            for(String x: arr)
            ListRecipe.addItem(x);
        }
    }//GEN-LAST:event_EditRecipeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        name.setText("");
        ingr.setText("");
        inst.setText("");
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(RecipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecipe;
    private javax.swing.JButton DelRecipe;
    private javax.swing.JButton EditRecipe;
    private javax.swing.JComboBox ListRecipe;
    private javax.swing.JButton ViewRecipe;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JTextArea ingr;
    private javax.swing.JTextArea inst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
