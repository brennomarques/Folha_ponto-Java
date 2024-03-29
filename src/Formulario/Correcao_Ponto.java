/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author brenno.lima
 */
public class Correcao_Ponto extends javax.swing.JInternalFrame {

    ConectaBanco conect = new ConectaBanco();//realiza a conexão com o banco de dados, variavel global   
    ResultSet rs;

    public Correcao_Ponto() {
        initComponents();
        conect.conexao();//Conexão com o banco de dados
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonajusta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jFormattedTextData = new javax.swing.JFormattedTextField();
        jFormattedTextHora = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonbusca = new javax.swing.JButton();
        jLabelnome = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Correção de Ponto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 500, 190);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonajusta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Incluir_32x32.png"))); // NOI18N
        jButtonajusta.setText("Ajustar");
        jButtonajusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonajustaActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajuste do Ponto:"));

        try {
            jFormattedTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Matricula:");

        jTextMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextMatriculaKeyPressed(evt);
            }
        });

        jLabel2.setText("Data:");

        jLabel3.setText("Hora:");

        jLabel4.setText("Nome:");

        jButtonbusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Localizar_8x8.png"))); // NOI18N
        jButtonbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscaActionPerformed(evt);
            }
        });

        jLabelnome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelnome.setForeground(new java.awt.Color(0, 0, 204));
        jLabelnome.setText("...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonbusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelnome))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonajusta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButtonajusta)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 500, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 535, 399);
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButtonajustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonajustaActionPerformed
        if (!(jTextMatricula.getText().trim().equals("") || jFormattedTextData.getText().toString().equals("  /  /    ") || jFormattedTextHora.getText().toString().equals("  :  :  "))) {
            conect.executaSQL("select matricula, nome, status, senha from pessoa where matricula = '" + jTextMatricula.getText().trim() + "'");
            try {
                if (conect.rs.first()) {// Se for encotrado a algo exetulta a condição.
                    if (!conect.rs.getString("status").equals("DESATIVADO")) {
                        String data = jFormattedTextData.getText();
                        String hora = jFormattedTextHora.getText();
                        String dh = data +" "+hora;
                        String g = eFormataDataTime(dh);
                        Timestamp ts = Timestamp.valueOf(g);//conversão para timestamp, logo e feito a inserção para o banco
                       
                        
//                        PreparedStatement pst = conect.conn.prepareStatement("insert into pontos(matricula,datadia) values(?,?)");
//                        int mt = Integer.parseInt(jTextMatricula.getText().trim());//converter numero em String para inteiro.
//                        pst.setInt(1, mt);
//                        //pst.setTimestamp(2, ts);//manda somente tipo data para o Tabela 
//                        pst.execute();
////                        preencherTabela("SELECT PESSOA.MATRICULA, PESSOA.NOME, PONTOS.DATADIA\n"
////                                + "FROM PESSOA\n"
////                                + "INNER JOIN PONTOS\n"
////                                + "ON PESSOA.MATRICULA = PONTOS.MATRICULA \n"
////                                + "WHERE CAST(datadia AS Date) = current_date order by pessoa.nome");
//                        jTextMatricula.setText("");
                        jFormattedTextData.setText("");
                        jFormattedTextHora.setText("");
                        JOptionPane.showMessageDialog(rootPane, "Ponto Registrado! ");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Matricula DESATIVADO! ");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Dados Invalido!!! ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Correcao_Ponto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "INFORMA OS DADOS!");
        }

        //2019-03-21 15:11:34.309, jFormattedTextData.getText().toString().equals("  /  /    "), jTextMatricula.getText().trim().equals(""), 
    }//GEN-LAST:event_jButtonajustaActionPerformed

    private void jTextMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatriculaKeyPressed
        jLabelnome.setText("...");
    }//GEN-LAST:event_jTextMatriculaKeyPressed
    private String[] eBucaNome(String x) {//FUNÇÃO PARA BUSCA NOME.
        conect.executaSQL("select matricula, nome, status, turno from pessoa where matricula = '" + x + "'");
        String v[] = new String[2]; // declaração do vetor "v"
        v[0] = v[1] = "0";
        try {
            if (conect.rs.first()) {// Se for encotrado a matricula exetulta a condição.
                if (!conect.rs.getString("status").equals("DESATIVADO")) {
                    v[0] = conect.rs.getString("nome");
                    v[1] = conect.rs.getString("turno");
                    return v;
                } else {
                    v[0] = "DESATIVADO";
                    return v;
                }
            } else {
                v[1] = "Matricula não encontrada!";
                return v;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Correcao_Ponto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    public String eFormataDataTime(String dado) {
        String da = dado;
        //data
        String dia = da.substring(0, 2);
        System.out.println("dia: "+dia);
        String mes = da.substring(3, 5);
        System.out.println("dia: "+mes);
        String ano = da.substring(6, 10);
        System.out.println("dia: "+ano);
        //horas 
        String hora = da.substring(11, 13);
        String minutos = da.substring(14, 16);
        String segundos = da.substring(17, 19);
        String datap = ano + "-" + mes + "-" + dia + " " + hora + ":" + minutos + ":" + segundos;
        return datap;//2019-03-21 15:11:34.309
    }
    private void jButtonbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscaActionPerformed
        String n[] = eBucaNome(jTextMatricula.getText().trim());
        if (n[0] == "DESATIVADO") {
            JOptionPane.showMessageDialog(null, "Usuario DESATIVADO!");
        } else {
            if (n[1] == "Matricula não encontrada!") {
                JOptionPane.showMessageDialog(null, "Matricula não encontrada!");
            } else {
                if (n[0] == "0" && n[0] == "0") {
                    JOptionPane.showMessageDialog(null, "Função eBuscaNome Retornou posição 0!");
                } else {
                    jLabelnome.setText(n[0] + " - " + n[1]);
                }
            }
        }
    }//GEN-LAST:event_jButtonbuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonajusta;
    private javax.swing.JButton jButtonbusca;
    private javax.swing.JFormattedTextField jFormattedTextData;
    private javax.swing.JFormattedTextField jFormattedTextHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextMatricula;
    // End of variables declaration//GEN-END:variables
}
