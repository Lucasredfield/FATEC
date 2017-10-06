package br.com.teclafacil.controler;

import br.com.teclafacil.bean.Jogos;
import br.com.teclafacil.db.JogosDao;
import java.sql.SQLException;
import java.util.List;

public class JogosControler {   

    public Jogos validaJogos(Jogos jg) throws SQLException, ClassNotFoundException {
        JogosDao jgDao = new JogosDao();
//        jg = jgDao.validaLogin(jg);
        return jg;
    }
    
    public Jogos inserirJogos(Jogos jg) throws SQLException, ClassNotFoundException {
        JogosDao jgDao = new JogosDao();
        jg = jgDao.inseri(jg);
        return jg;
    }

    public Jogos excluirJogos(Jogos jg) throws SQLException, ClassNotFoundException {
        JogosDao jgDao = new JogosDao();
        jg = jgDao.exclui(jg);
        return jg;
    }
   
    public Jogos buscarJogos(Jogos jg) throws SQLException, ClassNotFoundException {
        JogosDao jgDao = new JogosDao();
        jg = jgDao.busca(jg);
        return jg;
    }
    
    public Jogos alterarJogos(Jogos jg) throws SQLException, ClassNotFoundException {
        JogosDao usuDao = new JogosDao();
        jg = usuDao.altera(jg);
        return jg;
    }
    
    public List<Jogos> listarJogos(Jogos jg) throws SQLException, ClassNotFoundException {
        List<Jogos> jgs ;
        JogosDao jgDao = new JogosDao();
        jgs = jgDao.lista(jg);
        return jgs;
    }
}
