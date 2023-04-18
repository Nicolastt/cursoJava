public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9");

        System.out.println(calcularFactorial(5));

    }

    private static int calcularFactorial(int n) {

        int resultado = 0;

        for (int i = 1; i <= n; i++) {
            if (n == 1) {
                resultado = 1;
            } else {
                resultado = n * calcularFactorial(n-1);
            }
        }
        return resultado;
    }
}
