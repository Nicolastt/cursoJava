public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio3");
        int mes = 1221;

        switch (mes) {
            case 1 -> System.out.println("ENERO");
            case 2 -> System.out.println("FEBRERO");
            case 3 -> System.out.println("MARZO");
            case 4 -> System.out.println("ABRIL");
            case 5 -> System.out.println("MAYO");
            case 6 -> System.out.println("El mes es junio");
            case 7 -> System.out.println("El mes es julio");
            case 8 -> System.out.println("El mes es agosto");
            case 9 -> System.out.println("El mes es septiembre");
            case 10 -> System.out.println("El mes es octubre");
            case 11 -> System.out.println("El mes es noviembre");
            case 12 -> System.out.println("El mes es diciembre");
            default -> System.out.println("Mes inválido mi perrito");
        }

        //System.out.println("Hola");
    }
}