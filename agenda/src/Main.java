import com.generation.ejercicio.informacion.Contacto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu;

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Bienvenido a Agendrix!! Tu agenda personal");
        System.out.println("\n");
        System.out.println("¿Prefieres configuración personalizada o inicio rapido?");

        System.out.println("1) Personalizar");
        System.out.println("2) Iniciar (10 contactos por defecto)");

        menu = new Scanner(System.in).nextInt();

        switch(menu){
            case 4:
                System.out.print("Ingrese nombre: ");
                nombre = scanner.nextLine().trim();
                System.out.print("Ingrese apellido: ");
                apellido = scanner.nextLine().trim();
                agenda.eliminarContacto(new Contacto(nombre, apellido, ""));
                break;
        }

    }
}