import java.time.LocalDate;

public class Perda {
    private int id;
    private Alimento novoAlimento;
    private double quantidade;
    private String motivo;
    private LocalDate data;
    private boolean processada;

    public Perda(int id, Alimento novoAlimento, double quantidade, String motivo) {
        this.id = id;
        this.novoAlimento = novoAlimento;
        this.quantidade = quantidade;
        this.motivo = motivo;
        this.data = LocalDate.now();
        this.processada = false;
    }

    public int getId() {
        return id;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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


    public boolean processar(Estoque estoque) {
        if (this.processada) {
            System.out.println("Erro: Esta perda (ID: " + this.id + ") já foi processada anteriormente.");
            return false;
        }


        if (this.novoAlimento != null && this.quantidade > 0) {
            System.out.println("Perda válida registrada. Motivo: " + this.motivo);
            estoque.registrarPerda(this.quantidade);

            this.processada = true;
            return true;
        } else {
            System.out.println("Perda inválida: quantidade ou alimento incorreto.");
            return false;
        }
    }
}