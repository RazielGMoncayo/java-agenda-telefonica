import com.generation.ejercicio.informacion.Agenda;
import com.generation.ejercicio.informacion.Contacto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String name = sc.nextLine();
        System.out.println("Ingrese el apellido");
        String lastname = sc.nextLine();
        System.out.println("Ingrese el numero");
        int numero = sc.nextInt();
        Contacto nuevoContacto = new Contacto(lastname,name,numero);
        Agenda.adContacto(nuevoContacto);


    }
}