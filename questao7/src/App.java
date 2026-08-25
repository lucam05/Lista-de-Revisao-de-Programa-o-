import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double[] temperaturas = new double[12];
        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho", 
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        double maiorTemperatura = 0;
        double menorTemperatura = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;

        System.out.println("=== Leitura das Temperaturas Médias ===");
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            if (i == 0) {
                maiorTemperatura = temperaturas[i];
                menorTemperatura = temperaturas[i];
                indiceMaior = i;
                indiceMenor = i;
            } else {
      
                if (temperaturas[i] > maiorTemperatura) {
                    maiorTemperatura = temperaturas[i];
                    indiceMaior = i;
                }
                if (temperaturas[i] < menorTemperatura) {
                    menorTemperatura = temperaturas[i];
                    indiceMenor = i;
                }
            }
        }
        
        System.out.println("\n=== Resultados ===");
        System.out.println("A maior temperatura foi de " + maiorTemperatura + 
                           " graus e ocorreu no mês " + (indiceMaior + 1) + " - " + meses[indiceMaior] + ".");
                           
        System.out.println("A menor temperatura foi de " + menorTemperatura + 
                           " graus e ocorreu no mês " + (indiceMenor + 1) + " - " + meses[indiceMenor] + ".");
        
        scanner.close();
    }
}