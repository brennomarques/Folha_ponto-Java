package Formulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author brenno.lima
 */
public class ConectaBanco {
    
    public Statement stm; //responavél por preparar e realizar consultas no banco de dados.
    public ResultSet rs;////responavél por armezenar o resultado de uma pesquisa passada por Statement.
    private String driver = "org.postgresql.Driver";//responavél por identificar o serviço do banco de dados.
    private String caminho = "jdbc:postgresql://localhost:5432/BDponto"; //responsavel por setar o local do banco de dados.
    private String usuario = "postgres";
    private String senha = "321600";
    public Connection conn;//responavél por realizar a conexão com o banco de dandos.
    
     public void conexao(){//metado resposavel resposavel por realizar a conexão com o banco.
        try {
             System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiar a conexão com o banco de dados
            System.out.println("Conexão Realizada com Sucesso!!!");
        } catch (SQLException ex) {
            System.out.println("Erro de Conexão!!!");
        }   
     }
     public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ExecultaSQL!\n Erro: "+ex.getMessage());
        } 
     }
     public void desconecta(){//métado para fechar a conexão com o banco de dados
        try {
            conn.close();//fecha a conexão com o banco de dados.
            System.out.println("Conexão fecheda com sucesso!!!");
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar a conexão!!!"+ex);
        }
     }   
}
