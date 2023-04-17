public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");

        int nTerminos = 10;
        int[] fibo = new int[nTerminos];

        for (int i = 0; i < fibo.length; i++) {
            if (i == 0) {
                fibo[i] = 0;
            } else if (i == 1) {
                fibo[i] = 1;
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }

        for (int n : fibo) {
            System.out.println(n + " ");
        }

    }
}