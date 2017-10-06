package br.com.teclafacil.db;

import br.com.teclafacil.bean.Jogos;
import br.com.teclafacil.util.ConexaoDB;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class JogosDao {

    private final Connection c;
    
    public JogosDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Jogos busca(Jogos jg) throws SQLException{
        String sql = "select * from  WHERE jid = ?";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,jg.getJid());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                jg.setJid(rs.getInt(1));
                jg.setJnome(rs.getString(2));
                jg.setJdificuldade(rs.getString(3));
            }
        }
        return jg;
    }
    
    public Jogos altera(Jogos jg) throws SQLException{
        String sql = "UPDATE jogos SET jnome = ?, jdificuldade = ?,  WHERE Jid = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,jg.getJnome());
            stmt.setString(2,jg.getJdificuldade());
            stmt.setInt(3,jg.getJid());           
            stmt.execute();
        }
        return jg;
    }

    public Jogos exclui(Jogos jp) throws SQLException{
        String sql = "delete from jogos WHERE jid = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,jp.getJid());
            
            stmt.execute();
        }
        c.close();
        return jp;
    }

    
/* Método abaixo não é necessário
    
    public Jogos validaLogin(Jogos jg) throws SQLException{
       
        String sql = "select * from usuarios WHERE ulogin = ? AND usenha = ?";
       
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,jg.getJlogin());
            stmt.setString(2,jg.getJsenha());
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                jg.setJid(rs.getInt(1));
                jg.setJnome(rs.getString(2));
                jg.setJlogin(rs.getString(3));
                jg.setJsenha(rs.getString(4));
                jg.setJnasc(rs.getString(5));
                jg.setJtipo(rs.getString(6));
            }
        }
        return jg;
    } // Jogos
    */
    
    public List<Jogos> lista(Jogos jgEnt) throws SQLException{

        List<Jogos> jgs = new ArrayList<>();
        
        String sql = "select * from jogos where jnome like ?";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + jgEnt.getJnome() + "%");      
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    
                    Jogos jg = new Jogos(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3)
                    );
                    
                    jgs.add(jg);
                }
            }
        }
        return jgs;
    }
    
    public Jogos inseri(Jogos jg) throws SQLException{
        String sql = "insert into jogos" + " (jnome, jdificuldade)" + " values (?,?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,jg.getJnome());
            stmt.setString(2,jg.getJdificuldade());            
            stmt.execute();
        }
        return jg;
    }
}

/* Método não utilizado
    public Jogos validaLogin(Jogos jg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 

    public Jogos inseri(Jogos jg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Jogos exclui(Jogos jg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Jogos busca(Jogos jg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Jogos altera(Jogos jg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
*/