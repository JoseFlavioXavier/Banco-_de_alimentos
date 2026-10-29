
import java.time.LocalDate;

public class Distribuicao {
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public boolean isProcessada() {
        return processada;
    }

    private int id;
    private Alimento novoAlimento;
    private double quantidade;
    private LocalDate data;
    private String beneficiario;
    private boolean processada;

    public Distribuicao(int id, Alimento novoAlimento, double quantidade, String beneficiario) {
        this.id = id;
        this.novoAlimento = novoAlimento;
        this.quantidade = quantidade;
        this.data = LocalDate.now();
        this.beneficiario = beneficiario;
        this.processada = false;
    }

    public boolean processar(Estoque estoque){
        if (this.processada){
            System.out.println("Erro ao procesar a doação. Essa doação já foi processada");
            return false;

        } if (this.quantidade >0 && this.novoAlimento != null && this.novoAlimento.verificarValidade() && this.quantidade <= estoque.getQuantidade()){
            System.out.println("A doção foi solicitada" + this.quantidade + "kg");
            estoque.registrarDistribuicao(this.quantidade);
            System.out.println("Doação realizada com sucesso");
            this.processada = true;
            return true;
        } else {
            System.out.println("Quantidade insuficinete");
            return false;
        }
    }
}
