package br.com.teclafacil.controler;

import br.com.teclafacil.bean.Record;
import br.com.teclafacil.db.RecordDao;
import java.sql.SQLException;
import java.util.List;

public class RecordControler {
    
    public Record validaRecord(Record rd) throws SQLException, ClassNotFoundException {
        RecordDao rdDao = new RecordDao();
//        rd = rdDao.validaLogin(rd);
        return rd;
    }
    
    public Record inserirRecord(Record rd) throws SQLException, ClassNotFoundException {
        RecordDao rdDao = new RecordDao();
        rd = rdDao.inseri(rd);
        return rd;
    }

    public Record excluirRecord(Record rd) throws SQLException, ClassNotFoundException {
        RecordDao rdDao = new RecordDao();
        rd = rdDao.exclui(rd);
        return rd;
    }
   
    public Record buscarRecord(Record rd) throws SQLException, ClassNotFoundException {
        RecordDao rdDao = new RecordDao();
        rd = rdDao.busca(rd);
        return rd;
    }
    
    public Record alterarRecord(Record rd) throws SQLException, ClassNotFoundException {
        RecordDao rdDao = new RecordDao();
        rd = rdDao.altera(rd);
        return rd;
    }
    
    public List<Record> listarRecord(Record rd) throws SQLException, ClassNotFoundException {
        List<Record> rds ;
        RecordDao anaDao = new RecordDao();
        rds = anaDao.lista(rd);
        return rds;
    }
}
