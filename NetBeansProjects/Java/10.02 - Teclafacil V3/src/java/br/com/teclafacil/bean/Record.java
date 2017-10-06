package br.com.teclafacil.bean;

public class Record {
    
    private int rid;
    private String rdata;
    private String rpontos;       
    private int rjid;
    private int ruid;

    public Record(int rid, String rdata, String rpontos, int rjid, int ruid) {
        this.rid = rid;
        this.rdata = rdata;
        this.rpontos = rpontos;
        this.rjid = rjid;
        this.ruid = ruid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRdata() {
        return rdata;
    }

    public void setRdata(String rdata) {
        this.rdata = rdata;
    }

    public String getRpontos() {
        return rpontos;
    }

    public void setRpontos(String rpontos) {
        this.rpontos = rpontos;
    }

    public int getRjid() {
        return rjid;
    }

    public void setRjid(int rjid) {
        this.rjid = rjid;
    }

    public int getRuid() {
        return ruid;
    }

    public void setRuid(int ruid) {
        this.ruid = ruid;
    }
    
}