import java.util.Scanner;

public class App {
    public static int fatorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * fatorial(n-1);
        }

     }
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Digite um número para ser calculado: ");
        x = scanner.nextInt();
        int fat = fatorial(x);

        System.out.println("O fatorial de " + x + "! é: " + fat);

        scanner.close();
    }
}
