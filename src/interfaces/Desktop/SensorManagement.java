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

    /**
     * Creates new form Login
     */
    public SensorManagement() {
        try {
            sos.deserialize();
        } catch (Exception e) {
        }

        initComponents();

        sensorTableLoad(sos, jTable1, jScrollPane1);
        sensorTableLoad(sos, jTable2, jScrollPane2);
        sensorTableLoad(sos, jTable3, jScrollPane3);
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

        for (AirTemperatureSensor item: ats) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getName());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("AirTemperatureSensor");

            tmp.add(row);
        }
        for (CropMoistureSensor item: cms) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getName());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("CropMoistureSensor");

            tmp.add(row);
        }
        for (LightSensor item: ls) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getName());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("LightSensor");

            tmp.add(row);
        }
        for (SoilAciditySensor item: sas) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getName());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("SoilAciditySensor");

            tmp.add(row);
        }
        for (RainfallSensor item: rfs) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getName());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("RainfallSensor");

            tmp.add(row);
        }
        for (SoilTemperatureSensor item: sts) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getName());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("SoilTemperatureSensor");

            tmp.add(row);
        }
        for (WindSensor item: ws) {
            Vector row = new Vector();
            row.addElement(item.getSensorID());
            row.addElement(item.getName());
            row.addElement(item.getModel());
            row.addElement(item.getBrand());
            row.addElement(item.getPurpose());
            row.addElement("WindSensor");

            tmp.add(row);
        }

        //set column headings
        Vector columnNames = new Vector();
        columnNames.addElement("Sensor ID");
        columnNames.addElement("Name");
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
        btn_adduser = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txt_add_sense_model = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        DeleteSensor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_delete_name = new javax.swing.JLabel();
        lbl_delete_type = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        AddSensorGroup = new javax.swing.JPanel();
        txt_add_email1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btn_adduser1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txt_add_username3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmb_add_type1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cmb_add_type3 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_add_name2 = new javax.swing.JTextField();
        cmb_add_type2 = new javax.swing.JComboBox<>();
        EditSensorGroup = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        btn_adduser.setText("Add Sensor");
        btn_adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adduserActionPerformed(evt);
            }
        });
        AddSensor.add(btn_adduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, 30));

        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        AddSensor.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 120, 30));

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
        jScrollPane3.setViewportView(jTable3);

        AddSensor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 370));

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

        DeleteSensor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 700, 300));

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
        DeleteSensor.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 120, 30));
        DeleteSensor.add(lbl_delete_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 120, 30));
        DeleteSensor.add(lbl_delete_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 30));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        DeleteSensor.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        jTabbedPane1.addTab("Delete Sensor", DeleteSensor);

        AddSensorGroup.setBackground(new java.awt.Color(255, 255, 255));
        AddSensorGroup.setPreferredSize(new java.awt.Dimension(1000, 620));
        AddSensorGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        AddSensorGroup.add(txt_add_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, 30));

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Name");
        AddSensorGroup.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 30));

        btn_adduser1.setText("Add Sensor");
        btn_adduser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adduser1ActionPerformed(evt);
            }
        });
        AddSensorGroup.add(btn_adduser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 120, 30));

        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        AddSensorGroup.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, 30));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        AddSensorGroup.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 900, 160));

        jLabel22.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Category");
        AddSensorGroup.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 30));

        txt_add_username3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        txt_add_username3.setForeground(new java.awt.Color(102, 102, 102));
        AddSensorGroup.add(txt_add_username3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 280, 30));

        jLabel23.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("No. Of Sensors");
        AddSensorGroup.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Add Sensor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Sensor");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));

        cmb_add_type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmer", "Food Processing Manager" }));
        jPanel1.add(cmb_add_type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, 30));

        jButton1.setText("Available");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, 30));

        cmb_add_type3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmer", "Food Processing Manager" }));
        jPanel1.add(cmb_add_type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 220, 30));

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Type");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 30));

        jButton2.setText("Add");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 70, 30));

        AddSensorGroup.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 470, 230));

        jLabel26.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Add Sensor Group");
        AddSensorGroup.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 30));

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Desktop/Images/grass_PNG401.png"))); // NOI18N
        AddSensorGroup.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 600));

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("ID");
        AddSensorGroup.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 30));
        AddSensorGroup.add(txt_add_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 280, 30));

        cmb_add_type2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmer", "Food Processing Manager" }));
        AddSensorGroup.add(cmb_add_type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 240, 30));

        jTabbedPane1.addTab("Add Sensor Group", AddSensorGroup);

        EditSensorGroup.setBackground(new java.awt.Color(255, 255, 255));
        EditSensorGroup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Edit Sensor Group");
        EditSensorGroup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 30));

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

        EditSensorGroup.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 770, 170));

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

    private void btn_adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adduserActionPerformed

        String id = txt_add_sense_id.getText().toString();
        String brand = txt_add_sense_brand.getText().toString();
        String purpose = txt_add_sense_purpose.getText().toString();
        String model = txt_add_sense_model.getText().toString();
        String type = cmb_add_sense_type.getSelectedItem().toString();

        if (txt_add_sense_id.getText().isEmpty() | txt_add_sense_brand.getText().isEmpty() | txt_add_sense_purpose.getText().isEmpty() | txt_add_sense_model.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields.");
        }else{
            if (type.equalsIgnoreCase("Farmer")) {
                Farmer fm = new Farmer(id, purpose, model, brand);
                sou.addFarmer(fm);

                try {
                    sou.serialize();
                    JOptionPane.showMessageDialog(rootPane, "User successfully Added");

                    sou.deserialize();
                    userTableLoad(sou, jTable1, jScrollPane1);
                    userTableLoad(sou, jTable2, jScrollPane2);
                    userTableLoad(sou, jTable3, jScrollPane3);

                    txt_add_sense_id.setText(null);
                    txt_add_sense_brand.setText(null);
                    txt_add_sense_purpose.setText(null);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Food Processing Manager")) {
                Manager mn = new Manager(name, username, email, password, type);
                sou.addManager(mn);

                try {
                    sou.serialize();
                    JOptionPane.showMessageDialog(rootPane, "User successfully Added");

                    sou.deserialize();
                    userTableLoad(sou, jTable1, jScrollPane1);
                    userTableLoad(sou, jTable2, jScrollPane2);
                    userTableLoad(sou, jTable3, jScrollPane3);

                    txt_add_sense_id.setText(null);
                    txt_add_sense_brand.setText(null);
                    txt_add_sense_purpose.setText(null);
                } catch (Exception e1) {
                }
            }
        }
    }//GEN-LAST:event_btn_adduserActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        txt_add_sense_id.setText(null);
        txt_add_sense_brand.setText(null);
        txt_add_sense_purpose.setText(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        //get the member number of the selected row
        lbl_edit_name.setText(jTable1.getValueAt(r, 3).toString());
        txt_edit_username.setText(jTable1.getValueAt(r, 1).toString());
        txt_edit_email.setText(jTable1.getValueAt(r, 2).toString());
        lbl_edit_type.setText(jTable1.getValueAt(r, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String name = lbl_edit_name.getText().toString();
        String email = txt_edit_email.getText().toString();
        String username = txt_edit_username.getText().toString();
        String type = lbl_edit_type.getText().toString();

        if (txt_edit_email.getText().isEmpty() | txt_edit_username.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields.");
        } else{
            if (type.equalsIgnoreCase("Farmer")) {
                Farmer fmr = sou.getFarmerByName(name);
                String password = fmr.getPassword();
                sou.removeFarmer(fmr);

                Farmer fm = new Farmer(name, username, email, password, type);
                sou.addFarmer(fm);

                try {
                    sou.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Saved");

                    sou.deserialize();
                    userTableLoad(sou, jTable1, jScrollPane1);
                    userTableLoad(sou, jTable2, jScrollPane2);
                    userTableLoad(sou, jTable3, jScrollPane3);

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
                    userTableLoad(sou, jTable1, jScrollPane1);
                    userTableLoad(sou, jTable2, jScrollPane2);
                    userTableLoad(sou, jTable3, jScrollPane3);

                    lbl_edit_name.setText(null);
                    txt_edit_email.setText(null);
                    txt_edit_username.setText(null);
                    lbl_edit_type.setText(null);
                } catch (Exception e1) {
                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String name = lbl_delete_name.getText().toString();
        String type = lbl_delete_type.getText().toString();

        int x = JOptionPane.showConfirmDialog(rootPane, "Are you sure about this?");
        System.out.println(x);
        
        if (x == 0) {
            if (type.equalsIgnoreCase("Farmer")) {
                Farmer fmr = sou.getFarmerByName(name);
                sou.removeFarmer(fmr);

                try {
                    sou.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Delete");

                    sou.deserialize();
                    userTableLoad(sou, jTable1, jScrollPane1);
                    userTableLoad(sou, jTable2, jScrollPane2);
                    userTableLoad(sou, jTable3, jScrollPane3);
                } catch (Exception e1) {
                }
            } else if (type.equalsIgnoreCase("Food Processing Manager")) {
                Manager mnr = sou.getManagerByName(name);
                sou.removeManager(mnr);

                try {
                    sou.serialize();
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");

                    sou.deserialize();
                    userTableLoad(sou, jTable1, jScrollPane1);
                    userTableLoad(sou, jTable2, jScrollPane2);
                    userTableLoad(sou, jTable3, jScrollPane3);
                } catch (Exception e1) {
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "bla bla bla");
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int r = jTable2.getSelectedRow();
        lbl_delete_name.setText(jTable2.getValueAt(r, 1).toString());
        lbl_delete_type.setText(jTable2.getValueAt(r, 4).toString());

    }//GEN-LAST:event_jTable2MouseClicked

    private void txt_add_sense_purposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_add_sense_purposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_add_sense_purposeActionPerformed

    private void btn_adduser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adduser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_adduser1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(SensorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SensorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SensorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SensorManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JLabel background4;
    private javax.swing.JButton btn_adduser;
    private javax.swing.JButton btn_adduser1;
    private javax.swing.JComboBox<String> cmb_add_sense_type;
    private javax.swing.JComboBox<String> cmb_add_type1;
    private javax.swing.JComboBox<String> cmb_add_type2;
    private javax.swing.JComboBox<String> cmb_add_type3;
    private javax.swing.JComboBox<String> cmb_add_type4;
    private javax.swing.JComboBox<String> cmb_add_type5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_delete_name;
    private javax.swing.JLabel lbl_delete_name1;
    private javax.swing.JLabel lbl_delete_type;
    private javax.swing.JLabel lbl_delete_type1;
    private javax.swing.JTextField txt_add_email1;
    private javax.swing.JTextField txt_add_name2;
    private javax.swing.JTextField txt_add_sense_brand;
    private javax.swing.JTextField txt_add_sense_id;
    private javax.swing.JTextField txt_add_sense_model;
    private javax.swing.JTextField txt_add_sense_purpose;
    private javax.swing.JTextField txt_add_username3;
    // End of variables declaration//GEN-END:variables

}
