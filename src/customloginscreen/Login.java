package customloginscreen;

import com.formdev.flatlaf.IntelliJTheme;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton_LogInWithGoogle = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel_ForgotYourPassword = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton_Login = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Custom Login Screen");
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 215));

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome Back");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 50));

        jButton_LogInWithGoogle.setText("Log in with Google");
        jButton_LogInWithGoogle.setPreferredSize(new java.awt.Dimension(250, 30));
        jButton_LogInWithGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogInWithGoogleActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_LogInWithGoogle);

        jPanel1.add(jPanel3);

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 150));

        jPanel6.setMinimumSize(new java.awt.Dimension(66, 38));
        jPanel6.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel6.setLayout(new java.awt.BorderLayout(4, 4));

        jTextField1.setForeground(new java.awt.Color(255, 0, 102));
        jPanel6.add(jTextField1, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Email Address");
        jPanel6.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.add(jPanel6);

        jPanel7.setMinimumSize(new java.awt.Dimension(66, 38));
        jPanel7.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel7.setLayout(new java.awt.BorderLayout(4, 4));

        jLabel3.setText("Password");
        jPanel7.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPasswordField1.setForeground(new java.awt.Color(255, 0, 102));
        jPanel7.add(jPasswordField1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("Remember me");
        jPanel8.add(jCheckBox1, java.awt.BorderLayout.WEST);

        jLabel_ForgotYourPassword.setForeground(new java.awt.Color(255, 0, 102));
        jLabel_ForgotYourPassword.setText("Forgot your password?");
        jLabel_ForgotYourPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_ForgotYourPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ForgotYourPasswordMouseClicked(evt);
            }
        });
        jPanel8.add(jLabel_ForgotYourPassword, java.awt.BorderLayout.EAST);

        jPanel5.add(jPanel8);

        jPanel1.add(jPanel5);

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 40));

        jButton_Login.setText("Login");
        jButton_Login.setPreferredSize(new java.awt.Dimension(250, 30));
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel9.add(jButton_Login);

        jPanel1.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 40));

        jLabel5.setText("Don't have an account yet? Sign up.");
        jPanel10.add(jLabel5);

        jPanel1.add(jPanel10);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 215));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 75);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/My Computer.png"))); // NOI18N
        jPanel2.add(jLabel6);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LogInWithGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogInWithGoogleActionPerformed
//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestEmail()
//                .build();

    }//GEN-LAST:event_jButton_LogInWithGoogleActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jLabel_ForgotYourPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ForgotYourPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_ForgotYourPasswordMouseClicked

    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(Login.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LogInWithGoogle;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_ForgotYourPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
