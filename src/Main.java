public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio N° 1");
        int edad = 18;
        boolean vieneConUnAdulto = true;
        boolean esMayorDeEdad = edad >= 18; //Es mayor de edad si tiene más de 18 años

        if (esMayorDeEdad || vieneConUnAdulto){
            System.out.println("Puede entrar");
        } else {
            System.out.println("Fuera de aquí");
        }
    }
}