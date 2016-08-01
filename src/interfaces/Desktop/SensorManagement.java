/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.Desktop;

import Sensors.AirTemperatureSensor;
import Sensors.CropMoistureSensor;
import Sensors.LightSensor;
import Sensors.RainfallSensor;
import Sensors.SensorGroup;
import Sensors.SensorGroupControl;
import Sensors.Sensors;
import Sensors.SetOfSensors;
import Sensors.SoilAciditySensor;
import Sensors.SoilTemperatureSensor;
import Sensors.WindSensor;
import javax.swing.JOptionPane;
import Users.Farmer;
import Users.Manager;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gsark
 */
public class SensorManagement extends javax.swing.JFrame {

    private SetOfSensors sos = new SetOfSensors();
    private SensorGroupControl sgc = new SensorGroupControl();
    private SetOfSensors newSos = new SetOfSensors();
    private SetOfSensors categorizeSos = new SetOfSensors();

    private Vector<AirTemperatureSensor> airts;
    private Vector<CropMoistureSensor> cropms;
    private Vector<LightSensor> lights;
    private Vector<SoilAciditySensor> soilas;
    private Vector<SoilTemperatureSensor> soilts;
    private Vector<RainfallSensor> rainfs;
    private Vector<WindSensor> winds;

    /**
     * Creates new form Login
     */
    public SensorManagement() {
        try {
            sos.deserialize();
        } catch (Exception e) {
        }

        initComponents();

        sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
        sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
        sensorTableLoad(sos, addSensorTable, addSensorScrollPane);
    }

    /**
     * Use to load user details in a table in edit tab
     *
     * @param users
     */
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
            row.addElement("Air Temperature Sensor");

            tmp.add(row);
        }
        for (CropMoistureSensor item : cms) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("Crop Moisture Sensor");

            tmp.add(row);
        }
        for (LightSensor item : ls) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("Light Sensor");

            tmp.add(row);
        }
        for (SoilAciditySensor item : sas) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("Soil Acidity Sensor");

            tmp.add(row);
        }
        for (RainfallSensor item : rfs) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("Rainfall Sensor");

            tmp.add(row);
        }
        for (SoilTemperatureSensor item : sts) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("Soil Temperature Sensor");

            tmp.add(row);
        }
        for (WindSensor item : ws) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("Wind Sensor");

            tmp.add(row);
        }

        //set column headings
        Vector columnNames = new Vector();
        columnNames.addElement("Sensor ID");
        columnNames.addElement("Model");
        columnNames.addElement("Brand");
        columnNames.addElement("Perpose");
        columnNames.addElement("Type");
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

        SensorMangement = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AddSensor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_add_sense_id = new javax.swing.JTextField();
        txt_add_sense_brand = new javax.swing.JTextField();
        txt_add_sense_purpose = new javax.swing.JTextField();
        cmb_add_sense_type = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_addSensor = new javax.swing.JButton();
        btn_resetSensor = new javax.swing.JButton();
        addSensorScrollPane = new javax.swing.JScrollPane();
        addSensorTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txt_add_sense_model = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        DeleteSensor = new javax.swing.JPanel();
        deleteSensorScrollpane = new javax.swing.JScrollPane();
        deleteSensorTable = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_delete_sensor_type = new javax.swing.JLabel();
        lbl_delete_sensor_id = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        AddSensorGroup = new javax.swing.JPanel();
        txt_add_sengrp_category = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btn_add_sengrp = new javax.swing.JButton();
        btn_reset_sengrp = new javax.swing.JButton();
        add_sengrp_scrollpane = new javax.swing.JScrollPane();
        add_sengrp_table = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txt_add_sengrp_name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmb_add_sen_type = new javax.swing.JComboBox<>();
        btn_check_sen_availability = new javax.swing.JButton();
        cmb_chk_sen_type = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txt_add_sen_interval = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btn_add_sen = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txt_add_sengrp_id = new javax.swing.JTextField();
        cmb_add_sengrp_count = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();
        EditSensorGroup = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        scollpane_edit_sengrp = new javax.swing.JScrollPane();
        table_edit_sengrp = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cmb_add_type4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        cmb_add_type5 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();
        DeleteSensorGroup = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbl_delete_name1 = new javax.swing.JLabel();
        lbl_delete_type1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        background4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SensorMangement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddSensor.setBackground(new java.awt.Color(255, 255, 255));
        AddSensor.setPreferredSize(new java.awt.Dimension(1000, 620));
        AddSensor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Add Sensor");
        AddSensor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 30));
        AddSensor.add(txt_add_sense_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 280, 30));
        AddSensor.add(txt_add_sense_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 280, 30));

        txt_add_sense_purpose.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txt_add_sense_purpose.setForeground(new java.awt.Color(102, 102, 102));
        txt_add_sense_purpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_add_sense_purposeActionPerformed(evt);
            }
        });
        AddSensor.add(txt_add_sense_purpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 280, 30));

        cmb_add_sense_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Air Temperature Sensor", "Crop Moisture Sensor", "Light Sensor", "Rainfall Sensor", "Soil Acidity Sensor", "Soil Temperature Sensor", "Wind Sensor" }));
        AddSensor.add(cmb_add_sense_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 280, 30));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ID");
        AddSensor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 30));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Model");
        AddSensor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 30));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Purpose");
        AddSensor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 30));

        btn_addSensor.setText("Add Sensor");
        btn_addSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSensorActionPerformed(evt);
            }
        });
        AddSensor.add(btn_addSensor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, 30));

        btn_resetSensor.setText("Reset");
        btn_resetSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetSensorActionPerformed(evt);
            }
        });
        AddSensor.add(btn_resetSensor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 30));

        addSensorTable.setModel(new javax.swing.table.DefaultTableModel(
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
        addSensorScrollPane.setViewportView(addSensorTable);

        AddSensor.add(addSensorScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 370));

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Brand");
        AddSensor.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 30));

        txt_add_sense_model.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txt_add_sense_model.setForeground(new java.awt.Color(102, 102, 102));
        AddSensor.add(txt_add_sense_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 280, 30));

        jLabel20.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Type");
        AddSensor.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        AddSensor.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jTabbedPane1.addTab("Add Sensor", AddSensor);

        DeleteSensor.setBackground(new java.awt.Color(255, 255, 255));
        DeleteSensor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteSensorTable.setModel(new javax.swing.table.DefaultTableModel(
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
        deleteSensorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSensorTableMouseClicked(evt);
            }
        });
        deleteSensorScrollpane.setViewportView(deleteSensorTable);

        DeleteSensor.add(deleteSensorScrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 700, 300));

        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        DeleteSensor.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Delete Sensor");
        DeleteSensor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 60));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Selected");
        DeleteSensor.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 120, 30));
        DeleteSensor.add(lbl_delete_sensor_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 30));
        DeleteSensor.add(lbl_delete_sensor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 140, 30));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        DeleteSensor.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        jTabbedPane1.addTab("Delete Sensor", DeleteSensor);

        AddSensorGroup.setBackground(new java.awt.Color(255, 255, 255));
        AddSensorGroup.setPreferredSize(new java.awt.Dimension(1000, 620));
        AddSensorGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AddSensorGroup.add(txt_add_sengrp_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, 30));

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Name");
        AddSensorGroup.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 30));

        btn_add_sengrp.setText("Create Sensor Group");
        btn_add_sengrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_sengrpActionPerformed(evt);
            }
        });
        AddSensorGroup.add(btn_add_sengrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 190, 60));

        btn_reset_sengrp.setText("Reset");
        btn_reset_sengrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset_sengrpActionPerformed(evt);
            }
        });
        AddSensorGroup.add(btn_reset_sengrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 30));

        add_sengrp_table.setModel(new javax.swing.table.DefaultTableModel(
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
        add_sengrp_scrollpane.setViewportView(add_sengrp_table);

        AddSensorGroup.add(add_sengrp_scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 630, 160));

        jLabel22.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Category");
        AddSensorGroup.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 30));

        txt_add_sengrp_name.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txt_add_sengrp_name.setForeground(new java.awt.Color(102, 102, 102));
        AddSensorGroup.add(txt_add_sengrp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 280, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Add Sensor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Interval");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        jPanel1.add(cmb_add_sen_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 220, 30));

        btn_check_sen_availability.setText("Available");
        btn_check_sen_availability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_check_sen_availabilityActionPerformed(evt);
            }
        });
        jPanel1.add(btn_check_sen_availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 30));

        cmb_chk_sen_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Air Temperature Sensor", "Crop Moisture Sensor", "Light Sensor", "Rainfall Sensor", "Soil Acidity Sensor", "Soil Temperature Sensor", "Wind Sensor" }));
        jPanel1.add(cmb_chk_sen_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, 30));

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Type");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));
        jPanel1.add(txt_add_sen_interval, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, 30));

        jLabel31.setBackground(new java.awt.Color(102, 102, 102));
        jLabel31.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Sensor");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 30));

        btn_add_sen.setText("Add");
        btn_add_sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_senActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add_sen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 100, 30));

        AddSensorGroup.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 470, 230));

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("ID");
        AddSensorGroup.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 30));
        AddSensorGroup.add(txt_add_sengrp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 280, 30));

        cmb_add_sengrp_count.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        AddSensorGroup.add(cmb_add_sengrp_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 240, 30));

        jLabel26.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Add Sensor Group");
        AddSensorGroup.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 30));

        jLabel33.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("No. Of Sensors");
        AddSensorGroup.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        AddSensorGroup.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 600));

        jTabbedPane1.addTab("Add Sensor Group", AddSensorGroup);

        EditSensorGroup.setBackground(new java.awt.Color(255, 255, 255));
        EditSensorGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Edit Sensor Group");
        EditSensorGroup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 30));

        table_edit_sengrp.setModel(new javax.swing.table.DefaultTableModel(
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
        table_edit_sengrp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_edit_sengrpMouseClicked(evt);
            }
        });
        scollpane_edit_sengrp.setViewportView(table_edit_sengrp);

        EditSensorGroup.add(scollpane_edit_sengrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 770, 170));

        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        EditSensorGroup.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 70, 30));

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Sensor");
        EditSensorGroup.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 80, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EditSensorGroup.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 210, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Add Sensor");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Sensor");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 80, 30));

        cmb_add_type4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmer", "Food Processing Manager" }));
        jPanel2.add(cmb_add_type4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 220, 30));

        jButton3.setText("Available");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 30));

        cmb_add_type5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmer", "Food Processing Manager" }));
        jPanel2.add(cmb_add_type5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 220, 30));

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Type");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, 30));

        jButton4.setText("Add");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 70, 30));

        EditSensorGroup.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 470, 170));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        EditSensorGroup.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 580));

        jTabbedPane1.addTab("Edit Sensor Group", EditSensorGroup);

        DeleteSensorGroup.setBackground(new java.awt.Color(255, 255, 255));
        DeleteSensorGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        DeleteSensorGroup.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 740, 250));

        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        DeleteSensorGroup.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 340, 70, 30));

        jLabel24.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Delete Sensor Group");
        DeleteSensorGroup.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 60));

        jLabel25.setBackground(new java.awt.Color(102, 102, 102));
        jLabel25.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Search");
        DeleteSensorGroup.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 60, 30));
        DeleteSensorGroup.add(lbl_delete_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 120, 30));
        DeleteSensorGroup.add(lbl_delete_type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 140, 30));
        DeleteSensorGroup.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 180, 30));

        jLabel30.setBackground(new java.awt.Color(102, 102, 102));
        jLabel30.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Selected");
        DeleteSensorGroup.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 120, 30));

        background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        DeleteSensorGroup.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        jTabbedPane1.addTab("Delete Sensor Group", DeleteSensorGroup);

        SensorMangement.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(SensorMangement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSensorActionPerformed

        int id = Integer.parseInt(txt_add_sense_id.getText());
        String brand = txt_add_sense_brand.getText().toString();
        String purpose = txt_add_sense_purpose.getText().toString();
        String model = txt_add_sense_model.getText().toString();
        String type = cmb_add_sense_type.getSelectedItem().toString();

        if (txt_add_sense_id.getText().isEmpty() | txt_add_sense_brand.getText().isEmpty() | txt_add_sense_purpose.getText().isEmpty() | txt_add_sense_model.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields.");
        } else if (type.equalsIgnoreCase("Air Temperature Sensor")) {
            AirTemperatureSensor ats = new AirTemperatureSensor(id, purpose, model, brand);
            sos.addAirTemperatureSensor(ats);

            try {
                sos.serialize();
                System.out.println(sos);
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                txt_add_sense_id.setText(null);
                txt_add_sense_brand.setText(null);
                txt_add_sense_purpose.setText(null);
                txt_add_sense_model.setText(null);
            } catch (Exception e1) {
            }
        } else if (type.equalsIgnoreCase("Crop Moisture Sensor")) {
            CropMoistureSensor cms = new CropMoistureSensor(id, purpose, model, brand);
            sos.addCropMoistureSensor(cms);

            try {
                sos.serialize();
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                txt_add_sense_id.setText(null);
                txt_add_sense_brand.setText(null);
                txt_add_sense_purpose.setText(null);
                txt_add_sense_model.setText(null);
            } catch (Exception e1) {
            }
        } else if (type.equalsIgnoreCase("Light Sensor")) {
            LightSensor ls = new LightSensor(id, purpose, model, brand);
            sos.addLightSensor(ls);

            try {
                sos.serialize();
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                txt_add_sense_id.setText(null);
                txt_add_sense_brand.setText(null);
                txt_add_sense_purpose.setText(null);
                txt_add_sense_model.setText(null);
            } catch (Exception e1) {
            }
        } else if (type.equalsIgnoreCase("Soil Acidity Sensor")) {
            SoilAciditySensor sas = new SoilAciditySensor(id, purpose, model, brand);
            sos.addSoilAciditySensor(sas);

            try {
                sos.serialize();
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                txt_add_sense_id.setText(null);
                txt_add_sense_brand.setText(null);
                txt_add_sense_purpose.setText(null);
                txt_add_sense_model.setText(null);
            } catch (Exception e1) {
            }
        } else if (type.equalsIgnoreCase("Rainfall Sensor")) {
            RainfallSensor rfs = new RainfallSensor(id, purpose, model, brand);
            sos.addRainfallSensor(rfs);

            try {
                sos.serialize();
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                txt_add_sense_id.setText(null);
                txt_add_sense_brand.setText(null);
                txt_add_sense_purpose.setText(null);
                txt_add_sense_model.setText(null);
            } catch (Exception e1) {
            }

        } else if (type.equalsIgnoreCase("Soil Temperature Sensor")) {
            SoilTemperatureSensor sts = new SoilTemperatureSensor(id, purpose, model, brand);
            sos.addSoilTemperatureSensor(sts);

            try {
                sos.serialize();
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                txt_add_sense_id.setText(null);
                txt_add_sense_brand.setText(null);
                txt_add_sense_purpose.setText(null);
                txt_add_sense_model.setText(null);
            } catch (Exception e1) {
            }
        } else if (type.equalsIgnoreCase("Wind Sensor")) {
            WindSensor sts = new WindSensor(id, purpose, model, brand);
            sos.addWindSensor(sts);

            try {
                sos.serialize();
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                txt_add_sense_id.setText(null);
                txt_add_sense_brand.setText(null);
                txt_add_sense_purpose.setText(null);
                txt_add_sense_model.setText(null);
            } catch (Exception e1) {
            }
        }
    }//GEN-LAST:event_btn_addSensorActionPerformed

    private void btn_resetSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetSensorActionPerformed
        txt_add_sense_id.setText(null);
        txt_add_sense_brand.setText(null);
        txt_add_sense_purpose.setText(null);
        txt_add_sense_model.setText(null);
    }//GEN-LAST:event_btn_resetSensorActionPerformed

    private void table_edit_sengrpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_edit_sengrpMouseClicked
        int r = table_edit_sengrp.getSelectedRow();
        //get the member number of the selected row

        lbl_edit_name.setText(table_edit_sengrp.getValueAt(r, 3).toString());
        txt_edit_username.setText(table_edit_sengrp.getValueAt(r, 1).toString());
        txt_edit_email.setText(table_edit_sengrp.getValueAt(r, 2).toString());
        lbl_edit_type.setText(table_edit_sengrp.getValueAt(r, 4).toString());
    }//GEN-LAST:event_table_edit_sengrpMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String name = lbl_edit_name.getText().toString();
        String email = txt_edit_email.getText().toString();
        String username = txt_edit_username.getText().toString();
        String type = lbl_edit_type.getText().toString();

        if (txt_edit_email.getText().isEmpty() | txt_edit_username.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields.");
        } else if (type.equalsIgnoreCase("Farmer")) {
            Farmer fmr = sou.getFarmerByName(name);
            String password = fmr.getPassword();
            sou.removeFarmer(fmr);

            Farmer fm = new Farmer(name, username, email, password, type);
            sou.addFarmer(fm);

            try {
                sou.serialize();
                JOptionPane.showMessageDialog(rootPane, "Successfully Saved");

                sou.deserialize();
                userTableLoad(sou, table_edit_sengrp, scollpane_edit_sengrp);
                userTableLoad(sou, deleteSensorTable, deleteSensorScrollpane);
                userTableLoad(sou, addSensorTable, addSensorScrollPane);

                lbl_edit_name.setText(null);
                txt_edit_email.setText(null);
                txt_edit_username.setText(null);
                lbl_edit_type.setText(null);
            } catch (Exception e1) {
            }
        } else if (type.equalsIgnoreCase("Food Processing Manager")) {
            Manager mnr = sou.getManagerByName(name);
            String password = mnr.getPassword();
            sou.removeManager(mnr);

            Manager mn = new Manager(name, username, email, password, type);
            sou.addManager(mn);

            try {
                sou.serialize();
                JOptionPane.showMessageDialog(rootPane, "Successfully Saved");

                sou.deserialize();
                userTableLoad(sou, table_edit_sengrp, scollpane_edit_sengrp);
                userTableLoad(sou, deleteSensorTable, deleteSensorScrollpane);
                userTableLoad(sou, addSensorTable, addSensorScrollPane);

                lbl_edit_name.setText(null);
                txt_edit_email.setText(null);
                txt_edit_username.setText(null);
                lbl_edit_type.setText(null);
            } catch (Exception e1) {
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int id = Integer.parseInt(lbl_delete_sensor_id.getText());
        String type = lbl_delete_sensor_type.getText().toString();

        int x = JOptionPane.showConfirmDialog(rootPane, "Are you sure about this?");
        System.out.println(x);

        if (x == 0) {
            if (type.equalsIgnoreCase("Air Temperature Sensor")) {
                AirTemperatureSensor ats = sos.getAirTemperatureSensorById(id);
                sos.removeAirTemperatureSensor(ats);

                try {
                    sos.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Delete");

                    sos.deserialize();
                    sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                    sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                    sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                    lbl_delete_sensor_id.setText(null);
                    lbl_delete_sensor_type.setText(null);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Crop Moisture Sensor")) {
                CropMoistureSensor cms = sos.getCropMoistureSensorById(id);
                sos.removeCropMoistureSensor(cms);

                try {
                    sos.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

                    sos.deserialize();
                    sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                    sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                    sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                    lbl_delete_sensor_id.setText(null);
                    lbl_delete_sensor_type.setText(null);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Light Sensor")) {
                LightSensor ls = sos.getLightSensorById(id);
                sos.removeLightSensor(ls);

                try {
                    sos.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

                    sos.deserialize();
                    sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                    sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                    sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                    lbl_delete_sensor_id.setText(null);
                    lbl_delete_sensor_type.setText(null);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Soil Acidity Sensor")) {
                SoilAciditySensor sas = sos.getSoilAciditySensorById(id);
                sos.removeSoilAciditySensor(sas);

                try {
                    sos.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

                    sos.deserialize();
                    sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                    sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                    sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                    lbl_delete_sensor_id.setText(null);
                    lbl_delete_sensor_type.setText(null);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Soil Temperature Sensor")) {
                SoilTemperatureSensor sts = sos.getSoilTemperatureSensorById(id);
                sos.removeSoilTemperatureSensor(sts);

                try {
                    sos.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

                    sos.deserialize();
                    sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                    sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                    sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                    lbl_delete_sensor_id.setText(null);
                    lbl_delete_sensor_type.setText(null);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Rainfall Sensor")) {
                RainfallSensor rfs = sos.getRainfallSensorById(id);
                sos.removeRainfallSensor(rfs);

                try {
                    sos.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

                    sos.deserialize();
                    sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                    sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                    sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                    lbl_delete_sensor_id.setText(null);
                    lbl_delete_sensor_type.setText(null);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Wind Sensor")) {
                WindSensor ws = sos.getWindSensorById(id);
                sos.removeWindSensor(ws);

                try {
                    sos.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

                    sos.deserialize();
                    sensorTableLoad(sos, table_edit_sengrp, scollpane_edit_sengrp);
                    sensorTableLoad(sos, deleteSensorTable, deleteSensorScrollpane);
                    sensorTableLoad(sos, addSensorTable, addSensorScrollPane);

                    lbl_delete_sensor_id.setText(null);
                    lbl_delete_sensor_type.setText(null);
                } catch (Exception e1) {
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Abort Operation");
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void deleteSensorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSensorTableMouseClicked
        int r = deleteSensorTable.getSelectedRow();
        lbl_delete_sensor_id.setText(deleteSensorTable.getValueAt(r, 0).toString());
        lbl_delete_sensor_type.setText(deleteSensorTable.getValueAt(r, 4).toString());

    }//GEN-LAST:event_deleteSensorTableMouseClicked

    private void txt_add_sense_purposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_add_sense_purposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_sense_purposeActionPerformed

    private void btn_add_sengrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_sengrpActionPerformed
        int id = Integer.parseInt(txt_add_sengrp_id.getText());
        String name = txt_add_sengrp_name.getText().toString();
        String category = txt_add_sengrp_category.getText().toString();
        int count = Integer.parseInt(cmb_add_sengrp_count.getSelectedItem().toString());
        //SetOfSensors.addAll(newSos);

        if (txt_add_sengrp_id.getText().isEmpty() | txt_add_sengrp_name.getText().isEmpty() | txt_add_sengrp_category.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields.");
        } else {
            SensorGroup sgp = new SensorGroup(id, name, category, count);
            //sos.addAirTemperatureSensor(ats);

            try {
                sos.serialize();
                JOptionPane.showMessageDialog(rootPane, "Sensor successfully Added");

                sos.deserialize();
                sensorTableLoad(sos, add_sengrp_table, add_sengrp_scrollpane);
                //sensorTableLoad(sos, deleteSensorTable, jScrollPane2);
                //sensorTableLoad(sos, addSensorTable, addSensorScrollPane);
                txt_add_sengrp_id.setText(null);
                txt_add_sengrp_name.setText(null);
                txt_add_sengrp_category.setText(null);
            } catch (Exception e1) {
            }
        }
    }//GEN-LAST:event_btn_add_sengrpActionPerformed

    private void btn_reset_sengrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset_sengrpActionPerformed
        txt_add_sengrp_id.setText(null);
        txt_add_sengrp_name.setText(null);
        txt_add_sengrp_category.setText(null);
    }//GEN-LAST:event_btn_reset_sengrpActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btn_check_sen_availabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_check_sen_availabilityActionPerformed
        categorizeSos.removeAllElements();
        cmb_add_sen_type.removeAllItems();

        String type = cmb_chk_sen_type.getSelectedItem().toString();

        if (type.equalsIgnoreCase("Air Temperature Sensor")) {
            airts = sos.getAirTemperatureSensor();
            for (Sensors sen : airts) {
                cmb_add_sen_type.addItem("" + sen.getSensorID());
            };
        } else if (type.equalsIgnoreCase("Crop Moisture Sensor")) {
            cropms = sos.getCropMoistureSensor();
            for (Sensors sen : cropms) {
                cmb_add_sen_type.addItem("" + sen.getSensorID());
            };
        } else if (type.equalsIgnoreCase("Light Sensor")) {
            lights = sos.getLightSensor();
            for (Sensors sen : lights) {
                cmb_add_sen_type.addItem("" + sen.getSensorID());
            };
        } else if (type.equalsIgnoreCase("Soil Temporature Sensor")) {
            soilts = sos.getSoilTemperatureSensor();
            for (Sensors sen : soilts) {
                cmb_add_sen_type.addItem("" + sen.getSensorID());
            };
        } else if (type.equalsIgnoreCase("Soil Acidity Sensor")) {
            soilas = sos.getSoilAciditySensor();
            for (Sensors sen : soilas) {
                cmb_add_sen_type.addItem("" + sen.getSensorID());
            };
        } else if (type.equalsIgnoreCase("Rainfall Sensor")) {
            rainfs = sos.getRainfallSensor();
            for (Sensors sen : rainfs) {
                cmb_add_sen_type.addItem("" + sen.getSensorID());
            };
        } else if (type.equalsIgnoreCase("Wind Sensor")) {
            winds = sos.getWindSensor();
            for (Sensors sen : winds) {
                cmb_add_sen_type.addItem("" + sen.getSensorID());
            };
        }
    }//GEN-LAST:event_btn_check_sen_availabilityActionPerformed

    private void btn_add_senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_senActionPerformed
        int id = Integer.parseInt(cmb_add_sen_type.getSelectedItem().toString());
        int interval = Integer.parseInt(txt_add_sen_interval.getText().toString());
        String type = cmb_chk_sen_type.getSelectedItem().toString();

        if (type.equalsIgnoreCase("Air Temperature Sensor")) {
            AirTemperatureSensor ats1 = sos.getAirTemperatureSensorById(id);
            newSos.addAirTemperatureSensor(ats1);
            sensorTableLoad(newSos, add_sengrp_table, add_sengrp_scrollpane);
        } else if (type.equalsIgnoreCase("Crop Moisture Sensor")) {
            CropMoistureSensor cms1 = sos.getCropMoistureSensorById(id);
            newSos.addCropMoistureSensor(cms1);
            sensorTableLoad(newSos, add_sengrp_table, add_sengrp_scrollpane);
        } else if (type.equalsIgnoreCase("Light Sensor")) {
            LightSensor ls1 = sos.getLightSensorById(id);
            newSos.addLightSensor(ls1);
            sensorTableLoad(newSos, add_sengrp_table, add_sengrp_scrollpane);
        } else if (type.equalsIgnoreCase("Soil Temporature Sensor")) {
            SoilTemperatureSensor sts1 = sos.getSoilTemperatureSensorById(id);
            newSos.addSoilTemperatureSensor(sts1);
            sensorTableLoad(newSos, add_sengrp_table, add_sengrp_scrollpane);     
        } else if (type.equalsIgnoreCase("Soil Acidity Sensor")) {
            SoilAciditySensor sas1 = sos.getSoilAciditySensorById(id);
            newSos.addSoilAciditySensor(sas1);
            sensorTableLoad(newSos, add_sengrp_table, add_sengrp_scrollpane);
        } else if (type.equalsIgnoreCase("Rainfall Sensor")) {
            RainfallSensor rfs1 = sos.getRainfallSensorById(id);
            newSos.addRainfallSensor(rfs1);
            sensorTableLoad(newSos, add_sengrp_table, add_sengrp_scrollpane);
        } else if (type.equalsIgnoreCase("Wind Sensor")) {
            WindSensor ws1 = sos.getWindSensorById(id);
            newSos.addWindSensor(ws1);
            sensorTableLoad(newSos, add_sengrp_table, add_sengrp_scrollpane);
        }
        txt_add_sen_interval.setText(null);
    }//GEN-LAST:event_btn_add_senActionPerformed

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
            java.util.logging.Logger.getLogger(SensorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SensorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SensorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SensorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SensorManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSensor;
    private javax.swing.JPanel AddSensorGroup;
    private javax.swing.JPanel DeleteSensor;
    private javax.swing.JPanel DeleteSensorGroup;
    private javax.swing.JPanel EditSensorGroup;
    private javax.swing.JPanel SensorMangement;
    private javax.swing.JScrollPane addSensorScrollPane;
    private javax.swing.JTable addSensorTable;
    private javax.swing.JScrollPane add_sengrp_scrollpane;
    private javax.swing.JTable add_sengrp_table;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JLabel background4;
    private javax.swing.JButton btn_addSensor;
    private javax.swing.JButton btn_add_sen;
    private javax.swing.JButton btn_add_sengrp;
    private javax.swing.JButton btn_check_sen_availability;
    private javax.swing.JButton btn_resetSensor;
    private javax.swing.JButton btn_reset_sengrp;
    private javax.swing.JComboBox<String> cmb_add_sen_type;
    private javax.swing.JComboBox<String> cmb_add_sengrp_count;
    private javax.swing.JComboBox<String> cmb_add_sense_type;
    private javax.swing.JComboBox<String> cmb_add_type4;
    private javax.swing.JComboBox<String> cmb_add_type5;
    private javax.swing.JComboBox<String> cmb_chk_sen_type;
    private javax.swing.JScrollPane deleteSensorScrollpane;
    private javax.swing.JTable deleteSensorTable;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_delete_name1;
    private javax.swing.JLabel lbl_delete_sensor_id;
    private javax.swing.JLabel lbl_delete_sensor_type;
    private javax.swing.JLabel lbl_delete_type1;
    private javax.swing.JScrollPane scollpane_edit_sengrp;
    private javax.swing.JTable table_edit_sengrp;
    private javax.swing.JTextField txt_add_sen_interval;
    private javax.swing.JTextField txt_add_sengrp_category;
    private javax.swing.JTextField txt_add_sengrp_id;
    private javax.swing.JTextField txt_add_sengrp_name;
    private javax.swing.JTextField txt_add_sense_brand;
    private javax.swing.JTextField txt_add_sense_id;
    private javax.swing.JTextField txt_add_sense_model;
    private javax.swing.JTextField txt_add_sense_purpose;
    // End of variables declaration//GEN-END:variables

}
