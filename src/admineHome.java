import javax.swing.JFrame;
import javax.swing.JOptionPane;

        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ROHAN
 */
import javax.swing.JOptionPane;
public class admineHome extends javax.swing.JFrame {
public static int open=0;
    /**
     * Creates new form admineHome
     */
    public admineHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu58 = new javax.swing.JMenu();
        jMenu98 = new javax.swing.JMenu();
        jMenu114 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -330, 2260, 1170));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        jMenu1.setText("Add New Question");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update Question.png"))); // NOI18N
        jMenu2.setText("Update Question");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all questions.png"))); // NOI18N
        jMenu10.setText("All Question");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu10.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        jMenu26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        jMenu26.setText("Delete Question");
        jMenu26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu26.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu26MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu26);

        jMenu58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all student result.png"))); // NOI18N
        jMenu58.setText("All Student Result");
        jMenu58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu58.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu58MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu58);

        jMenu98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        jMenu98.setText("Logout");
        jMenu98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu98.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu98MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu98);

        jMenu114.setBackground(new java.awt.Color(255, 0, 102));
        jMenu114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jMenu114.setText("Exit");
        jMenu114.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu114.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu114MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu114);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu114MouseClicked
        // TODO add your handling code here:
        JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        int a=JOptionPane.showConfirmDialog(jf,"do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu114MouseClicked

    private void jMenu98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu98MouseClicked
        JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        int a=JOptionPane.showConfirmDialog(jf,"Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);// TODO add your handling code here:
        if(a==0)
        {
            setVisible(false);
            new loginAdmine().setVisible(true);
        }
    }//GEN-LAST:event_jMenu98MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        if(open==0)
        {
            new AddNewQuestion().setVisible(true);
            open=1;
        }
        else
        {
            JFrame jf=new JFrame();
            jf.setVisible(true);
            JOptionPane.showMessageDialog(jf,"One From Is Already Opened");
        }
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
          if(open==0)
        {
            new updateQuestion().setVisible(true);
            open=1;
        }
        else
        {
            JFrame jf=new JFrame();
            jf.setVisible(true);
            JOptionPane.showMessageDialog(jf,"One From Is Already Opened");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
    final boolean v = true;
         if(open==0)
        {
            new All_Question().setVisible(true);
            open=1;
        }
        else
        {
            JFrame jf=new JFrame();
            jf.setVisible(true);
            JOptionPane.showMessageDialog(jf,"One From Is Already Opened");
        }

    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void jMenu26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu26MouseClicked
        if (open==0)
        {
            new deleteQuestion().setVisible(true);
            open=1;
        }
        else
        {
            JFrame jf=new JFrame();
            jf.setVisible(true);
            JOptionPane.showMessageDialog(jf,"One From Is Already Opened");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jMenu26MouseClicked

    private void jMenu58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu58MouseClicked
        // TODO add your handling code here:
         if (open==0)
        {
            new AllStudentResult().setVisible(true);
            open=1;
        }
        else
        {
            JFrame jf=new JFrame();
            jf.setVisible(true);
            JOptionPane.showMessageDialog(jf,"One From Is Already Opened");
        }
    }//GEN-LAST:event_jMenu58MouseClicked

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
            java.util.logging.Logger.getLogger(admineHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admineHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admineHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admineHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admineHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu114;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu58;
    private javax.swing.JMenu jMenu98;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
