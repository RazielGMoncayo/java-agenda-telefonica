import com.generation.ejercicio.informacion.Agenda;
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

        Agenda agenda = new Agenda(10);

        Contacto c = new Contacto("Perez", "Ian", 25242323);

        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);
        agenda.adContacto(c);

        agenda.listarContactos();
    }
}