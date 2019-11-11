package contrato.com.model;

import java.util.Date;
import java.util.List;

public class Prestador {
    private int id;
    private String nome;
    private String documento;
    private String idade;
    private String rg;
    private String endereco;
    private String cidade;

    public Prestador() {
    }

    public Prestador(int id, String nome, String documento, String idade, String rg, String endereco, String cidade) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
        this.rg = rg;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
