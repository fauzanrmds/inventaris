/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Barang;

/**
 *
 * @author PRAKTIKUM
 */
public class MenuMutasi extends javax.swing.JFrame implements View{

    /**
     * Creates new form MenuMutasi
     */
    public MenuMutasi() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablelMutasi = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKondisi = new javax.swing.JButton();
        btnPindah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablelMutasi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablelMutasi);

        btnKembali.setText("Kembali");

        jLabel1.setText("Mutasi Barang");

        btnKondisi.setText("Ubah Kondisi");

        btnPindah.setText("Pindah Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKondisi)
                        .addGap(18, 18, 18)
                        .addComponent(btnPindah))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKembali)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKondisi)
                    .addComponent(btnPindah))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKondisi;
    private javax.swing.JButton btnPindah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablelMutasi;
    // End of variables declaration//GEN-END:variables
    
    @Override
    
    public void AddListener(ActionListener l) {
        btnKondisi.addActionListener(l);
        btnPindah.addActionListener(l);
        btnKembali.addActionListener(l);
    }

    public JButton getBtnKembali() {
        return btnKembali;
    }

    public void setBtnKembali(JButton btnKembali) {
        this.btnKembali = btnKembali;
    }

    public JButton getBtnKondisi() {
        return btnKondisi;
    }

    public void setBtnKondisi(JButton btnKondisi) {
        this.btnKondisi = btnKondisi;
    }

    public JButton getBtnPindah() {
        return btnPindah;
    }

    public void setBtnPindah(JButton btnPindah) {
        this.btnPindah = btnPindah;
    }

    public JTable getTabelMutasi() {
        return tablelMutasi;
    }

    public void setTabelMutasi(JTable tabelMutasi) {
        this.tablelMutasi = tabelMutasi;
    }
    
    public void fillData(ArrayList<Barang> listBarang){
        
        String columnNames[] = {"ID BARANG", "NAMA BARANG", "HARGA BARANG" , "LOKASI" ,"STATUS"};
        if(!listBarang.isEmpty()){
        
            String data[][] = new String[listBarang.size()][columnNames.length];
            int i = 0;
            for(Barang b: listBarang){
                data[i][0] = String.valueOf(b.getIdBarang());
                data[i][1] = b.getNama();
                data[i][2] = String.valueOf(b.getHarga());
                data[i][3] = b.getLokasi().getNama();
                data[i][4] = b.getStatus().getJenis();
            }

            tablelMutasi.setModel(new DefaultTableModel(data, columnNames));
        }
        else{
            tablelMutasi.setModel(new DefaultTableModel(columnNames, 1));
            tablelMutasi.setEnabled(false);
        }
    }

    @Override
    public void showMessage(String m) {
        JOptionPane.showMessageDialog(this, m);
    }
}
