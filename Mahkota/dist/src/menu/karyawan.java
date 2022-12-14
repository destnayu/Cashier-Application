/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kontrol.koneksi;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author ayu yanti
 */
public final class karyawan extends javax.swing.JFrame {
private final Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
    /**
     * Creates new form karyawan
     */
    public karyawan() {
        initComponents();
        kosong();
        aktif();
        datatable();
        id();
    
        // mengambil ukuran layar tengah
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

private void id() {
        try{
 String sql = "SELECT id_karyawan FROM karyawan order by id_karyawan asc";
 Statement stat = conn.createStatement();
 ResultSet rs=stat.executeQuery(sql);

 while(rs.next()){
 String id_barang = rs.getString("id_karyawan").substring(2);
 int nomor = Integer.parseInt(id_barang) + 1;
 String nol = "";

 if (nomor<10)
 {nol = "000";}
 else if (nomor<100)
 {nol = "00";}
 else if (nomor<1000)
 {nol = "";}

 tfid.setText("K" + nol + nomor);
 }
 }
 catch (NumberFormatException | SQLException e){
      JOptionPane.showMessageDialog(null,"Penomoran Salah" + e);
 }
    }   

public void kosong(){
        tfid.setText("");
        tfnama.setText("");
        taalamat.setText("");
        buttonGroup1.clearSelection();
        cbjabatan.setSelectedItem(null);
        tfhp.setText("");
}
protected void aktif(){
tfid.requestFocus();
cbjabatan.setSelectedItem(null);
}
protected void datatable(){
Object[] Baris ={"Id Karyawan","Nama Karyawan","Alamat Karyawan","Jenis Kelamin","Jabatan","No HP"};
tabmode = new DefaultTableModel(null, Baris);
try {
String sql = "SELECT * FROM karyawan";
java.sql.Statement stat = conn.createStatement();
ResultSet hasil = stat.executeQuery(sql);
while (hasil.next()){
tabmode.addRow(new Object[]{
hasil.getString(1),
hasil.getString(2),
hasil.getString(3),
hasil.getString(4),
hasil.getString(5),
hasil.getString(6)
});
}
datakaryawan.setModel(tabmode);
} catch (SQLException e) {
}
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        tfhp = new javax.swing.JTextField();
        btnbatal = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taalamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        cbjabatan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        rblaki = new javax.swing.JRadioButton();
        rbperempuan = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datakaryawan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("DATA KARYAWAN");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Id Karyawan");

        btnsimpan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nama ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("No. HP");

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });

        tfhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhpActionPerformed(evt);
            }
        });

        btnbatal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        taalamat.setColumns(20);
        taalamat.setRows(5);
        jScrollPane2.setViewportView(taalamat);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Jabatan");

        cbjabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemilik", "Manager", "Admin", "Produksi", "Pelayan" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        buttonGroup1.add(rblaki);
        rblaki.setText("L");
        rblaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblakiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbperempuan);
        rbperempuan.setText("P");
        rbperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbperempuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(72, 72, 72)
                            .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rblaki)
                        .addGap(18, 18, 18)
                        .addComponent(rbperempuan))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfhp)
                        .addComponent(cbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnubah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbatal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnhapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnkeluar)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(rblaki)
                    .addComponent(rbperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnubah)
                            .addComponent(btnsimpan)
                            .addComponent(btnbatal)
                            .addComponent(btnhapus)
                            .addComponent(btnkeluar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        datakaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        datakaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datakaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datakaryawan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("DUA MAHKOTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
       String jenis = null;
 if(rblaki.isSelected()){
 jenis = "L";
 }else if(rbperempuan.isSelected()){
 jenis = "P";
 }
        String sql = "insert into karyawan values (?,?,?,?,?,?)";
    try{
    PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tfid.getText());
            stat.setString(2, tfnama.getText());
            stat.setString(3, taalamat.getText());
            stat.setString(4, jenis);
            stat.setString(5, cbjabatan.getSelectedItem().toString());
            stat.setString(6, tfhp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tfid.requestFocus();
            datatable();
            id();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Data Gagal Disimpan "+e);
        }
    
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

    private void tfhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfhpActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"hapus","konfirmasi dialog",JOptionPane.YES_NO_CANCEL_OPTION);
if (ok==0){
String sql = "delete from karyawan where id_karyawan ='"+tfid.getText()+"'";
try{
PreparedStatement stat = conn.prepareStatement(sql);
stat.executeUpdate();
JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
kosong();
tfid.requestFocus();
}
catch (SQLException e){
JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+e);
}
datatable();
id();
}
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
                kosong();
        datatable();
        id();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
        String jenis = null;
 if(rblaki.isSelected()){
 jenis = "L";
 }else if(rbperempuan.isSelected()){
 jenis = "P";
 }
        
        try{
 String sql = "update karyawan set nama_karyawan=?,alamat_karyawan=?,jenis_kelamin=?,jabatan=?,no_hp=? where id_karyawan='"+tfid.getText()+"'";
 PreparedStatement stat = conn.prepareStatement(sql);
 stat.setString(1, tfnama.getText());
 stat.setString(2, taalamat.getText());
 stat.setString(3, jenis);
 stat.setString(4, cbjabatan.getSelectedItem().toString());
 stat.setString(5, tfhp.getText());
 stat.executeUpdate();
 JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
 kosong();
 tfid.requestFocus(); 
 }
 catch (SQLException e){
 JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+e);
 }
 datatable();
id();
    }//GEN-LAST:event_btnubahActionPerformed

    private void datakaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datakaryawanMouseClicked
        // TODO add your handling code here:
        int bar = datakaryawan.getSelectedRow();
String a = tabmode.getValueAt(bar, 0).toString();
String b = tabmode.getValueAt(bar, 1).toString();
String c = tabmode.getValueAt(bar, 2).toString();
String d = tabmode.getValueAt(bar, 3).toString();
String e = tabmode.getValueAt(bar, 4).toString();
String f = tabmode.getValueAt(bar, 5).toString();
tfid.setText(a);
tfnama.setText(b);
taalamat.setText(c);
if ("L".equals(d)) {
            rblaki.setSelected(true);
            rbperempuan.setSelected(false);
            } else if ("P".equals(d)){
            rblaki.setSelected(false);
            rbperempuan.setSelected(true);
 }
cbjabatan.setSelectedItem(e);
tfhp.setText(f);

    }//GEN-LAST:event_datakaryawanMouseClicked

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        utama a = new utama();
            this.dispose();
            a.setVisible(true);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void rblakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rblakiActionPerformed

    private void rbperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbperempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbperempuanActionPerformed

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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbjabatan;
    private javax.swing.JTable datakaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rblaki;
    private javax.swing.JRadioButton rbperempuan;
    private javax.swing.JTextArea taalamat;
    private javax.swing.JTextField tfhp;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfnama;
    // End of variables declaration//GEN-END:variables
}
