package br.com.teclafacil.bean;

public class Jogos {
    private int jid;
    private String jnome;
    private String jdificuldade;

    public Jogos(int jid, String jnome, String jdificuldade) {
        this.jid = jid;
        this.jnome = jnome;
        this.jdificuldade = jdificuldade;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public String getJnome() {
        return jnome;
    }

    public void setJnome(String jnome) {
        this.jnome = jnome;
    }

    public String getJdificuldade() {
        return jdificuldade;
    }

    public void setJdificuldade(String jdificuldade) {
        this.jdificuldade = jdificuldade;
    }
}