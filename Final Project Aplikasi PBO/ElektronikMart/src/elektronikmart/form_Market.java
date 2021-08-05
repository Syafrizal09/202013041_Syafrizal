
package elektronikmart;

import javax.swing.JFrame;

/**
 *
 * @author Syafrizal
 */
public class form_Market extends javax.swing.JFrame {

    public int jumlahbayar;
    int kembalian;
    int total = 0;

    /**
     * Creates new form Market
     */
    public form_Market() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtReset = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbHarddisk = new javax.swing.JCheckBox();
        cbRAM = new javax.swing.JCheckBox();
        cbMonitor = new javax.swing.JCheckBox();
        cbKeyboard = new javax.swing.JCheckBox();
        cbSSD = new javax.swing.JCheckBox();
        txtHarddisk = new javax.swing.JTextField();
        txtRAM = new javax.swing.JTextField();
        txtMonitor = new javax.swing.JTextField();
        txtSSD = new javax.swing.JTextField();
        txtMouse = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        cbHDMI = new javax.swing.JCheckBox();
        cbPowerSup = new javax.swing.JCheckBox();
        cbKipas = new javax.swing.JCheckBox();
        cbMouse = new javax.swing.JCheckBox();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        txtHDMI = new javax.swing.JTextField();
        txtKeyboard = new javax.swing.JTextField();
        txtPowerSup = new javax.swing.JTextField();
        txtKipas = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        cbInstal = new javax.swing.JCheckBox();
        cbJasa = new javax.swing.JCheckBox();
        cbServis = new javax.swing.JCheckBox();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        txtServis = new javax.swing.JTextField();
        txtInstal = new javax.swing.JTextField();
        txtJasa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahBayar1 = new javax.swing.JTextField();
        Btnsimpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHasil = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtReset.setText("Reset");
        txtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetActionPerformed(evt);
            }
        });

        jButton3.setText("Hitung");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbHarddisk.setText("Harddisk");
        cbHarddisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHarddiskActionPerformed(evt);
            }
        });

        cbRAM.setText("RAM");
        cbRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRAMActionPerformed(evt);
            }
        });

        cbMonitor.setText("Monitor");
        cbMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonitorActionPerformed(evt);
            }
        });

        cbKeyboard.setText("Keyboard");
        cbKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKeyboardActionPerformed(evt);
            }
        });

        cbSSD.setText("SSD");
        cbSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSSDActionPerformed(evt);
            }
        });

        txtRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRAMActionPerformed(evt);
            }
        });

        txtMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonitorActionPerformed(evt);
            }
        });

        txtSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSDActionPerformed(evt);
            }
        });

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel1.setText("Total");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField3.setText("Harga Barang");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField4.setText("Jumlah Barang Dipesan");

        jTextField5.setEditable(false);
        jTextField5.setText("Rp. 300000");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField6.setText("Nama Barang");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setText("Rp. 500000");

        jTextField8.setEditable(false);
        jTextField8.setText("Rp. 450000");

        jTextField9.setEditable(false);
        jTextField9.setText("Rp. 80000");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setText("Rp. 250000");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        cbHDMI.setText("HDMI Cable");
        cbHDMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHDMIActionPerformed(evt);
            }
        });

        cbPowerSup.setText("Power Supply");
        cbPowerSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPowerSupActionPerformed(evt);
            }
        });

        cbKipas.setText("Kipas Van");
        cbKipas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKipasActionPerformed(evt);
            }
        });

        cbMouse.setText("Mouse");
        cbMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMouseActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setText("Rp. 50000");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setText("Rp. 100000");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setText("Rp. 250000");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setText("Rp. 100000");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField15.setText("Total Keseluruhan Barang Yang Dipesan");

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField17.setText("Biaya Reparasi");

        cbInstal.setText("Instal Ulang OS");
        cbInstal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInstalActionPerformed(evt);
            }
        });

        cbJasa.setText("Jasa Pasang Sparepart");
        cbJasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJasaActionPerformed(evt);
            }
        });

        cbServis.setText("Servis All Item");
        cbServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServisActionPerformed(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField18.setText("Jumlah Barang Yang Di Repair");

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField19.setText("Melayani Reparasi Laptop / PC");
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextField20.setEditable(false);
        jTextField20.setText("Rp. 500000");

        jTextField21.setEditable(false);
        jTextField21.setText("Rp. 50000");

        jTextField22.setEditable(false);
        jTextField22.setText("Rp. 50000");

        jLabel3.setText("Jumlah Bayar");

        txtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembalianActionPerformed(evt);
            }
        });

        jLabel4.setText("Kembalian");

        txtJumlahBayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahBayar1ActionPerformed(evt);
            }
        });
        txtJumlahBayar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahBayar1KeyReleased(evt);
            }
        });

        Btnsimpan.setText("simpan");
        Btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsimpanActionPerformed(evt);
            }
        });

        txtHasil.setColumns(20);
        txtHasil.setRows(5);
        jScrollPane2.setViewportView(txtHasil);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbRAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbHarddisk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbSSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbHDMI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbPowerSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbKipas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jTextField20)
                    .addComponent(jTextField5)
                    .addComponent(jTextField10)
                    .addComponent(jTextField8)
                    .addComponent(jTextField12)
                    .addComponent(jTextField9)
                    .addComponent(jTextField11)
                    .addComponent(jTextField13)
                    .addComponent(jTextField14))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHDMI)
                    .addComponent(txtMouse)
                    .addComponent(txtSSD)
                    .addComponent(txtHarddisk)
                    .addComponent(txtRAM)
                    .addComponent(txtMonitor)
                    .addComponent(jTextField4)
                    .addComponent(txtKeyboard)
                    .addComponent(txtPowerSup)
                    .addComponent(txtKipas))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbInstal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbServis, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbJasa, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField22)
                                    .addComponent(jTextField21)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField17)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtServis)
                    .addComponent(txtInstal)
                    .addComponent(txtJasa)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKembalian)
                    .addComponent(txtJumlahBayar1))
                .addGap(199, 199, 199)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jButton3)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJumlahBayar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHarddisk)
                            .addComponent(txtHarddisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbServis)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbInstal)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInstal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbRAM))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbJasa)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbMonitor)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSSD)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKeyboard)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMouse)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHDMI)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHDMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPowerSup)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPowerSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKipas)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKipas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(txtReset)
                            .addComponent(Btnsimpan))))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 153, 255));
        jTextField1.setText("                                                 ~Selamat Berbelanja Di Toko Kami, Smart Buyyer and Happy Shooping~");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        jTextField2.setText("                                                           \"Elektronik Market\"");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elektronikmart/kosong.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(645, 645, 645)
                .addComponent(jLabel2)
                .addContainerGap(743, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetActionPerformed
        txtHarddisk.setText("");
        txtRAM.setText("");
        txtMonitor.setText("");
        txtSSD.setText("");
        txtKeyboard.setText("");
        txtMouse.setText("");
        txtHDMI.setText("");
        txtPowerSup.setText("");
        txtKipas.setText("");
        txtServis.setText("");
        txtInstal.setText("");
        txtJasa.setText("");
        txtKembalian.setText("");
        txtJumlahBayar1.setText("");
        txtHasil.setText("");
        txtTotal.setText("");
        total=0;
    }//GEN-LAST:event_txtResetActionPerformed

    private void cbHarddiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHarddiskActionPerformed
        if (cbHarddisk.isSelected() == true) {
            txtHarddisk.setText("");
        } else {
            txtHarddisk.setEditable(false);
        }
    }//GEN-LAST:event_cbHarddiskActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (cbHarddisk.isSelected() == true) {
            int jumlahHarddisk = Integer.parseInt(txtHarddisk.getText());
            int hargaHarddisk = jumlahHarddisk * 500000;
            total = total + hargaHarddisk;
        }
        if (cbRAM.isSelected() == true) {
            int jumlahRAM = Integer.parseInt(txtRAM.getText());
            int hargaRAM = jumlahRAM * 300000;
            total = total + hargaRAM;
        }
        if (cbMonitor.isSelected() == true) {
            int jumlahMonitor = Integer.parseInt(txtMonitor.getText());
            int hargaMonitor = jumlahMonitor * 250000;
            total = total + hargaMonitor;
        }
        if (cbSSD.isSelected() == true) {
            int jumlahSSD = Integer.parseInt(txtSSD.getText());
            int hargaSSD = jumlahSSD * 450000;
            total = total + hargaSSD;
        }
        if (cbKeyboard.isSelected() == true) {
            int jumlahKeyboard = Integer.parseInt(txtMouse.getText());
            int hargaKeyboard = jumlahKeyboard * 100000;
            total = total + hargaKeyboard;
        }
        if (cbMouse.isSelected() == true) {
            int jumlahMouse = Integer.parseInt(txtMouse.getText());
            int hargaMouse = jumlahMouse * 80000;
            total = total + hargaMouse;
        }
        if (cbHDMI.isSelected() == true) {
            int jumlahHDMI = Integer.parseInt(txtHDMI.getText());
            int hargaHDMI = jumlahHDMI * 50000;
            total = total + hargaHDMI;
        }
        if (cbPowerSup.isSelected() == true) {
            int jumlahPowerSup = Integer.parseInt(txtPowerSup.getText());
            int hargaPowerSup = jumlahPowerSup * 250000;
            total = total + hargaPowerSup;
        }
        if (cbKipas.isSelected() == true) {
            int jumlahKipas = Integer.parseInt(txtKipas.getText());
            int hargaKipas = jumlahKipas * 100000;
            total = total + hargaKipas;
        }
        if (cbServis.isSelected() == true) {
            int jumlahServis = Integer.parseInt(txtServis.getText());
            int hargaServis = jumlahServis * 500000;
            total = total + hargaServis;
        }
        if (cbInstal.isSelected() == true) {
            int jumlahInstal = Integer.parseInt(txtInstal.getText());
            int hargaInstal = jumlahInstal * 50000;
            total = total + hargaInstal;
        }
        if (cbJasa.isSelected() == true) {
            int jumlahJasa = Integer.parseInt(txtJasa.getText());
            int hargaJasa = jumlahJasa * 50000;
            total = total + hargaJasa;
        }
        txtTotal.setText(String.valueOf(total));{
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRAMActionPerformed

    private void cbRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRAMActionPerformed
        if (cbRAM.isSelected() == true) {
            txtRAM.setText("");
        } else {
            txtRAM.setEditable(false);
        }
    }//GEN-LAST:event_cbRAMActionPerformed

    private void cbMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonitorActionPerformed
        if (cbMonitor.isSelected() == true) {
            txtMonitor.setText("");
        } else {
            txtMonitor.setEditable(false);
        }
    }//GEN-LAST:event_cbMonitorActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void cbKeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKeyboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKeyboardActionPerformed

    private void cbSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSSDActionPerformed

    private void txtMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonitorActionPerformed

    private void txtSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSDActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void cbHDMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHDMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHDMIActionPerformed

    private void cbPowerSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPowerSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPowerSupActionPerformed

    private void cbKipasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKipasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKipasActionPerformed

    private void cbMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMouseActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void cbInstalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInstalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInstalActionPerformed

    private void cbJasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJasaActionPerformed

    private void cbServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbServisActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void txtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembalianActionPerformed


    }//GEN-LAST:event_txtKembalianActionPerformed

    private void txtJumlahBayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahBayar1ActionPerformed


    }//GEN-LAST:event_txtJumlahBayar1ActionPerformed

    private void BtnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsimpanActionPerformed

        String teks="";
        teks += "\n                 =======****_   BARANG YANG ANDA PESAN   _****=======";
        if (cbHarddisk.isSelected()) {
            teks += "\n||-Harddisk : " + (Integer.parseInt(txtHarddisk.getText())*500000);
        }
        if (cbRAM.isSelected()) {
            teks += "\n||-RAM : "+(Integer.parseInt(txtRAM.getText())*300000);
        }
        if (cbMonitor.isSelected()) {
            teks += "\n||-Monitor : "+(Integer.parseInt(txtMonitor.getText())*250000);
        }
        if (cbSSD.isSelected()) {
            teks += "\n||-SSD : "+(Integer.parseInt(txtSSD.getText())*450000);
        }
        if (cbKeyboard.isSelected()) {
            teks += "\n||-Keyboard : "+(Integer.parseInt(txtKeyboard.getText())*100000);
        }
        if (cbMouse.isSelected()) {
            teks += "\n||-Mouse : "+(Integer.parseInt(txtMouse.getText())*80000);
        }
        if (cbHDMI.isSelected()) {
            teks += "\n||-HDMI Cable : "+(Integer.parseInt(txtHDMI.getText())*50000);
        }
        if (cbPowerSup.isSelected()) {
            teks += "\n||-Power Supply : "+(Integer.parseInt(txtPowerSup.getText())*250000);
        }
        if (cbKipas.isSelected()) {
            teks += "\n||-Kipas Van : "+(Integer.parseInt(txtKipas.getText())*100000);
        }
        if (cbServis.isSelected()) {
            teks += "\n||-Servis All Item : "+(Integer.parseInt(txtServis.getText())*500000);
        }
        if (cbInstal.isSelected()) {
            teks += "\n||-Istall Ulang OS : "+(Integer.parseInt(txtInstal.getText())*50000);
        } 
        if (cbJasa.isSelected()) {
            teks += "\n||-Jasa Pasang Sparepart : "+(Integer.parseInt(txtJasa.getText())*50000);
        } 
        teks += "\n=====****_ Total Barang Belanja Anda : "+txtTotal.getText()+"  _****=====";
        txtHasil.setText(teks);

    }//GEN-LAST:event_BtnsimpanActionPerformed

    private void txtJumlahBayar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahBayar1KeyReleased
        // TODO add your handling code here:
        int bayar = Integer.parseInt(txtJumlahBayar1.getText());
        int total_harga = Integer.parseInt(txtTotal.getText());
        double uang_kmbl = bayar - total_harga;
        String kembalian = Double.toString(uang_kmbl);
        txtKembalian.setText(kembalian);
    }//GEN-LAST:event_txtJumlahBayar1KeyReleased

    public static void main(String args[]) {
        form_Market form = new form_Market();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Market().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnsimpan;
    private javax.swing.JCheckBox cbHDMI;
    private javax.swing.JCheckBox cbHarddisk;
    private javax.swing.JCheckBox cbInstal;
    private javax.swing.JCheckBox cbJasa;
    private javax.swing.JCheckBox cbKeyboard;
    private javax.swing.JCheckBox cbKipas;
    private javax.swing.JCheckBox cbMonitor;
    private javax.swing.JCheckBox cbMouse;
    private javax.swing.JCheckBox cbPowerSup;
    private javax.swing.JCheckBox cbRAM;
    private javax.swing.JCheckBox cbSSD;
    private javax.swing.JCheckBox cbServis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtHDMI;
    private javax.swing.JTextField txtHarddisk;
    private javax.swing.JTextArea txtHasil;
    private javax.swing.JTextField txtInstal;
    private javax.swing.JTextField txtJasa;
    private javax.swing.JTextField txtJumlahBayar1;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtKeyboard;
    private javax.swing.JTextField txtKipas;
    private javax.swing.JTextField txtMonitor;
    private javax.swing.JTextField txtMouse;
    private javax.swing.JTextField txtPowerSup;
    private javax.swing.JTextField txtRAM;
    private javax.swing.JButton txtReset;
    private javax.swing.JTextField txtSSD;
    private javax.swing.JTextField txtServis;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
