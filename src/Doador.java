import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class Doador {
    private int id;
    private String nome;
    private String documento;
    private String telefone;

    public Doador(int id, String nome, String documento, String telefone) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDoador(){
        System.out.println("O ID do doador é" + id);
        System.out.println("O nome do doador é" + nome);
        System.out.println("O seu cpf é: " + documento);
        System.out.println("0 seu telefone é: " + telefone);
    }

    public void atuazalizarTelone(String novoTelefone){
        this.telefone =  novoTelefone;
    }

}
