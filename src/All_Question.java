import java.sql.*;
import Project.ConnectionProvider;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author ROHAN
 */
public class All_Question extends javax.swing.JFrame {

    /**
     * Creates new form All_Question
     */
    public All_Question() {
        initComponents();
        show_user();


     

//        try {
//             Connection con=ConnectionProvider.getCon();
//             Statement st = con.createStatement();
//            ResultSet rs=st.executeQuery("select * from rohan");
//
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//
//            System.out.println("in try");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            System.out.println("in catch");
//        }
    }

    public ArrayList<User> userList(){
        ArrayList<User> rohanList = new ArrayList<>();
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems?zeroDateTimeBehavior=CONVERT_TO_NULL","root","969276");
                System.out.println("Connected second");

                String query1="select * from rohan";
                Statement st = con.createStatement();
                ResultSet rs=st.executeQuery(query1);
                User user;

                while(rs.next()){
                    user= new User(rs.getString("id"), rs.getString("name"), rs.getString("opt1"), rs.getString("opt2"), rs.getString("opt3"), rs.getString("opt4"), rs.getString("answer"), rs.getString("subject"));
                    rohanList.add(user);
                }

                query1="select * from python";
                st = con.createStatement();
                rs=st.executeQuery(query1);
                while(rs.next()){
                    user= new User(rs.getString("id"), rs.getString("name"), rs.getString("opt1"), rs.getString("opt2"), rs.getString("opt3"), rs.getString("opt4"), rs.getString("answer"), rs.getString("subject"));
                    rohanList.add(user);
                }
                query1="select * from csharp";
                st = con.createStatement();
                rs=st.executeQuery(query1);
                while(rs.next()){
                    user= new User(rs.getString("id"), rs.getString("name"), rs.getString("opt1"), rs.getString("opt2"), rs.getString("opt3"), rs.getString("opt4"), rs.getString("answer"), rs.getString("subject"));
                    rohanList.add(user);
                }
                query1="select * from dotnet";
                st = con.createStatement();
                rs=st.executeQuery(query1);
                while(rs.next()){
                    user= new User(rs.getString("id"), rs.getString("name"), rs.getString("opt1"), rs.getString("opt2"), rs.getString("opt3"), rs.getString("opt4"), rs.getString("answer"), rs.getString("subject"));
                    rohanList.add(user);
                }
                query1="select * from linux";
                st = con.createStatement();
                rs=st.executeQuery(query1);
                while(rs.next()){
                    user= new User(rs.getString("id"), rs.getString("name"), rs.getString("opt1"), rs.getString("opt2"), rs.getString("opt3"), rs.getString("opt4"), rs.getString("answer"), rs.getString("subject"));
                    rohanList.add(user);
                }





            }
            catch(Exception e)
            {
                System.out.println("catch block...........");
                 return (null);
            }

                return rohanList;


    }
    public void show_user(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[8];
        for (int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getopt1();
            row[3]=list.get(i).getopt2();
            row[4]=list.get(i).getopt3();
            row[5]=list.get(i).getopt4();
            row[6]=list.get(i).getanswer();
            row[7]=list.get(i).getsubject();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all questions.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("all_questions");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 13, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 1958, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "opt1", "opt2", "opt3", "opt4", "answer", "subject"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1490, 680));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background admin ok.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        admineHome.open=0;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(All_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(All_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(All_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(All_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new All_Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private static class DbUtils {

        private static TableModel ResultSetTOTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet.");
            
//            throw new UnsupportedOperationException("Not supported yet.");



        }

        private static TableModel resultSetToTableModel(ResultSet rs) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

       
}
}