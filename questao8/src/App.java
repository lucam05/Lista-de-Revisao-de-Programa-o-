import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int TAMANHO = 10;
        final double SALARIO_BASE = 545.00;
        final double TAXA_COMISSAO = 0.05;
        
        double[] precos = new double[TAMANHO];
        int[] quantidades = new int[TAMANHO];

        System.out.println("=== Entrada de Dados dos Produtos ===");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("\nProduto " + i + ":");
            System.out.print("Valor unitário (R$): ");
            precos[i] = scanner.nextDouble();
            
            System.out.print("Quantidade vendida: ");
            quantidades[i] = scanner.nextInt();
        }
        
        double valorGeralVendas = 0;
        int maiorQuantidade = -1;
        int posicaoMaisVendido = -1;
        
        System.out.println("\n=======================================================");
        System.out.println("=== RELATÓRIO DE VENDAS ===");
        System.out.println("=======================================================");
        System.out.printf("%-10s | %-12s | %-15s\n", "Qtd Vendida", "Valor Unit.", "Valor Total (R$)");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < TAMANHO; i++) {
            double valorTotalObjeto = precos[i] * quantidades[i];
            valorGeralVendas += valorTotalObjeto;
            
            System.out.printf("%-11d | R$ %-9.2f | R$ %-12.2f\n", quantidades[i], precos[i], valorTotalObjeto);
            
            if (quantidades[i] > maiorQuantidade) {
                maiorQuantidade = quantidades[i];
                posicaoMaisVendido = i;
            }
        }
        
        System.out.println("-------------------------------------------------------");
        
        double valorComissao = valorGeralVendas * TAXA_COMISSAO;
        double salarioFinal = SALARIO_BASE + valorComissao;
        
        System.out.printf("\nValor geral das vendas: R$ %.2f\n", valorGeralVendas);
        System.out.printf("Comissão do vendedor (5%%): R$ %.2f\n", valorComissao);
        System.out.printf("Salário total (Base + Comissão): R$ %.2f\n", salarioFinal);
        
        System.out.println("\n=== Destaque de Vendas ===");
        System.out.println("O objeto mais vendido está na posição [" + posicaoMaisVendido + "] do vetor.");
        System.out.printf("Valor unitário do objeto mais vendido: R$ %.2f\n", precos[posicaoMaisVendido]);
        System.out.println("Quantidade comercializada deste objeto: " + maiorQuantidade);
        
        scanner.close();
    }
}