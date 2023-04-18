public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7");

        //1
        //12
        //123
        //1234
        //12345

        int n = 6;

        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col < fila; col++) {
                System.out.print(col);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}