package br.com.teclafacil.db;

import br.com.teclafacil.bean.Record;
import br.com.teclafacil.util.ConexaoDB;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class RecordDao {

    private final Connection c;
    
    public RecordDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Record busca(Record rd) throws SQLException{
        String sql = "select * from record WHERE rid = ?";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,rd.getRid());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                rd.setRid(rs.getInt(1));
                rd.setRdata(rs.getString(2));
                rd.setRjid(rs.getInt(3));
                rd.setRpontos(rs.getString(4));
                rd.setRuid(rs.getInt(5));
            }
        }
        return rd;
    }
    
    public Record altera(Record rd) throws SQLException{
        String sql = "UPDATE record SET rdata = ?, rjid = ?, rpontos = ?, ruid = ? WHERE rid = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,rd.getRdata());
            stmt.setInt(2,rd.getRjid());
            stmt.setString(3,rd.getRpontos());
            stmt.setInt(4,rd.getRuid());
            stmt.setInt(5,rd.getRid());
            stmt.execute();
        }
        return rd;
    }

    public Record exclui(Record rd) throws SQLException{
        String sql = "delete from usuarios WHERE rid = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,rd.getRid());            
            stmt.execute();
        }
        c.close();
        return rd;
    }
/* 
    public Record validaLogin(Record rd) throws SQLException{
       
        String sql = "select * from usuarios WHERE ulogin = ? AND usenha = ?";
       
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,rd.getUlogin());
            stmt.setString(2,rd.getUsenha());
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                usu.setUid(rs.getInt(1));
                usu.setUnome(rs.getString(2));
                usu.setUlogin(rs.getString(3));
                usu.setUsenha(rs.getString(4));
                usu.setUnasc(rs.getString(5));
                usu.setUtipo(rs.getString(6));
            }
        }
        return usu;
    }
*/
   
    public Record inseri(Record rd) throws SQLException{
        String sql = "insert into record" + " (rdata, rpontos, rid)" + " values (?,?,?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,rd.getRdata());
            stmt.setString(2,rd.getRpontos());
            stmt.setInt(3,rd.getRid());
            
            stmt.execute();
        }
        return rd;
    }
    public List<Record> lista(Record rdEnt) throws SQLException{

        List<Record> rds = new ArrayList<>();
        
        String sql = "select * from record where rid like ?";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + rdEnt.getRid()+ "%");      
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    
                    Record rd = new Record(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5)
                    );
                    
                    rds.add(rd);
                }
            }
        }
        return rds;
    }
}