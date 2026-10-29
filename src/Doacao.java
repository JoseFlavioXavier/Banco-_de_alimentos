import java.time.LocalDate;

public class Doacao {
    private int id;
    private Doador novoDoador;
    private Alimento novoAlimento;
    private double quantidade;
    private LocalDate data;
    private boolean processada;

    public Doacao(int id, Doador novoDoador, Alimento novoAlimento, double quantidade) {
        this.id = id;
        this.novoDoador = novoDoador;
        this.novoAlimento = novoAlimento;
        this.quantidade = quantidade;
        this.data = LocalDate.now();
        this.processada = false;
    }

    public int getId() {
        return id;
    }

    public Doador getNovoDoador() {
        return novoDoador;
    }

    public void setNovoDoador(Doador novoDoador) {
        this.novoDoador = novoDoador;
    }

    public Alimento getNovoAlimento() {
        return novoAlimento;
    }

    public void setNovoAlimento(Alimento novoAlimento) {
        this.novoAlimento = novoAlimento;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isProcessada() {
        return processada;
    }

    public void registrarDoacao() {
        System.out.println("---- Registrar Doacao ----");
        System.out.println("ID da Doação: " + id);
        System.out.println("O alimento doado é: " + novoAlimento.getNome());
        System.out.println("A doação está em nome do doador: " + novoDoador.getNome());
        System.out.println("A quantidade doada é de: " + quantidade);
    }

    public boolean processarDoacao(Estoque estoqueDoacao) {
        if (this.processada) {
            System.out.println("Erro: Esta doação (ID: " + this.id + ") já foi processada anteriormente.");
            return false;
        }

        if (this.novoAlimento != null && this.novoAlimento.verificarValidade() && this.quantidade > 0) {
            System.out.println("Doação aceita, o alimento está próprio para o consumo.");
            estoqueDoacao.registrarEntrada(this.quantidade);
            this.processada = true;
            return true;

        } else {
            System.out.println("Doação negada, o alimento não está próprio para consumo ou quantidade inválida.");
            return false;
        }
    }
}