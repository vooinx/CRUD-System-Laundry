package Laundry;

import Laundry.ConnectDb;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;





/**
 *
 * @author Fancysx
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Statement st;
    public ResultSet rs;
    public int selectedId;
    public Connection conn;
    
    public Dashboard() {
        initComponents();
        conn = ConnectDb.getConnection();
        setTitle("Laundry VoinxFCY");
        Border currentBorder = Total.getBorder();
        Border paddingBorder = new EmptyBorder(0, 9, 0, 9);
        Total.setBorder(new CompoundBorder(currentBorder, paddingBorder));
        tampilkandata();
        Erase();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JPanel();
        jLabel_Nama = new javax.swing.JLabel();
        jLabel_Alamat = new javax.swing.JLabel();
        jLabel_Telp = new javax.swing.JLabel();
        jLabel_Paket = new javax.swing.JLabel();
        jLabel_Berat = new javax.swing.JLabel();
        jLabel_totharga = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Contact = new javax.swing.JTextField();
        Berat = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        jButton_Simpan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        initabeldata = new javax.swing.JTable();
        Paket = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Banner.setBackground(new java.awt.Color(0, 128, 132));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 239, 128));
        jLabel1.setText("Secepat kilat basmi semua noda");

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 239, 128));
        jLabel2.setText("LAUNDRY  VOINX");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jl. Menteng Jaya No. 6, Telp. 202333500711, Website: www.laundry/isfahankaefal.com");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/home-button.png"))); // NOI18N
        jLabel4.setText(" Keluar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/InitiatorClassSymbol (1).png"))); // NOI18N

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 220));

        Dashboard.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_Nama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_Nama.setText("Nama");

        jLabel_Alamat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_Alamat.setText("Alamat");

        jLabel_Telp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_Telp.setText("No. Telp");

        jLabel_Paket.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_Paket.setText("Pilihan Paket");

        jLabel_Berat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_Berat.setText("Berat");

        jLabel_totharga.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_totharga.setText("Total");

        Nama.setMargin(new java.awt.Insets(2, 9, 2, 6));
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        Alamat.setMargin(new java.awt.Insets(2, 9, 2, 6));

        Contact.setMargin(new java.awt.Insets(2, 9, 2, 6));

        Berat.setMargin(new java.awt.Insets(2, 9, 2, 6));

        Total.setBackground(new java.awt.Color(181, 181, 181));
        Total.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Total.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        Total.setMargin(new java.awt.Insets(2, 15, 2, 15));
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        jButton_Simpan.setBackground(new java.awt.Color(249, 244, 244));
        jButton_Simpan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton_Simpan.setText("SIMPAN");
        jButton_Simpan.setFocusPainted(false);
        jButton_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SimpanActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(249, 244, 244));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton4.setText("HITUNG");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Hapus.setBackground(new java.awt.Color(249, 244, 244));
        Hapus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Hapus.setText("HAPUS");
        Hapus.setFocusPainted(false);
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        UPDATE.setBackground(new java.awt.Color(249, 244, 244));
        UPDATE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setFocusPainted(false);
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        printbtn.setBackground(new java.awt.Color(249, 244, 244));
        printbtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        printbtn.setText("PRINT");
        printbtn.setFocusPainted(false);
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(249, 244, 244));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton6.setText("RESET");
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        initabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nama", "Alamat", "No. Telp", "Pilihan Paket", "Berat", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        initabeldata.setFocusable(false);
        initabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                initabeldataMouseClicked(evt);
            }
        });
        initabeldata.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                initabeldataComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(initabeldata);

        Paket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Paket Layanan", "Cuci-Sertrika", "Cuci", "Sertrika" }));

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Alamat)
                            .addComponent(jLabel_Telp)
                            .addComponent(jLabel_Berat)
                            .addComponent(jLabel_totharga)
                            .addComponent(jLabel_Nama)
                            .addComponent(jLabel_Paket))
                        .addGap(18, 18, 18)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nama)
                            .addComponent(Alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(Contact)
                            .addComponent(Berat)
                            .addComponent(Total)
                            .addComponent(Paket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(DashboardLayout.createSequentialGroup()
                            .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(DashboardLayout.createSequentialGroup()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_Simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(DashboardLayout.createSequentialGroup()
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Nama))
                        .addGap(23, 23, 23)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alamat)
                            .addComponent(jLabel_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Contact)
                            .addComponent(jLabel_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Paket)
                            .addComponent(Paket, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Berat)
                            .addComponent(jLabel_Berat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_totharga))
                        .addGap(43, 43, 43)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton_Simpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPDATE)
                            .addComponent(Hapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(printbtn)))
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1540, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 public void tampilkandata(){
        String query;
        
        try {
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery("SELECT * FROM customer");


          DefaultTableModel model = new DefaultTableModel();
          model.addColumn("id");
          model.addColumn("Nama");
          model.addColumn("Alamat");
          model.addColumn("No. Telp");
          model.addColumn("Pilihan Paket");
          model.addColumn("Berat/Kg");
          model.addColumn("Total Harga");
          
          
          model.getDataVector().removeAllElements();
          model.fireTableDataChanged();
          model.setRowCount(0);
          
       
          while (rs.next()){
            Object[] data = {
                rs.getString("id"),
                rs.getString("Nama"),
                rs.getString("Alamat"),
                rs.getString("Contact"),
                rs.getString("Pilihan_Paket"),
                rs.getString("Berat"),
                rs.getString("Total_Harga")
            };
            model.addRow(data);
            initabeldata.setModel(model);
          }
          
        }catch(Exception e){
        }
    }
    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void Erase(){
        Nama.setText("");
        Alamat.setText("");
        Contact.setText("");
        Paket.setSelectedItem("Pilih Paket Layanan");
        Berat.setText("");
        Total.setText("");
    }
    private void jButton_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SimpanActionPerformed
        String nama, alamat, contact, paket, query;
        int berat, total;
        

        try {
            st = conn.createStatement();
            if ("".equals(Nama.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum memasukan nama customer, Isi Nama Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if ("".equals(Alamat.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum memasukan Alamat customer, Isi Alamat Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if ("".equals(Contact.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum Memasukkan Nomor Telepon customer, Isi Nomor Telepon Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if ("".equals(Berat.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum memasukan total berat, Isi total berat Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if ("".equals(Total.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum menghitung total pesanan, Hitung total Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if ("Pilih Paket Layanan".equals(Paket.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Anda belum memilih pilihan paket, pilih paket terlebih dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                nama = Nama.getText();
                alamat = Alamat.getText();
                contact = Contact.getText();
                paket = Paket.getSelectedItem().toString();
                berat = Integer.parseInt(Berat.getText());
                total = Integer.parseInt(Total.getText());
                System.out.println("Berhasil");

                query = "INSERT INTO customer(Nama, Alamat, Contact, Pilihan_Paket, Berat, Total_Harga)" +
                    " VALUES ('" + nama + "', '" + alamat + "', '" + contact + "', '" + paket + "', " + berat + ", " + total + ")";

                st.executeUpdate(query);
                tampilkandata();

                Nama.setText("");
                Alamat.setText("");
                Contact.setText("");
                Paket.setSelectedItem("Pilih Paket Layanan");
                Berat.setText("");
                Total.setText("");
                JOptionPane.showMessageDialog(new JFrame(), "Pesanan Berhasil Dibuat!!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            System.out.println("ERROR!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton_SimpanActionPerformed

    private void initabeldataComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_initabeldataComponentShown
        
    }//GEN-LAST:event_initabeldataComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

            if("".equals(Nama.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum memasukan nama customer, Isi Nama Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if("".equals(Alamat.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum memasukan Alamat customer, Isi Alamat Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if("".equals(Contact.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum Memasukkan Nomor Telepon customer, Isi Nomor Telepon Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if ("".equals(Berat.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Anda belum memasukan total berat, Isi total berat Terlebih Dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
            }else {
                if ("Pilih Paket Layanan".equals(Paket.getSelectedItem().toString())) {
                   JOptionPane.showMessageDialog(this, "Anda belum memilih pilihan paket, pilih paket terlebih dahulu", "Warning", JOptionPane.WARNING_MESSAGE);
                   return;
                }
            }
                
                
            String pilihanPaket = (String) Paket.getSelectedItem();
            int berat = Integer.parseInt(Berat.getText());
            int harga = 0;

            switch (pilihanPaket) {
                case "Cuci-Sertrika":
                    harga = 8000;
                    break;
                case "Cuci":
                    harga = 6000;
                    break;
                case "Sertrika":
                    harga = 2000;
                    break;
                default:
                    break;
            }
            double total = berat * harga;

            
            Total.setText(String.format("%.0f", total));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void initabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_initabeldataMouseClicked
        // TODO add your handling code here:
        selectedId = Integer.parseInt(initabeldata.getValueAt(initabeldata.getSelectedRow(), 0).toString());
        Nama.setText(initabeldata.getValueAt(initabeldata.getSelectedRow(), 1).toString());
        Alamat.setText(initabeldata.getValueAt(initabeldata.getSelectedRow(), 2).toString());
        Contact.setText(initabeldata.getValueAt(initabeldata.getSelectedRow(), 3).toString());
        Paket.setSelectedItem(initabeldata.getValueAt(initabeldata.getSelectedRow(), 4).toString());
        Berat.setText(initabeldata.getValueAt(initabeldata.getSelectedRow(), 5).toString());
        Total.setText(initabeldata.getValueAt(initabeldata.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_initabeldataMouseClicked

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        
        if(Nama.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus!");
        }else{
            int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus, lanjutkan ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if(jawab == 0){
                try{
                    st = conn.createStatement();
                    String sql = "DELETE FROM customer WHERE Nama = '" + Nama.getText() + "'"; 
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    Erase();
                    tampilkandata();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed


        if (Nama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan diupdate!");
        } else {
            int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan diupdate, lanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == JOptionPane.YES_OPTION) {
                try {
                    st = conn.createStatement();
                    String sql = "UPDATE customer SET Nama = '" + Nama.getText() + "', Alamat = '" + Alamat.getText() + "', Contact = '" + Contact.getText() + "', Pilihan_Paket = '" + Paket.getSelectedItem().toString() + "', Berat = " + Integer.parseInt(Berat.getText()) + ", Total_Harga = " + Integer.parseInt(Total.getText()) + " WHERE id = " + selectedId;
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Pesanan berhasil diupdate");
                    tampilkandata();
                    Erase();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Erase();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        String path = "D:\\Coolyeah'\\Sem2\\UAS\\Pemrograman\\Invoice pelanggan\\";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String Date = dateFormat.format(new Date());
        String Time = timeFormat.format(new Date());
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            String nama = Nama.getText();
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + "Data Customer Voinx Laundry" + " " +Date+  ".pdf"));
            
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                                      VoinxLaundry (Data Customer)\n                                                   Contact Number: (+62) 81293198764\n\n");
            doc.add(paragraph1);
            
            Paragraph paragraph2 = new Paragraph("Date   :  "+Date+"\nTime   : "+Time+"\n\n\n");
            doc.add(paragraph2);

            PdfPTable tbl = new PdfPTable(7);
            tbl.setWidthPercentage(100); 

            PdfPCell header1 = new PdfPCell(new Phrase("Id"));
            header1.setHorizontalAlignment(Element.ALIGN_CENTER);
            header1.setPadding(10f); 
            tbl.addCell(header1);

            PdfPCell header2 = new PdfPCell(new Phrase("Nama"));
            header2.setHorizontalAlignment(Element.ALIGN_CENTER);
            header2.setPadding(10f);
            tbl.addCell(header2);

            PdfPCell header3 = new PdfPCell(new Phrase("Alamat"));
            header3.setHorizontalAlignment(Element.ALIGN_CENTER);
            header3.setPadding(10f);
            tbl.addCell(header3);

            PdfPCell header4 = new PdfPCell(new Phrase("No. Telp"));
            header4.setHorizontalAlignment(Element.ALIGN_CENTER);
            header4.setPadding(10f);
            tbl.addCell(header4);

            PdfPCell header5 = new PdfPCell(new Phrase("Pilihan Paket"));
            header5.setHorizontalAlignment(Element.ALIGN_CENTER);
            header5.setPadding(10f);
            tbl.addCell(header5);

            PdfPCell header6 = new PdfPCell(new Phrase("Berat"));
            header6.setHorizontalAlignment(Element.ALIGN_CENTER);
            header6.setPadding(10f);
            tbl.addCell(header6);

            PdfPCell header7 = new PdfPCell(new Phrase("Total"));
            header7.setHorizontalAlignment(Element.ALIGN_CENTER);
            header7.setPadding(10f);
            tbl.addCell(header7);

            for (int i = 0; i < initabeldata.getRowCount(); i++) {
                String id = initabeldata.getValueAt(i, 0).toString();
                String n = initabeldata.getValueAt(i, 1).toString();
                String s = initabeldata.getValueAt(i, 2).toString();
                String no = initabeldata.getValueAt(i, 3).toString();
                String p = initabeldata.getValueAt(i, 4).toString();
                String b = initabeldata.getValueAt(i, 5).toString();
                String t = initabeldata.getValueAt(i, 6).toString();


                PdfPCell cell1 = new PdfPCell(new Phrase(id));
                cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1.setPadding(10f);
                tbl.addCell(cell1);

                PdfPCell cell2 = new PdfPCell(new Phrase(n));
                cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2.setPadding(10f);
                tbl.addCell(cell2);

                PdfPCell cell3 = new PdfPCell(new Phrase(s));
                cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell3.setPadding(10f);
                tbl.addCell(cell3);

                PdfPCell cell4 = new PdfPCell(new Phrase(no));
                cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell4.setPadding(10f);
                tbl.addCell(cell4);

                PdfPCell cell5 = new PdfPCell(new Phrase(p));
                cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell5.setPadding(10f);
                tbl.addCell(cell5);

                PdfPCell cell6 = new PdfPCell(new Phrase(b));
                cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell6.setPadding(10f);
                tbl.addCell(cell6);

                PdfPCell cell7 = new PdfPCell(new Phrase(t));
                cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell7.setPadding(10f);
                tbl.addCell(cell7);
            }
                doc.add(tbl);
                System.out.print("Bill generated");

        } catch (Exception e) {
            System.out.println("Print error: " + e.getMessage());
        } finally {
            doc.close();
        }
            JOptionPane.showMessageDialog(new JFrame(), "Data Berhasil di cetak", "Success", JOptionPane.INFORMATION_MESSAGE);         
    }//GEN-LAST:event_printbtnActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

   
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JPanel Banner;
    private javax.swing.JTextField Berat;
    private javax.swing.JTextField Contact;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Nama;
    private javax.swing.JComboBox<String> Paket;
    private javax.swing.JTextField Total;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTable initabeldata;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Alamat;
    private javax.swing.JLabel jLabel_Berat;
    private javax.swing.JLabel jLabel_Nama;
    private javax.swing.JLabel jLabel_Paket;
    private javax.swing.JLabel jLabel_Telp;
    private javax.swing.JLabel jLabel_totharga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printbtn;
    // End of variables declaration//GEN-END:variables
}
