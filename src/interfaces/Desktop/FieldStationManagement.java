/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.Desktop;

import Crops.Crop;
import Crops.SetOfCrops;
import Fields.Field;
import Fields.FieldStation;
import Fields.PermenentFieldstation;
import Fields.PortableFieldstation;
import Fields.SetOfFieldStations;
import Users.Farmer;
import Users.setOfUsers;
import Fields.SetOfFields;
import Sensors.SensorGroup;
import Sensors.SensorGroupControl;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eranga
 */
public class FieldStationManagement extends javax.swing.JFrame {

    setOfUsers sou = new setOfUsers();

    SetOfFields sof = new SetOfFields();
    SetOfFieldStations sfs = new SetOfFieldStations();
    SensorGroupControl sgc = new SensorGroupControl();

    /**
     * Creates new form FieldManagement
     */
    public FieldStationManagement() {
        try {
            initComponents();
            sou.deserialize();

            sof.deSerialize();
            sgc.deserialize();
            sfs.deSerialize();

            fieldStationTableLoad(sfs, jTable1, jScrollPane1);
            fieldStationTableLoad(sfs, jTable2, jScrollPane2);
            fieldStationTableLoad(sfs, jTable3, jScrollPane3);

            //Vector<Farmer> far = sou.getAllFarmers();
            for (Farmer fm : sou.getAllFarmers()) {
                jComboBox1.addItem("" + fm.getUserId());
            }

            for (Field fd : sof) {
                jComboBox3.addItem("" + fd.getFieldID());
            }

            for (SensorGroup sg : sgc) {
                jComboBox2.addItem("" + sg.getSensorGroupId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fieldStationTableLoad(SetOfFieldStations fs, JTable table, JScrollPane pane) {
        Vector tmp = new Vector<>();
        
        Vector<PermenentFieldstation> pfs = fs.getAllPermenentFieldstation();
        Vector<PortableFieldstation> ptfs = fs.getAllPortableFieldstation();

          for (PermenentFieldstation item : pfs) {
            Vector row = new Vector();
            row.addElement(item.getFieldStationID());
            row.addElement(item.getName());
            row.addElement(item.getLocation());
            row.addElement(item.getFarmer().getUserId());
            row.addElement("PermenentFieldstation");

            tmp.add(row);
        }
        for (PortableFieldstation item : ptfs) {
            Vector row = new Vector();
            row.addElement(item.getFieldStationID());
            row.addElement(item.getName());
            row.addElement(item.getLocation());
            row.addElement(item.getFarmer().getUserId());
            row.addElement("PortableFieldstation");

            tmp.add(row);
        }

        //set column headings
        Vector columnNames = new Vector();
        columnNames.addElement("Station ID");
        columnNames.addElement("Station Name");
        columnNames.addElement("Location");
        columnNames.addElement("Type");
        columnNames.addElement("Field");
        columnNames.addElement("Farmenr");
        columnNames.addElement("S.Group");
        //set table model
        DefaultTableModel model = new DefaultTableModel(tmp, columnNames);

        table.setModel(model);
        pane.setViewportView(table);
        table.setAutoscrolls(true);
        table.getTableHeader().setReorderingAllowed(false);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AddSensor = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddSensor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AddSensor.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, 30));

        jLabel1.setText("Name");
        AddSensor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 30));
        AddSensor.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 30));

        jLabel2.setText("Add Field Station");
        AddSensor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 50));

        jLabel4.setText("Station Id");
        AddSensor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        AddSensor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 290));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AddSensor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 80, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AddSensor.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel7.setText("Farmer");
        AddSensor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 30));

        jLabel11.setText("Field");
        AddSensor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, 30));

        jLabel13.setText("Location");
        AddSensor.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 30));
        AddSensor.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 30));

        AddSensor.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 30));

        AddSensor.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 200, 30));

        jLabel20.setText("Sensor Group");
        AddSensor.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 70, 30));

        AddSensor.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 30));

        jLabel21.setText("Type");
        AddSensor.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portable Field Station", "Permenant Field Station" }));
        AddSensor.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        AddSensor.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jTabbedPane1.addTab("Add Field Station", AddSensor);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 540, 290));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 80, -1));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel8.setText("Edit Corp");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 50));

        jLabel14.setText("Station Id");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 30));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, 30));

        jLabel15.setText("Name");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 30));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 30));

        jLabel16.setText("Location");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 30));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 30));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 70, 30));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 70, 30));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 70, 30));
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 70, 30));

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        jPanel3.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jTabbedPane1.addTab("Edit Fieldstation", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 80, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 540, 290));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, 50));

        jLabel10.setText("Dekete Crop");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 50));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        jPanel4.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1000, 600));

        jTabbedPane1.addTab("Delete Fieldstation", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().isEmpty() | jTextField2.getText().isEmpty() | jTextField9.getText().isEmpty() | jTextField9.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields.");
        } else {
            int stationid = Integer.parseInt(jTextField1.getText());
            String location = jTextField9.getText().toString();
            String stationName = jTextField2.getText().toString();
            String type = jComboBox4.getSelectedItem().toString();

            int ownerid = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            int fieldid = Integer.parseInt(jComboBox3.getSelectedItem().toString());
            int sgroupid = Integer.parseInt(jComboBox2.getSelectedItem().toString());

            Farmer owner = sou.getFarmerById(ownerid);
            SensorGroup sg = sgc.findSensorGroupById(sgroupid);
            Field fd = sof.findFieldById(fieldid);

            

            if (type.equalsIgnoreCase("Permenant Field Station")) {
                PermenentFieldstation fs = new PermenentFieldstation(stationid, stationName, location, type, owner, fd, sg);
                sfs.addPermenentFieldstation(fs);
            } else if (type.equalsIgnoreCase("Portable Field Station")) {
                PortableFieldstation fs = new PortableFieldstation(stationid, stationName, location, type, owner, fd, sg);
                sfs.addPortableFieldstation(fs);
            }

            try {
                sfs.serialize();
                JOptionPane.showMessageDialog(rootPane, "Field successfully Added");

                sfs.deSerialize();
                fieldStationTableLoad(sfs, jTable1, jScrollPane1);
                fieldStationTableLoad(sfs, jTable2, jScrollPane2);
                fieldStationTableLoad(sfs, jTable3, jScrollPane3);

                jTextField1.setText(null);
                jTextField2.setText(null);
                jTextField9.setText(null);
            } catch (Exception e1) {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField9.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int r = jTable2.getSelectedRow();
        jTextField7.setText(jTable2.getValueAt(r, 0).toString());
        jTextField8.setText(jTable2.getValueAt(r, 1).toString());
        jTextField10.setText(jTable2.getValueAt(r, 2).toString());
        jLabel18.setText(jTable2.getValueAt(r, 3).toString());
        jLabel19.setText(jTable2.getValueAt(r, 4).toString());
        jLabel22.setText(jTable2.getValueAt(r, 5).toString());
        jLabel23.setText(jTable2.getValueAt(r, 6).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       /* if (jTextField7.getText().isEmpty() | jTextField8.getText().isEmpty() | jTextField10.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields.");
        } else {
            int stationid = Integer.parseInt(jTextField7.getText());
            String stationName = jTextField8.getText().toString();
            String location = jTextField10.getText().toString();
            String type = jLabel18.getText().toString();

            int ownerid = Integer.parseInt(jLabel19.getText().toString());
            int fieldid = Integer.parseInt(jLabel22.getText().toString());
            int sgroupid = Integer.parseInt(jLabel23.getText().toString());

            Farmer owner = sou.getFarmerById(ownerid);
            SensorGroup sg = sgc.findSensorGroupById(sgroupid);
            Field fd = sof.findFieldById(fieldid);

            sfs.remove(sfs.findFieldById(fieldid));

            FieldStation fs = new FieldStation(stationid, stationName, location, type, owner, fd, sg);
            sfs.add(fs);
            try {
                sof.serialize();
                JOptionPane.showMessageDialog(rootPane, "Field successfully Eddited");

                soc.deserialize();
                fieldTableLoad(sof, jTable1, jScrollPane1);
                fieldTableLoad(sof, jTable2, jScrollPane2);
                fieldTableLoad(sof, jTable3, jScrollPane3);

                jTextField7.setText(null);
                jTextField8.setText(null);
                jTextField10.setText(null);
                jTextField11.setText(null);
            } catch (Exception e1) {
            }
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField7.setText(null);
        jTextField8.setText(null);
        jTextField10.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       /* int id = Integer.parseInt(jLabel9.getText());

        int x = JOptionPane.showConfirmDialog(rootPane, "Are you sure?");

        if (x == 0) {
            sof.remove(sof.findFieldById(id));

            try {

                sof.serialize();
                JOptionPane.showMessageDialog(rootPane, "Field successfully Deleted");

                soc.deserialize();
                fieldTableLoad(sof, jTable1, jScrollPane1);
                fieldTableLoad(sof, jTable2, jScrollPane2);
                fieldTableLoad(sof, jTable3, jScrollPane3);
            } catch (Exception e1) {
            }
        }*/
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int r = jTable3.getSelectedRow();
        jLabel9.setText(jTable3.getValueAt(r, 0).toString());
    }//GEN-LAST:event_jTable3MouseClicked

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
            java.util.logging.Logger.getLogger(FieldStationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FieldStationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FieldStationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FieldStationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FieldStationManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSensor;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}