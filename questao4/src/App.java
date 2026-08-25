import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        
        int[] X = new int[n];
        int[] Y = new int[m];
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter the value of X[" + i + "]: ");
            X[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < m; i++){
            System.out.print("Enter the value of Y[" + i + "]: ");
            Y[i] = scanner.nextInt();
        }
        
        int[] zTemp = new int[n + m];
        int tamanhoZ = 0; 
        
        for(int i = 0; i < n; i++) {
            boolean jaExiste = false;
            for(int j = 0; j < tamanhoZ; j++) {
                if(zTemp[j] == X[i]) {
                    jaExiste = true;
                    break; 
                }
            }
            if(!jaExiste) {
                zTemp[tamanhoZ] = X[i];
                tamanhoZ++;
            }
        }
        
        for(int i = 0; i < m; i++) {
            boolean jaExiste = false;
            for(int j = 0; j < tamanhoZ; j++) {
                if(zTemp[j] == Y[i]) {
                    jaExiste = true;
                    break;
                }
            }
            if(!jaExiste) {
                zTemp[tamanhoZ] = Y[i];
                tamanhoZ++;
            }
        }
        
        int[] Z = new int[tamanhoZ];
        for(int i = 0; i < tamanhoZ; i++) {
            Z[i] = zTemp[i];
        }

        System.out.println("\nThe values of Z are: ");
        for(int i = 0; i < tamanhoZ; i++){
            System.out.println(Z[i]);
        }
        scanner.close();
    }
}
