/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * datashow.java
 *
 * Created on Dec 23, 2017, 9:22:42 PM
 */

package assignment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author DELL
 */
public class datashow extends javax.swing.JFrame {

    /** Creates new form datashow */
    public datashow() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Displaytable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        display = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        view.setBackground(new java.awt.Color(0, 0, 0));
        view.setPreferredSize(new java.awt.Dimension(499, 311));
        view.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        Displaytable.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "ID", "CONTACT", "GENDER", "BATCH NO"
            }
        ));
        Displaytable.setViewportView(jTable1);

        display.setBackground(new java.awt.Color(51, 255, 51));
        display.setFont(new java.awt.Font("Times New Roman", 1, 12));
        display.setText("VIEW MEMBER");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 255, 0));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(51, 255, 51));
        back.setFont(new java.awt.Font("Times New Roman", 1, 12));
        back.setText("BACK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Displaytable, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Displaytable, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(display)
                .addGap(46, 46, 46)
                .addComponent(clear)
                .addGap(49, 49, 49)
                .addComponent(back)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        view.add(jPanel2);
        jPanel2.setBounds(20, 140, 480, 230);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("WELCOME FROM UIT (UNIVERSITY OF TECHNOLOGY) LIBRARY");
        view.add(jLabel3);
        jLabel3.setBounds(30, 100, 480, 19);

        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\kl1550-app-icon-home.png")); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        view.add(home);
        home.setBounds(490, 0, 30, 30);

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\book-logo-design-best-25-book-logo-ideas-on-pinterest-typography-logo-design-ideas.jpg")); // NOI18N
        view.add(jLabel1);
        jLabel1.setBounds(160, 20, 200, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        jTable1.setModel(new DefaultTableModel());
    }//GEN-LAST:event_clearActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
       Mainproject m=new Mainproject();
    m.setVisible(true);
    dispose();
    }//GEN-LAST:event_homeActionPerformed
        public void showda(){
             ArrayList <member> memdata= new ArrayList();
        membermethod me = new membermethod();
        try {
            memdata = me.display();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(datashow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(datashow.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
         model.setRowCount(0);
        for(int i=0; i<memdata.size();i++){
            String[]str=memdata.get(i).toString().split(":");
            model.addRow(str);
        }
        }
    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
       showda();
    }//GEN-LAST:event_displayActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datashow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Displaytable;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton display;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables

}
