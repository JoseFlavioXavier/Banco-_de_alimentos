import java.time.LocalDate;

public class Alimento {
    private int id;
    private String nome;
    private String categoria;
    private LocalDate dataValidade;



    public Alimento(int id, String nome, String categoria, LocalDate dataValidade) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.dataValidade = dataValidade;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void exibirAlimento(){
        System.out.println("O id do alimento é: " + this.id);
        System.out.println("O nome do alimento é: " + this.nome);
        System.out.println("A categoria do alimento é: " + this.categoria);
        System.out.println("A sua data de vencimento é: " + this.dataValidade);
    }

    public boolean verificarValidade(){
        LocalDate dataAtual = LocalDate.now();

        if (dataAtual.isAfter(dataValidade)){
            System.out.println("O alimento: " + nome + "Está próprio para o consumo");
            return true;
        } else {
            System.out.println("O alimento" + nome + "Não está próprio para o consumo");
            return false;
        }
    }
}