package model;

public class Motorista {
    private String nome;
    private String tipoHabilitacao;
    private String numeroCnh;

    public Motorista(String nome, String tipoHabilitacao, String numeroCnh) {
        this.setNome(nome);
        this.setTipoHabilitacao(tipoHabilitacao);
        this.setNumeroCnh(numeroCnh);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoHabilitacao() {
        return tipoHabilitacao;
    }

    public void setTipoHabilitacao(String tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String toString(){
        String saida;
        saida = "Nome: "+this.getNome() + 
                   "\nTipo de habilitacao: "+this.getTipoHabilitacao()+
                   "\nNumero da CNH: "+this.getNumeroCnh();
        return saida;
    }
}
