/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
public class Consulta_Ponto extends javax.swing.JInternalFrame {

    ConectaBanco conect = new ConectaBanco();//realiza a conexão com o banco de dados, variavel global   
    ResultSet rs;

    public Consulta_Ponto() {
        initComponents();
        conect.conexao();//Conexão com o banco de dados
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonbusca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelnome = new javax.swing.JLabel();
        jDateChooser_inicial = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser_final = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelstatus = new javax.swing.JLabel();
        jLabelf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelsaldo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabeldiatrablho = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelsemanal = new javax.swing.JLabel();
        jLabelmensal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableconsult = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Ponto");
        setPreferredSize(new java.awt.Dimension(590, 444));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta:"));

        jTextMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextMatriculaKeyPressed(evt);
            }
        });

        jLabel1.setText("Matricula:");

        jButtonbusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Localizar_8x8.png"))); // NOI18N
        jButtonbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        jLabelnome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelnome.setForeground(new java.awt.Color(0, 0, 204));
        jLabelnome.setText("...");

        jLabel2.setText("DE");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Localizar_16x16.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_final, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelnome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonbusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jDateChooser_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelnome))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelstatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelstatus.setText("...");

        jLabelf.setText("Saldo:");

        jLabel3.setText("Status:");

        jLabelsaldo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelsaldo.setText("...");

        jLabel5.setText("Dia de Trabalho:");

        jLabeldiatrablho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabeldiatrablho.setForeground(new java.awt.Color(0, 0, 204));
        jLabeldiatrablho.setText("...");

        jLabel7.setText("Semanal:");

        jLabel8.setText("Mensal:");

        jLabelsemanal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelsemanal.setForeground(new java.awt.Color(0, 0, 204));
        jLabelsemanal.setText("...");

        jLabelmensal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelmensal.setForeground(new java.awt.Color(0, 0, 204));
        jLabelmensal.setText("...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelmensal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeldiatrablho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelsemanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeldiatrablho)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelsemanal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelmensal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelf)
                    .addComponent(jLabelsaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelstatus)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48))
        );

        jTableconsult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableconsult);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 656, 430);
    }// </editor-fold>//GEN-END:initComponents

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
                    //jLabelnome.setText(conect.rs.getString("nome") + " - " + conect.rs.getString("turno"));
                    v[0] = conect.rs.getString("nome");
                    v[1] = conect.rs.getString("turno");
                    return v;
                } else {
                    //JOptionPane.showMessageDialog(null, "Usuario DESATIVADO!");
                    v[0] = "DESATIVADO";
                    return v;
                }
            } else {
                //JOptionPane.showMessageDialog(null, "Matricula não encontrada!");
                v[1] = "Matricula não encontrada!";
                return v;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Correcao_Ponto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    private void jButtonbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscaActionPerformed
        //eBucaNome(jTextMatricula.getText().trim());
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
    private String eFormateData(Date dat) {//FUNÇÃO PARA FORMATAÇÃO DE DATA, RETORNANDO A DATA FORMATADA
        String data;
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");//"dd/MM/yyyy
        data = sdf.format(dat);
        return data;
    }

    private int eContaLinha(String SQL) {//FUNÇÃO PARA BUSCA A QUANTILDADE  LINHA, USANDO SELECT COUNT, RETORNA A NUMEROS DE LINHAS REGISTRADAS 
        conect.executaSQL(SQL);
        int cont = 0;
        try {
            conect.rs.next();
            cont = conect.rs.getInt("count");
        } catch (SQLException ex) {
            System.out.println("Erro no eContaLinha \n" + ex);
        }
        return cont;
    }

    private void eHoras(String d) {
        if (d == "Par") {
            jLabelstatus.setText("OK");
            jLabeldiatrablho.setText("4:00");
            jLabelsemanal.setText("20:00");
            jLabelmensal.setText("80:00");
        } else {
            jLabelstatus.setText("Batida Impar, confira.");
            jLabeldiatrablho.setText("6:00");
            jLabelsemanal.setText("30:00");
            jLabelmensal.setText("120:00");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!(jDateChooser_inicial.getDate() == null || jDateChooser_final.getDate() == null || jTextMatricula.getText() == null)) {
            java.util.Date dat1 = jDateChooser_inicial.getDate();
            java.util.Date dat2 = jDateChooser_final.getDate();
            String matricula = jTextMatricula.getText();
            String datainicial = eFormateData(dat1);
            String datafinal = eFormateData(dat2);
            //eBucaNome(jTextMatricula.getText().trim());
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
            String SQLP = "SELECT PESSOA.MATRICULA, PESSOA.NOME, PONTOS.DATADIA\n"
                    + "FROM PESSOA\n"
                    + "INNER JOIN PONTOS\n"
                    + "ON PESSOA.MATRICULA = PONTOS.MATRICULA AND PESSOA.MATRICULA = '" + matricula + "'"
                    + "WHERE CAST(datadia AS Date) Between '" + datainicial + "' AND '" + datafinal + "'";
            preencherTabela(SQLP);//função preencher tabela

            String SQL = ("SELECT COUNT(*)\n"
                    + "FROM PESSOA\n"
                    + "INNER JOIN PONTOS\n"
                    + "ON PESSOA.MATRICULA = PONTOS.MATRICULA AND PESSOA.MATRICULA = '" + matricula + "'"
                    + "WHERE CAST(datadia AS Date) Between '" + datainicial + "' AND '" + datafinal + "'");
            int cont = eContaLinha(SQL);
            if (cont % 2 == 0) {
                String v[] = eBuscaHora(SQLP, cont);//Função buscar hora BANCO DE DADO.
                String horas = eCalculaHoras(v, cont);//Função para realizar o calculo das horas.
                jLabelstatus.setForeground(Color.BLUE);
                jLabelsaldo.setForeground(Color.BLUE);
                jLabelsaldo.setText(horas);
                //jLabelstatus.setText("OK");
                eHoras("Par");
                System.out.println("Dentro if par" + cont);
            } else {

                System.out.println("Fora do if impar: " + cont);
                jLabelstatus.setForeground(Color.RED);
                eHoras("Impar");
//                jLabelstatus.setText("Batida Impar, confira.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Confira as informações!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private String eCalculaHoras(String x[], int tm)//lembrado que o tm é o tamanho do vertor
    {
        long horas = 0, hor = 0;
        long minutos = 0;
        int j = 1;
        String horatotal, mt;
        Duration diff;
        for (int i = 0; i < tm; i += 2, j = j + 2) {
            //System.out.println("Posição I: " + x[i]);
            LocalTime hr1 = eFormataHora(x[i]);
            //System.out.println("Posição J: " + x[j]);
            LocalTime hr2 = eFormataHora(x[j]);

            diff = Duration.between(hr1, hr2);// Duration e classe que calcula a diferença entre dois tempos            
            horas += diff.toHours(); //horas, realiza a soma da diferença
            hor = diff.toHours();// pega somente o minutos da diferenção do calculo, tem relação com hours.
            minutos += diff.minusHours(hor).toMinutes(); //minutos, para saber o meinutos não pode pega a soma das horas, tem que se somente os minutos ho
            if (minutos >= 60) {//se o munitos for  maior ou igual e 60 munutos faz a soma para hora, ou seja soma um hora
                horas = horas + (minutos - (minutos % 60)) / 60;
                minutos = minutos % 60;
            }
        }
        if (minutos == 0) {//se munuto tiver um casa decimal zero, passa para string e acrecenta 00
            mt = "00";
            horatotal = horas + ":" + mt;
            return horatotal;
        }
        horatotal = horas + ":" + minutos;
        return horatotal;
    }

    private LocalTime eFormataHora(String datetime) {
        String hora = datetime.substring(11, 13);
        int hr = Integer.parseInt(hora);//converter numero em String para inteiro.
        String minutos = datetime.substring(14, 16);
        int minut = Integer.parseInt(minutos);
        String segundo = datetime.substring(17, 19);
        int segu = Integer.parseInt(segundo);
        //String junta = hora +":"+minutos+":"+segundo;
        LocalTime time = LocalTime.of(hr, minut);
        return time;
    }

    private String[] eBuscaHora(String SQL, int cont) {//Função buscar hora BANCO DE DADO.
        String v[] = new String[cont]; // declaração do vetor "v"
        int i = 0;
        conect.executaSQL(SQL);
        try {
            conect.rs.first();
            do {
                String dt = conect.rs.getString("datadia");
                v[i] = dt;//datatime e inserido em um posição do vertor, 
                i++;
            } while (conect.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "eBuscaHoraPar!\n Erro: " + ex);
        }
        return v;
    }
    public String eFormataDataTime(String dado) {
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
        try {
            conect.rs.first();
            do {
                String dt = conect.rs.getString("datadia");
                dt = eFormataDataTime(dt);
                dados.add(new Object[]{conect.rs.getInt("Matricula"), conect.rs.getString("Nome"), dt});
            } while (conect.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Os dados fornecidos não foram encontrados:\n " + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableconsult.setModel(modelo);

        jTableconsult.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTableconsult.getColumnModel().getColumn(0).setResizable(false);

        jTableconsult.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableconsult.getColumnModel().getColumn(1).setResizable(false);

        jTableconsult.getColumnModel().getColumn(2).setPreferredWidth(141);
        jTableconsult.getColumnModel().getColumn(2).setResizable(false);

        jTableconsult.getTableHeader().setReorderingAllowed(false);
        jTableconsult.setAutoResizeMode(jTableconsult.AUTO_RESIZE_OFF);
        jTableconsult.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonbusca;
    private com.toedter.calendar.JDateChooser jDateChooser_final;
    private com.toedter.calendar.JDateChooser jDateChooser_inicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabeldiatrablho;
    private javax.swing.JLabel jLabelf;
    private javax.swing.JLabel jLabelmensal;
    private javax.swing.JLabel jLabelnome;
    private javax.swing.JLabel jLabelsaldo;
    private javax.swing.JLabel jLabelsemanal;
    private javax.swing.JLabel jLabelstatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableconsult;
    private javax.swing.JTextField jTextMatricula;
    // End of variables declaration//GEN-END:variables
}
