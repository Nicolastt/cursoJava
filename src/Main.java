public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6");

        int n = 5;

        for (int fila = 0; fila <= n; fila++) {
            for (int col = 0; col < fila; col++) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}