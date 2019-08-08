/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author brenno.lima
 */
public class Bate_Ponto extends javax.swing.JInternalFrame {

    ConectaBanco conect = new ConectaBanco();//realiza a conexão com o banco de dados, variavel global   
    ResultSet rs;

    public Bate_Ponto() {
        initComponents();
        conect.conexao();//Conexão com o banco de dados
        jRadionome.setSelected(true);
        preencherTabela("SELECT PESSOA.MATRICULA, PESSOA.NOME, PONTOS.DATADIA\n"
                + "FROM PESSOA\n"
                + "INNER JOIN PONTOS\n"
                + "ON PESSOA.MATRICULA = PONTOS.MATRICULA \n"
                + "WHERE CAST(datadia AS Date) = current_date order by pessoa.nome");
    }
     public String FormataDataTime(String dado) {
        String da = dado;
        //data
        String ano = da.substring(0, 4);
        String mes = da.substring(5, 7);
        String dia = da.substring(8, 10);
        //horas 
        String hora = da.substring(11, 13);
        String minutos = da.substring(14, 16);
        String segundos = da.substring(17, 19);
        String datap = dia + "/" + mes + "/" + ano + " " + hora + ":" + minutos + ":" + segundos;
        return datap;
    }
    public void preencherTabela(String SQL) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Matricula", "Nome", "Batida"};
        conect.executaSQL(SQL);
        String d;
        try {
            conect.rs.first();
            do {
                String dt = conect.rs.getString("datadia");
                d = FormataDataTime(dt);
                dados.add(new Object[]{conect.rs.getInt("Matricula"), conect.rs.getString("Nome"), d});
            } while (conect.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Lista na Tabela!\n Erro: " + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableponto.setModel(modelo);

        jTableponto.getColumnModel().getColumn(0).setPreferredWidth(83);
        jTableponto.getColumnModel().getColumn(0).setResizable(false);

        jTableponto.getColumnModel().getColumn(1).setPreferredWidth(215);
        jTableponto.getColumnModel().getColumn(1).setResizable(false);

        jTableponto.getColumnModel().getColumn(2).setPreferredWidth(141);
        jTableponto.getColumnModel().getColumn(2).setResizable(false);

        jTableponto.getTableHeader().setReorderingAllowed(false);
        jTableponto.setAutoResizeMode(jTableponto.AUTO_RESIZE_OFF);
        jTableponto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busca = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextmatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordsenha = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableponto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTextpesquisa = new javax.swing.JTextField();
        jRadionome = new javax.swing.JRadioButton();
        jRadiomatricula = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Batida de ponto");
        setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Matricula:");

        jLabel2.setText("Senha:");

        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Registrar_32x32.png"))); // NOI18N
        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("*");

        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("*");

        jPasswordsenha.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextmatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(jPasswordsenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButtonRegistrar)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonRegistrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 480, 110);

        jTableponto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableponto);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextpesquisaKeyReleased(evt);
            }
        });

        busca.add(jRadionome);
        jRadionome.setText("Nome");
        jRadionome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadionomeActionPerformed(evt);
            }
        });

        busca.add(jRadiomatricula);
        jRadiomatricula.setText("Matricula");
        jRadiomatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiomatriculaActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Localizar_16x16.png"))); // NOI18N
        jLabel5.setText("Buscar por nome:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Ordenar Por:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jRadionome)
                        .addGap(63, 63, 63)
                        .addComponent(jRadiomatricula))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadionome)
                    .addComponent(jRadiomatricula)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 130, 480, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        setBounds(0, 0, 516, 458);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextpesquisaKeyReleased
        String temp = jTextpesquisa.getText();
        jTextpesquisa.setText(temp.toUpperCase());
        preencherTabela("SELECT PESSOA.MATRICULA, PESSOA.NOME, PONTOS.DATADIA\n"
                + "FROM PESSOA\n"
                + "INNER JOIN PONTOS\n"
                + "ON PESSOA.MATRICULA = PONTOS.MATRICULA \n"
                + "WHERE CAST(datadia AS Date) = current_date AND pessoa.nome like '%" + jTextpesquisa.getText() + "%' order by PESSOA.NOME");
    }//GEN-LAST:event_jTextpesquisaKeyReleased

    private void jRadionomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadionomeActionPerformed
        preencherTabela("SELECT PESSOA.MATRICULA, PESSOA.NOME, PONTOS.DATADIA\n"
                + "FROM PESSOA\n"
                + "INNER JOIN PONTOS\n"
                + "ON PESSOA.MATRICULA = PONTOS.MATRICULA \n"
                + "WHERE CAST(datadia AS Date) = current_date order by pessoa.nome");
    }//GEN-LAST:event_jRadionomeActionPerformed

    private void jRadiomatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiomatriculaActionPerformed
        preencherTabela("SELECT PESSOA.MATRICULA, PESSOA.NOME, PONTOS.DATADIA\n"
                + "FROM PESSOA\n"
                + "INNER JOIN PONTOS\n"
                + "ON PESSOA.MATRICULA = PONTOS.MATRICULA \n"
                + "WHERE CAST(datadia AS Date) = current_date order by pontos.matricula");
    }//GEN-LAST:event_jRadiomatriculaActionPerformed
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        java.sql.Timestamp sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());//PEGA O FORMATO TIMESTAMP E GRAVA NO BANCO
        try {
            conect.executaSQL("select matricula, nome, status, senha from pessoa where matricula = '" + jTextmatricula.getText().trim() + "'");
            conect.rs.first();
            if (!conect.rs.getString("status").equals("DESATIVADO")) {
                if (conect.rs.getString("senha").equals(jPasswordsenha.getText().trim())) {
                    PreparedStatement pst = conect.conn.prepareStatement("insert into pontos(matricula,datadia) values(?,?)");
                    int mt = Integer.parseInt(jTextmatricula.getText().trim());//converter numero em String para inteiro.
                    pst.setInt(1, mt);
                    pst.setTimestamp(2, sqlDate);//manda somente tipo data para o Tabela 
                    pst.execute();
                    preencherTabela("SELECT PESSOA.MATRICULA, PESSOA.NOME, PONTOS.DATADIA\n"
                            + "FROM PESSOA\n"
                            + "INNER JOIN PONTOS\n"
                            + "ON PESSOA.MATRICULA = PONTOS.MATRICULA \n"
                            + "WHERE CAST(datadia AS Date) = current_date order by pessoa.nome");
                    jTextmatricula.setText("");
                    jPasswordsenha.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ponto Registrado! ");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Matricula ou Senha Invalido!!! ");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario não autorizado, Consulte seu Gestor!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Matricula ou Senha Invalido!!! \n" + ex);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup busca;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordsenha;
    private javax.swing.JRadioButton jRadiomatricula;
    private javax.swing.JRadioButton jRadionome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableponto;
    private javax.swing.JTextField jTextmatricula;
    private javax.swing.JTextField jTextpesquisa;
    // End of variables declaration//GEN-END:variables
}
