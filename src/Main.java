public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");

        int contador = 0;
        int suma = 0;
        while (contador <= 10){
            System.out.println(contador);
            suma += contador;
            contador++;
        }

        System.out.println("La suma de todos los números es: " + suma);

    }
}