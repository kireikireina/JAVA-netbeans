package restaurant;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        initComponents();
        init();
    }
    
    public void getFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);
    }
    
    private double total=0.0;
    private int x=0;
    private double ppn = 0.0;
    
    public void init(){
        setPutu();
    }
    
    public void setPutu(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/foto/Vanilla.jpg"));
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/foto/strawberry.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/foto/blueberry.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/foto/Sandwitch.jpg"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/foto/Chocolate.jpg"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/foto/Cookies & Cream.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/foto/Cotton Candy.jpg"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/foto/Mocha.jpg"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/foto/Coffeee Latte.jpg"));
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/foto/Iced Americano.png"));
        
        Image img = icon.getImage().getScaledInstance(jLabelimage.getWidth(), jLabelimage.getHeight(),Image.SCALE_SMOOTH);
        Image img1 = icon1.getImage().getScaledInstance(jLabelimage1.getWidth(), jLabelimage1.getHeight(),Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(jLabelimage2.getWidth(), jLabelimage2.getHeight(),Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(jLabelimage3.getWidth(), jLabelimage3.getHeight(),Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(jLabelimage4.getWidth(), jLabelimage4.getHeight(),Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(jLabelimage5.getWidth(), jLabelimage5.getHeight(),Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(jLabelimage6.getWidth(), jLabelimage6.getHeight(),Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(jLabelimage7.getWidth(), jLabelimage7.getHeight(),Image.SCALE_SMOOTH);
        Image img8 = icon8.getImage().getScaledInstance(jLabelimage8.getWidth(), jLabelimage8.getHeight(),Image.SCALE_SMOOTH);
        Image img9 = icon9.getImage().getScaledInstance(jLabelimage9.getWidth(), jLabelimage9.getHeight(),Image.SCALE_SMOOTH);
        
        jLabelimage.setIcon(new ImageIcon(img));
        jLabelimage1.setIcon(new ImageIcon(img1));
        jLabelimage2.setIcon(new ImageIcon(img2));
        jLabelimage3.setIcon(new ImageIcon(img3));
        jLabelimage4.setIcon(new ImageIcon(img4));
        jLabelimage5.setIcon(new ImageIcon(img5));
        jLabelimage6.setIcon(new ImageIcon(img6));
        jLabelimage7.setIcon(new ImageIcon(img7));
        jLabelimage8.setIcon(new ImageIcon(img8));
        jLabelimage9.setIcon(new ImageIcon(img9));

    }
    
    public boolean qtyIsZero(int qty){
        if(qty==0){
            JOptionPane.showMessageDialog(null, "Tolong masukkan jumlah item terlebih dahulu");
        return false;
        }return true;
    }
    
    public void reset(){
        total=0.0;
        x = 0;
        ppn = 0.0;
        buttonTotal.setEnabled(true);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
//        jSpinner6.setValue(0);
//        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
//        jSpinner10.setValue(0);
////        jSpinner11.setValue(0);
////        jSpinner12.setValue(0);
////        jSpinner13.setValue(0);
////        jSpinner14.setValue(0);
////        jSpinner15.setValue(0);
        PPN.setText("0.0");
        SubTotal.setText("0.0");
        Total.setText("0.0");
        jTextArea1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
//        jCheckBox10.setSelected(false);
//        jCheckBox11.setSelected(false);
//        jCheckBox12.setSelected(false);
//        jCheckBox13.setSelected(false);
//        jCheckBox14.setSelected(false);
//        jCheckBox15.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelimage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabelimage1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabelimage2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabelimage3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabelimage4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jLabelimage5 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabelimage6 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabelimage7 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabelimage8 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jLabelimage9 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jCheckBox10 = new javax.swing.JCheckBox();
        buttonTotal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        Total = new javax.swing.JTextField();
        PPN = new javax.swing.JTextField();
        SubTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setFocusable(false);
        jPanel1.setName(""); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setFocusCycleRoot(true);
        jPanel3.setFocusable(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel4.setFocusable(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabelimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 124, 111));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Harga");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Pilih");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 197, 41, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Vanilla");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 119, 108, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("20k");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 145, 41, -1));

        jSpinner1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 168, 57, 22));

        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 196, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 85, -1, 230));

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel5.setFocusable(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabelimage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 124, 111));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Harga");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Jumlah");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Pilih");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 41, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Strawberry");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 119, 124, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("23k");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 145, 41, -1));

        jSpinner2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 168, 57, 22));

        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 196, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 85, -1, 230));

        jPanel6.setBackground(new java.awt.Color(250, 250, 250));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel6.setFocusable(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jLabelimage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 128, 111));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Harga:");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Jumlah:");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Pilih:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 197, 41, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Blueberry");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 119, 128, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("23k");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 145, 41, -1));

        jSpinner3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 168, 57, 22));

        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel6.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 196, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 85, -1, 230));

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel7.setFocusable(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jLabelimage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 136, 111));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Harga:");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Jumlah:");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Pilih:");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 41, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Sando");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 119, 130, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("30k");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 145, 41, -1));

        jSpinner4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 168, 57, 22));

        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 196, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 85, 140, 230));

        jPanel8.setBackground(new java.awt.Color(250, 250, 250));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel8.setFocusable(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jLabelimage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 111));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Harga:");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Jumlah:");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Pilih:");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 41, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Chocolate");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 119, 108, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("20k");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 145, 41, -1));

        jSpinner5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 168, 57, 22));

        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel8.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 196, -1, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 85, 140, 230));

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel9.setFocusable(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jLabelimage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 126, 111));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Harga:");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Jumlah:");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Pilih:");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 41, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Cookies");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 119, 126, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText("25k");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 145, 41, -1));

        jSpinner6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 168, 57, 22));

        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel9.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 196, -1, -1));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 320, -1, 220));

        jPanel11.setBackground(new java.awt.Color(250, 250, 250));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel11.setFocusable(false);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jLabelimage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 124, 111));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Harga:");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("Jumlah:");
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel49.setText("Pilih:");
        jPanel11.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 197, 41, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Cotton Candy");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 119, 124, -1));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel51.setText("30k");
        jPanel11.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 145, 41, -1));

        jSpinner8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 168, 57, 22));

        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel11.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 196, -1, -1));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 320, 126, 220));

        jPanel12.setBackground(new java.awt.Color(250, 250, 250));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel12.setFocusable(false);
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jLabelimage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 131, 111));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("Harga:");
        jPanel12.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Jumlah:");
        jPanel12.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, -1, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Pilih:");
        jPanel12.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 41, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Mocha");
        jPanel12.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 119, 131, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel57.setText("23k");
        jPanel12.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 145, 41, -1));

        jSpinner9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 168, 57, 22));

        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel12.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 196, -1, -1));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 320, 132, 220));

        jPanel13.setBackground(new java.awt.Color(250, 250, 250));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel13.setFocusable(false);
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jLabelimage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 137, 111));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setText("Harga:");
        jPanel13.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setText("Jumlah:");
        jPanel13.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, 55, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setText("Pilih:");
        jPanel13.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 41, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Coffee Latte");
        jPanel13.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 119, 137, -1));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel63.setText("27k");
        jPanel13.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 145, 41, -1));

        jSpinner10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 168, 57, 22));

        jCheckBox9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 196, -1, -1));

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 320, -1, 222));

        jPanel14.setBackground(new java.awt.Color(250, 250, 250));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel14.setFocusable(false);
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jLabelimage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 136, 111));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setText("Harga:");
        jPanel14.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 145, 49, -1));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel66.setText("Jumlah:");
        jPanel14.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 171, 55, -1));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel67.setText("Pilih:");
        jPanel14.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 41, -1));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Iced Americano");
        jPanel14.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 119, 136, -1));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel69.setText("20k");
        jPanel14.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 145, 41, -1));

        jSpinner11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jSpinner11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 168, 57, 22));

        jCheckBox10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 196, -1, -1));

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 320, 139, 222));

        buttonTotal.setBackground(new java.awt.Color(255, 153, 153));
        buttonTotal.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        buttonTotal.setForeground(new java.awt.Color(255, 255, 255));
        buttonTotal.setText("Total");
        buttonTotal.setBorder(null);
        buttonTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTotal.setFocusable(false);
        buttonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTotalActionPerformed(evt);
            }
        });
        jPanel3.add(buttonTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 580, 139, 48));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("About Us");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 139, 48));

        hapus.setBackground(new java.awt.Color(255, 153, 153));
        hapus.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Hapus");
        hapus.setBorder(null);
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.setFocusable(false);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel3.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 133, 48));

        exit.setBackground(new java.awt.Color(255, 153, 153));
        exit.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.setBorder(null);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusable(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 139, 48));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 270, 286));

        jPanel20.setBackground(new java.awt.Color(255, 204, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.setFocusable(false);
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Total.setEditable(false);
        Total.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total.setText("0.0");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel20.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 100, 132, 30));

        PPN.setEditable(false);
        PPN.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        PPN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PPN.setText("0.0");
        PPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPNActionPerformed(evt);
            }
        });
        jPanel20.add(PPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 28, 132, 30));

        SubTotal.setEditable(false);
        SubTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        SubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SubTotal.setText("0.0");
        SubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalActionPerformed(evt);
            }
        });
        jPanel20.add(SubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 64, 132, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("PPN");
        jPanel20.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 31, 41, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Sub Total");
        jPanel20.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 67, 113, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Total");
        jPanel20.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 106, 48, -1));

        jPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 275, 160));

        jLabel1.setFont(new java.awt.Font("Freestyle Script", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nice Cream");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPNActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        arigatou ag = new arigatou();
        ag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        reset();
    }//GEN-LAST:event_hapusActionPerformed

    private void buttonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTotalActionPerformed
        if(total==0.0){
            JOptionPane.showMessageDialog(null, "Anda belum memilih apapun!");
        }else {
            jTextArea1.setText(jTextArea1.getText()+"\n"+"PPN: \t\t\t"+ppn+"\n"+"Sub Total: \t\t\t"+total+"\n"+"Total: \t\t\t"+(total+ppn)+"\n\n");
            
            PPN.setText(Double.toString(ppn));
            SubTotal.setText(Double.toString(total));
            Total.setText(Double.toString(total+ppn));
            
        }
    }//GEN-LAST:event_buttonTotalActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        int qty = Integer.parseInt(jSpinner11.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox10.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*20000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel68.getText()+"\t\t"+harga+"\n");
        }else{
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox9.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*27000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel62.getText()+"\t\t"+harga+"\n");
        }else{
            jCheckBox9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        int qty = Integer.parseInt(jSpinner9.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox8.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*23000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel56.getText()+"\t\t\t"+harga+"\n");
        }else{
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox7.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*30000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel50.getText()+"\t\t"+harga+"\n");
        }else{
            jCheckBox7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        int qty = Integer.parseInt(jSpinner6.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox6.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*25000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel38.getText()+"\t\t\t"+harga+"\n");
        }else{
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        int qty = Integer.parseInt(jSpinner5.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox5.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*20000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel32.getText()+"\t\t\t"+harga+"\n");
        }else{
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox4.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*30000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel26.getText()+"\t\t\t"+harga+"\n");
        }else{
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        int qty = Integer.parseInt(jSpinner3.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox3.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*23000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel20.getText()+"\t\t\t"+harga+"\n");
        }else{
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox2.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*23000;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel14.getText()+"\t\t\t"+harga+"\n");
        }else{
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        if((qtyIsZero(qty) && jCheckBox1.isSelected())){
            x++;
            if(x==1){
                eskrim();
            }
            double harga = qty*20000.0;
            total += harga;
            getPpn((int) total);
            jTextArea1.setText(jTextArea1.getText()+x+". "+jLabel8.getText()+"\t\t\t"+harga+"\n");
        }else{
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void SubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        about n = new about();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void eskrim(){
        jTextArea1.setText("================ NiceCream ================\n\n"
        +"Item pilihan:\t\t\t"+"Harga (IDR)\n");
    }
    
    
    public void getPpn(int t){
        ppn = (total*0.1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PPN;
    private javax.swing.JTextField SubTotal;
    private javax.swing.JTextField Total;
    private javax.swing.JButton buttonTotal;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelimage;
    private javax.swing.JLabel jLabelimage1;
    private javax.swing.JLabel jLabelimage2;
    private javax.swing.JLabel jLabelimage3;
    private javax.swing.JLabel jLabelimage4;
    private javax.swing.JLabel jLabelimage5;
    private javax.swing.JLabel jLabelimage6;
    private javax.swing.JLabel jLabelimage7;
    private javax.swing.JLabel jLabelimage8;
    private javax.swing.JLabel jLabelimage9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
