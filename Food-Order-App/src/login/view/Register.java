package login.view;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import restaurant.Dashboard;

public class Register extends javax.swing.JFrame {


    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idreg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userreg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pasreg = new javax.swing.JPasswordField();
        btnsignupreg = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icon/eskrim2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(450, 400));
        jLabel1.setMinimumSize(new java.awt.Dimension(450, 400));
        jLabel1.setPreferredSize(new java.awt.Dimension(4950, 400));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Freehand521 BT", 0, 24)); // NOI18N
        jLabel2.setText("Register Form");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 41, -1));

        idreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idregActionPerformed(evt);
            }
        });
        jPanel2.add(idreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 280, -1));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 88, -1));
        jPanel2.add(userreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 280, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 72, -1));

        pasreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasregActionPerformed(evt);
            }
        });
        jPanel2.add(pasreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 280, -1));

        btnsignupreg.setBackground(new java.awt.Color(0, 255, 204));
        btnsignupreg.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnsignupreg.setForeground(new java.awt.Color(255, 255, 255));
        btnsignupreg.setText("Sign Up");
        btnsignupreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignupreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupregActionPerformed(evt);
            }
        });
        jPanel2.add(btnsignupreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 90, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idregActionPerformed
           
    }//GEN-LAST:event_idregActionPerformed

    private void pasregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasregActionPerformed

    private void btnsignupregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupregActionPerformed
        String id = idreg.getText().toString().trim();
        String username = userreg.getText().toString().trim();
        String password = pasreg.getText().toString().trim();
        
        if(id.equals("") || password.equals("") || username.equals("")){
            JOptionPane.showMessageDialog(null, "Semua data harus diisi!");
        }else{
            try{
                Connection c = koneksi.getkoneksi();
                String sql = "INSERT INTO login VALUES (?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id);
                p.setString(2, username);
                p.setString(3, password);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Registrasi Berhasil!");
                
            }catch(SQLException e){
                System.out.println("Error");
            }finally{
                this.dispose();
                login n = new login();
                n.setVisible(true);
            }
        } 
    }//GEN-LAST:event_btnsignupregActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignupreg;
    private javax.swing.JTextField idreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pasreg;
    private javax.swing.JTextField userreg;
    // End of variables declaration//GEN-END:variables
}
