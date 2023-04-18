public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 8");
        //Imprimir todos los múltiplos de 3, entre 1 y 100.
        for (int numero = 0; numero <= 100; numero++){
            if (numero%3 == 0){
                System.out.println(numero);
            }
        }
    }
}