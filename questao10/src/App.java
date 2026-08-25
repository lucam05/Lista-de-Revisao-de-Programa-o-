import java.util.Scanner;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");

        double[][] vendas = new double[12][4];
        double totalAno = 0;

        System.out.println("=== Registro de Vendas Anuais ===");
        
  
        for (int i = 0; i < 12; i++) {
      
            String nomeMes = Month.of(i + 1).getDisplayName(TextStyle.FULL, ptBR);
            System.out.println("\n--- Mês: " + nomeMes.toUpperCase() + " ---");
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor vendido na " + (j + 1) + "ª semana: R$ ");
                vendas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n=========================================");
        System.out.println("=== RELATÓRIO DE VENDAS POR MÊS ===");
        System.out.println("=========================================");
 
        for (int i = 0; i < 12; i++) {
            double totalMes = 0;

            for (int j = 0; j < 4; j++) {
                totalMes += vendas[i][j];
            }
            
            String nomeMes = Month.of(i + 1).getDisplayName(TextStyle.FULL, ptBR);
            System.out.printf("Total vendido em %-9s : R$ %,10.2f\n", nomeMes, totalMes);
            
            totalAno += totalMes; 
        }

        System.out.println("\n=========================================");
        System.out.println("=== RELATÓRIO DE VENDAS POR SEMANA ===");
        System.out.println("=========================================");
        
        for (int j = 0; j < 4; j++) {
            double totalSemanaAno = 0;
            
          
            for (int i = 0; i < 12; i++) {
                totalSemanaAno += vendas[i][j];
            }
            
            System.out.printf("Total na %dª semana do mês ao longo do ano: R$ %,10.2f\n", (j + 1), totalSemanaAno);
        }

        System.out.println("\n=========================================");
        System.out.println("=== FATURAMENTO ANUAL ===");
        System.out.println("=========================================");
        
        System.out.printf("Total vendido pela loja no ano: R$ %,12.2f\n", totalAno);
        
        scanner.close();
    }
}