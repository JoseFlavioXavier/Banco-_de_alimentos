public class Estoque {
    private double quantidade;

    public Estoque() {
        this.quantidade = 0.0;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double registrarEntrada(double quantidadeAdicionada) {
        if (quantidadeAdicionada > 0) {
            this.quantidade += quantidadeAdicionada;
        }
        return this.quantidade;
    }


    public double registrarDoacao(double quantidadeDoada) {
        if (quantidadeDoada > 0 && quantidadeDoada <= this.quantidade) {
            this.quantidade -= quantidadeDoada;
        }
        return this.quantidade;
    }

    public double registrarPerda(double quantidadePerdida){
        if (quantidadePerdida > 0 && quantidadePerdida <= quantidade){
            this.quantidade -= quantidadePerdida;
        }
        return quantidade;
    }

   public double registrarDistribuicao(double quantidadeDistribuida){
        if (quantidadeDistribuida > 0 && quantidadeDistribuida <= quantidade){
            this.quantidade -= quantidadeDistribuida;
        }
        return quantidade;
   }
}