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
import Reports.SensorDataReport;
import Reports.SetOfSensorDataReport;
import Sensors.AirTemperatureSensor;
import Sensors.CropMoistureSensor;
import Sensors.LightSensor;
import Sensors.RainfallSensor;
import Sensors.SensorGroup;
import Sensors.SensorGroupControl;
import Sensors.SetOfSensors;
import Sensors.SoilAciditySensor;
import Sensors.SoilTemperatureSensor;
import Sensors.WindSensor;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
public class SensorDataManagement extends javax.swing.JFrame {

    SetOfFieldStations sfs = new SetOfFieldStations();
    SetOfSensors sos = new SetOfSensors();
    SensorGroupControl sgc = new SensorGroupControl();
    SetOfSensorDataReport sdsr = new SetOfSensorDataReport();
    String FieldStationType;
    int FieldStationId;
    String unit;

    /**
     * Creates new form FieldManagement
     */
    public SensorDataManagement() {
        try {
            initComponents();
            sos.deserialize();
            sfs.deSerialize();

            //sensorTableLoad(sos, jTable1, jScrollPane1);
            //Vector<Farmer> far = sou.getAllFarmers();
            for (FieldStation fs : sfs.getAllPermenentFieldstation()) {
                cmb_permanent.addItem("" + fs.getFieldStationID());
            }

            for (FieldStation fs : sfs.getAllPortableFieldstation()) {
                cmb_portable.addItem("" + fs.getFieldStationID());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sensorTableLoad(SetOfSensors sensors, JTable table, JScrollPane pane) {
        Vector tmp = new Vector<>();
        Vector<AirTemperatureSensor> ats = sensors.getAirTemperatureSensor();
        Vector<CropMoistureSensor> cms = sensors.getCropMoistureSensor();
        Vector<LightSensor> ls = sensors.getLightSensor();
        Vector<RainfallSensor> rfs = sensors.getRainfallSensor();
        Vector<SoilAciditySensor> sas = sensors.getSoilAciditySensor();
        Vector<SoilTemperatureSensor> sts = sensors.getSoilTemperatureSensor();
        Vector<WindSensor> ws = sensors.getWindSensor();

        for (AirTemperatureSensor item : ats) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement(item.isAvailability());
            row.addElement("Air Temperature Sensor");

            tmp.add(row);
        }
        for (CropMoistureSensor item : cms) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement(item.isAvailability());
            row.addElement("Crop Moisture Sensor");

            tmp.add(row);
        }
        for (LightSensor item : ls) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement(item.isAvailability());
            row.addElement("Light Sensor");

            tmp.add(row);
        }
        for (SoilAciditySensor item : sas) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement(item.isAvailability());
            row.addElement("Soil Acidity Sensor");

            tmp.add(row);
        }
        for (RainfallSensor item : rfs) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement(item.isAvailability());
            row.addElement("Rainfall Sensor");

            tmp.add(row);
        }
        for (SoilTemperatureSensor item : sts) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement(item.isAvailability());
            row.addElement("Soil Temperature Sensor");

            tmp.add(row);
        }
        for (WindSensor item : ws) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement(item.isAvailability());
            row.addElement("Wind Sensor");

            tmp.add(row);
        }

        //set column headings
        Vector columnNames = new Vector();
        columnNames.addElement("Sensor ID");
        columnNames.addElement("Model");
        columnNames.addElement("Brand");
        columnNames.addElement("Perpose");
        columnNames.addElement("Availability");
        columnNames.addElement("Type");
        //set table model
        DefaultTableModel model = new DefaultTableModel(tmp, columnNames);

        table.setModel(model);
        pane.setViewportView(table);
        table.setAutoscrolls(true);
        table.getTableHeader().setReorderingAllowed(false);
    }
    
    public void sensorDataTableLoad(SetOfSensorDataReport data, JTable table, JScrollPane pane) {
        Vector tmp = new Vector<>();

        for (SensorDataReport item : data) {
            Vector row = new Vector();
            row.addElement(item.getReportId());
            row.addElement(item.getSensorId());
            row.addElement(item.getFieldstationId());
            row.addElement(item.getCurrentValue());
            row.addElement(item.getUnit());
            row.addElement(item.getDate());
            row.addElement(item.getTime());

            tmp.add(row);
        }
        //set column headings
        Vector columnNames = new Vector();
        columnNames.addElement("Report ID");
        columnNames.addElement("Sensor ID");
        columnNames.addElement("FieldStation Id");
        columnNames.addElement("Reading");
        columnNames.addElement("Unit");
        columnNames.addElement("Date");
        columnNames.addElement("Time");
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmb_portable = new javax.swing.JComboBox<>();
        cmb_permanent = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddSensor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Add Field");
        AddSensor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 50));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        AddSensor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, 180));

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AddSensor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 80, -1));

        jLabel7.setText("Portable Field Station");
        AddSensor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        AddSensor.add(cmb_portable, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 30));

        AddSensor.add(cmb_permanent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, 30));

        jLabel8.setText("reportId");
        AddSensor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, 30));
        AddSensor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 170, 40));

        jButton2.setText("Load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AddSensor.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 80, -1));
        AddSensor.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, -1));
        AddSensor.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 150, -1));

        jLabel9.setText("current Value");
        AddSensor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 120, 30));
        AddSensor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 170, 40));

        jButton3.setText("Add Values");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AddSensor.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

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
        jScrollPane2.setViewportView(jTable2);

        AddSensor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, 250));

        jTabbedPane1.addTab("Add Field", AddSensor);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PortableFieldstation prfs;
        FieldStationType = "Portable Field Station";
        FieldStationId = Integer.parseInt(cmb_portable.getSelectedItem().toString());
        int id = Integer.parseInt(cmb_portable.getSelectedItem().toString());
        prfs = sfs.getPortableFieldstationById(id);

        SensorGroup sg = prfs.getGroup();
        SetOfSensors sos = sg.getSensorSet();

        sensorTableLoad(sos, jTable1, jScrollPane1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PermenentFieldstation pfs;
        FieldStationType = "Permenant Field Station";
        FieldStationId = Integer.parseInt(cmb_permanent.getSelectedItem().toString());

        int id = Integer.parseInt(cmb_permanent.getSelectedItem().toString());
        pfs = sfs.getPermenentFieldstationById(id);

        SensorGroup sg = pfs.getGroup();
        SetOfSensors sos = sg.getSensorSet();

        sensorTableLoad(sos, jTable1, jScrollPane1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        jLabel1.setText(jTable1.getValueAt(r, 0).toString());
        jLabel6.setText(jTable1.getValueAt(r, 5).toString());

        if (jLabel6.getText().toString().equalsIgnoreCase("Air Tempareture Sensor")) {
            unit = "celcius";
        } else if (jLabel6.getText().toString().equalsIgnoreCase("Crop Moisture Sensor")) {
            unit = "kpa";
        } else if (jLabel6.getText().toString().equalsIgnoreCase("Light Sensor")) {
            unit = "kalvin";
        } else if (jLabel6.getText().toString().equalsIgnoreCase("Rainfall Sensor")) {
            unit = "ml";
        } else if (jLabel6.getText().toString().equalsIgnoreCase("Soil Acidity Sensor")) {
            unit = "ph";
        } else if (jLabel6.getText().toString().equalsIgnoreCase("Soil Temperature Sensor")) {
            unit = "celcius";
        } else if (jLabel6.getText().toString().equalsIgnoreCase("Wind Sensor")) {
            unit = "kmph";
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int sensorId = Integer.parseInt(jLabel1.getText().toString());
        int reportId = Integer.parseInt(jTextField1.getText().toString());
        double currentValue = Double.parseDouble(jTextField2.getText().toString());

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String today = dateFormat.format(date);
        
        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String now = dateFormat1.format(cal.getTime()); 

        SensorDataReport sdr = new SensorDataReport(reportId, currentValue, unit, today, now, sensorId, FieldStationId);
        
        sdsr.add(sdr);
        
        try{
            sdsr.serialize();
            JOptionPane.showMessageDialog(rootPane, "Succesfully Added");
            
            sdsr.deserialize();
            sensorDataTableLoad(sdsr, jTable2, jScrollPane2);
            
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SensorDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SensorDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SensorDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SensorDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SensorDataManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSensor;
    private javax.swing.JComboBox<String> cmb_permanent;
    private javax.swing.JComboBox<String> cmb_portable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
