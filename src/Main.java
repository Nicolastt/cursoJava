public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        for (int fila = 1 ; fila <= 10; fila++){
            for (int columna = 1; columna <= 10; columna++){
                System.out.print(fila*columna);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}