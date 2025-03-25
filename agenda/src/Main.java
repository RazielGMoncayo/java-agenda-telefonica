

import com.generation.ejercicio.informacion.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        Agenda agenda = new Agenda("", "", 0); // Creamos una agenda vacía

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Bienvenido a Agendrix!! Tu agenda personal");
        System.out.println("\n");
        System.out.println("¿Prefieres configuración personalizada o inicio rapido?");

        System.out.println("1) Personalizar");
        System.out.println("2) Iniciar (10 contactos por defecto)");

        menu = scanner.nextInt(); // Corregido: usa el scanner existente

        // buscaContacto después de la seleccion del menu
        System.out.println("\nPrueba de búsqueda de contacto:");
        System.out.println("Ingrese un nombre a buscar:");
        scanner.nextLine(); // Limpiar buffer
        String nombreBuscar = scanner.nextLine();

        agenda.buscaContacto(nombreBuscar); // Llamada al método de búsqueda
    }
}