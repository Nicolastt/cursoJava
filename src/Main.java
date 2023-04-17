import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio N° 1");

        int edad1;
        boolean vieneConUnAdulto;

        do {
            edad1 = Integer.parseInt(pedirEdad());
        } while (edad1 < 0 || edad1 > 30);

        vieneConUnAdulto = Objects.equals(preguntarAcompanante(), "S");

        boolean esMayorDeEdad = edad1 >= 18; //Es mayor de edad si tiene más de 18 años

        if (esMayorDeEdad || vieneConUnAdulto) {
            System.out.println("Puede entrar");
        } else {
            System.out.println("Fuera de aquí");
        }
    }

    private static String preguntarAcompanante() {
        String tieneAcompanate = JOptionPane.showInputDialog("Escribe S si vienes acompañado con un adulto");
        return tieneAcompanate;
    }

    private static String pedirEdad() {
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        return edad;
    }


}