/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.plaf.synth.Region;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author brenno.lima
 */
public class Relatorio extends javax.swing.JInternalFrame {

    ConectaBanco conect = new ConectaBanco();//realiza a conexão com o banco de dados, variavel global 
    
    public Relatorio() {
        initComponents();
        conect.conexao();
        jLabel_data.setText(getDateTime());
    }
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox_status = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel_data = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane5.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane5.setToolTipText("Folha Ponto");
        jTabbedPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel15.setBackground(new java.awt.Color(254, 254, 254));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(null);
        jPanel8.add(jDateChooser1);
        jDateChooser1.setBounds(40, 10, 130, 25);
        jPanel8.add(jDateChooser2);
        jDateChooser2.setBounds(200, 10, 130, 25);

        jLabel1.setText("De:");
        jPanel8.add(jLabel1);
        jLabel1.setBounds(20, 15, 20, 14);

        jLabel2.setText("até:");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(180, 15, 20, 14);

        jButton1.setText("Imprimir Forlha Ponto");
        jPanel8.add(jButton1);
        jButton1.setBounds(80, 103, 170, 30);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Folha Ponto", jPanel15);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);
        jPanel6.add(jDateChooser3);
        jDateChooser3.setBounds(40, 10, 130, 25);
        jPanel6.add(jDateChooser4);
        jDateChooser4.setBounds(200, 10, 130, 25);

        jLabel3.setText("De:");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(20, 15, 20, 14);

        jLabel4.setText("até:");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(180, 15, 20, 14);

        jButton2.setText("Imprimir Banco de Horas");
        jPanel6.add(jButton2);
        jButton2.setBounds(80, 103, 170, 30);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Banco de Horas", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(null);

        jComboBox_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ATIVO", "DESATIVADO" }));
        jPanel7.add(jComboBox_status);
        jComboBox_status.setBounds(100, 30, 130, 25);

        jButton3.setText("Imprimir Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3);
        jButton3.setBounds(80, 103, 170, 30);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Status do Estagiário", jPanel4);

        jLabel_data.setForeground(new java.awt.Color(255, 51, 102));
        jLabel_data.setText("data");

        jLabel5.setText("Data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_data)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_data)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jComboBox_status.getSelectedItem().equals("TODOS")) {
            conect.executaSQL("select matricula, nome, status from pessoa order by nome");
            try {
                JRResultSetDataSource relatResult = new JRResultSetDataSource(conect.rs);//passa um resiltSet para o relatorio!
                JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Relato_status_todos.jasper", new HashMap(), relatResult);
                JasperViewer jv = new JasperViewer(jpPrint);//cria instancia para impre
                jv.setVisible(true);//chama relatorio para visualização
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio Verifique as Informações!!!\nErro:" + ex);
            }
        } else {
            if (jComboBox_status.getSelectedItem().equals("ATIVO")) {
                conect.executaSQL("select matricula, nome, status from pessoa where status = 'ATIVO' order by nome");
                try {
                    JRResultSetDataSource relatResult = new JRResultSetDataSource(conect.rs);//passa um resiltSet para o relatorio!
                    JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Relato_status_ativo.jasper", new HashMap(), relatResult);
                    JasperViewer jv = new JasperViewer(jpPrint);//cria instancia para impre
                    jv.setVisible(true);//chama relatorio para visualização
                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio Verifique as Informações!!!\nErro:" + ex);
                }
            } else {
                if (jComboBox_status.getSelectedItem().equals("DESATIVADO")) {
                    conect.executaSQL("select matricula, nome, status from pessoa where status = 'DESATIVADO' order by nome");
                    try {
                        JRResultSetDataSource relatResult = new JRResultSetDataSource(conect.rs);//passa um resiltSet para o relatorio!
                        JasperPrint jpPrint = JasperFillManager.fillReport("iReport/Relato_status_desativado.jasper", new HashMap(), relatResult);
                        JasperViewer jv = new JasperViewer(jpPrint);//cria instancia para impre
                        jv.setVisible(true);//chama relatorio para visualização
                    } catch (JRException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio Verifique as Informações!!!\nErro:" + ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao Gerar Relatorio!!! ");
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_status;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables
}