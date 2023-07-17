package sodokugame;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Khuy
 */

public class AboutUs extends javax.swing.JFrame {
    MenuJFrame menuJFrame;
    /**
     * Creates new form AboutUs
     */
    public AboutUs() {
        initComponents();
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/iconSodoku.png")));
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
       // this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setTitle("About Us");
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
               // Perform the desired function here
               menuJFrame = new MenuJFrame();
               menuJFrame.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        panel1 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBackAboutUs = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        lbTitle = new java.awt.Label();
        lblSchool1 = new java.awt.Label();
        lblSchool2 = new java.awt.Label();
        lblSchool3 = new java.awt.Label();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AboutUs");
        setBackground(new java.awt.Color(255, 0, 0));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Trần Văn Minh Phụng");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(94, 130));
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Hứa Khánh Huy");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(94, 130));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Nguyễn Hải Nam");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(94, 130));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Trần Minh Thắng");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(94, 130));
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Trần Minh Tiến");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(94, 130));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Mentor: Lê Thị Phương Dung");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setInheritsPopupMenu(false);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnBackAboutUs.setText("Back");
        btnBackAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackAboutUsActionPerformed(evt);
            }
        });

        jLabel8.setText("CE171778");

        jLabel11.setText("CE171450");

        jLabel12.setText("CE170901");

        jLabel13.setText("CE170148");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel14.setText("CE171682");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(115, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel12)
                                        .addGap(98, 98, 98))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)))
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(102, 102, 102))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(42, 42, 42))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnBackAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 103, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))))
                        .addGap(107, 107, 107)
                        .addComponent(btnBackAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(51, 204, 255));

        lbTitle.setAlignment(java.awt.Label.CENTER);
        lbTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("ABOUT US");

        lblSchool1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSchool1.setText("Semeter:  SU23");

        lblSchool2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSchool2.setText("Class: SE1708");

        lblSchool3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSchool3.setText("Course: CSD201");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblSchool1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSchool2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(lblSchool3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSchool1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSchool3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSchool2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackAboutUsActionPerformed

        dispose();
        // Perform the desired function here
        menuJFrame = new MenuJFrame();
        menuJFrame.setVisible(true);
    }//GEN-LAST:event_btnBackAboutUsActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AboutUs().setVisible(true);
//            }
//        });
//        
//      btnBackAboutUs  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackAboutUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label lbTitle;
    private java.awt.Label lblSchool1;
    private java.awt.Label lblSchool2;
    private java.awt.Label lblSchool3;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
