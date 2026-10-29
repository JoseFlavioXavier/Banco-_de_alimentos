import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("        SISTEMA BANCO DE ALIMENTOS      ");
        System.out.println("======================================\n");

        System.out.println("--- Teste de Identidade e Referências ---");

        Alimento arroz1 = new Alimento(1, "Arroz Tipo 1", "Grãos", LocalDate.now().plusMonths(6));
        Alimento arroz2 = new Alimento(2, "Arroz Tipo 2", "Grãos", LocalDate.now().plusMonths(6));
        Alimento arroz3 = arroz1;

        System.out.println("arroz1 == arroz2 ? " + (arroz1 == arroz2));
        System.out.println("arroz1 == arroz3 ? " + (arroz1 == arroz3));
        System.out.println("-----------------------------------------\n");

        Estoque estoqueArroz = new Estoque();
        System.out.println("Estoque inicial: " + estoqueArroz.getQuantidade() + " kg");

        Doador doador = new Doador(1, "Supermercado Esperança", "12.345.678/0001-99", "(43) 99999-9999");

        Doacao doacao1 = new Doacao(1, doador, arroz1, 100.0);
        doacao1.registrarDoacao();
        doacao1.processarDoacao(estoqueArroz);
        System.out.println("Estoque atual: " + estoqueArroz.getQuantidade() + " kg\n");

        Distribuicao dist1 = new Distribuicao(1, arroz1, 30.0, "Instituição Beneficente");
        dist1.processar(estoqueArroz);
        System.out.println("Estoque atual: " + estoqueArroz.getQuantidade() + " kg\n");

        Perda perda1 = new Perda(1, arroz1, 5.0, "Embalagem danificada");
        perda1.processar(estoqueArroz);
        System.out.println("Perda registrada: " + perda1.getQuantidade() + " kg");
        System.out.println("Motivo: " + perda1.getMotivo());
        System.out.println("Estoque atual: " + estoqueArroz.getQuantidade() + " kg\n");

        System.out.println("Distribuição solicitada: 80.0 kg");
        Distribuicao dist2 = new Distribuicao(2, arroz1, 80.0, "Famílias Carentes");
        dist2.processar(estoqueArroz);

        System.out.println("Estoque permanece: " + estoqueArroz.getQuantidade() + " kg");
        System.out.println("========================================");
    }
}
