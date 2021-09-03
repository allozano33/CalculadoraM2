package calculadoram2.demo.model;

public class Imovel {


    String nome;
    String tamanho;
    String endereco;
    String imo;

    public Imovel ( ) {

    }


    public String getNome ( ) {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getTamanho ( ) {
        return tamanho;
    }

    public void setTamanho (String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEndereco ( ) {
        return endereco;
    }

    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }

    public String getImo ( ) {
        return imo;
    }

    public void setImo (String imo) {
        this.imo = imo;
    }

    public Imovel (String nome, String tamanho, String endereco, String imo) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.endereco = endereco;
        this.imo = imo;


    }
}
