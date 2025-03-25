import com.generation.ejercicio.informacion.Agenda;
import com.generation.ejercicio.informacion.Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int menu;
        boolean programa = true;
        int numContactos;

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Bienvenido a Agendrix!! Tu agenda personal");
        System.out.println("\n");
        System.out.println("¿Prefieres configuración personalizada o inicio rapido?");

        System.out.println("1) Personalizar");
        System.out.println("2) Iniciar (10 contactos por defecto)");

        menu = sc.nextInt();

        if(menu == 1){
            System.out.println("Ingresa el numero de contactos que deseas tener en tu agenda");
            numContactos= sc.nextInt();
            Agenda agenda = new Agenda(numContactos);
        }else{
            numContactos = 10;
            Agenda agenda = new Agenda(10);
        }

        Agenda agenda = new Agenda(numContactos);

        while(programa){

            int currentContactos = agenda.getContactos().size();
            System.out.println(agenda.getContactos());
            System.out.println("\n");

            System.out.println("---------- AGENDIX ---------");
            System.out.println("Ingresa el numero correspondiente a la opción:       (contactos: " + currentContactos  +"/ "+ numContactos + ")");
            System.out.println("\n");
            System.out.println("1) Listar contactos");
            System.out.println("2) Agregar contacto");
            System.out.println("3) Eliminar contacto");
            System.out.println("4) Modificar contacto");
            System.out.println("5) Buscar contacto");
            System.out.println("6) Salir");

            menu = sc.nextInt();

            if(menu == 6){
                System.out.println("Hasta luego!!");
                programa = false;
                continue;
            }

            switch (menu){
                case 1:
                    System.out.println("Listar contactos");
                    listarContactos(agenda);
                    break;
                case 2:
                    System.out.println("Agregar contacto");
                    System.out.println("\n");
                    agregarContacto(agenda);
                    break;
                case 3:
                    System.out.println("Eliminar contacto");
                    break;
                case 4:
                    System.out.println("Modificar contacto");
                    break;
                case 5:
                    System.out.println("Buscar contacto");
                    buscarContacto(agenda);
                    break;
                default:
                    System.out.println("Ingreses una opcion valida........... (1 - 5)");
                    break;
            }

        }
    }

    public static void agregarContacto(Agenda agenda){

        String nombre;
        String lastname;
        long telefono;

        try{
            System.out.println("Ingresa el nombre del contacto: ");
            nombre = sc.next();
            System.out.println("Ingrese los apellidos del contacto: ");
            lastname = sc.next();
            System.out.println("Ingresa el numero de telefono del contacto: ");
            telefono = sc.nextLong();
        }catch(Exception e){
            System.out.println("Error al ingresar los datos del contacto, verifique sus datos e intente nuevamente.");
            return;
        }

        Contacto c = new Contacto(lastname, nombre, telefono);
        agenda.adContacto(c);
        System.out.println("El contacto: ");
        System.out.println(c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        System.out.println("ah sido añadido con exito!!");
    }

    public static void listarContactos(Agenda agenda){
        ArrayList<Contacto> contactos = agenda.getContactos();

        System.out.println( "Listado de contactos: ");
        for(Contacto c : contactos){
            System.out.println(c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
    }

    public static void modificarContacto(Agenda agenda){}

    public static void eliminarContacto(Agenda agenda){}

    public static void buscarContacto(Agenda agenda){
        String nombre;
        String lastname;
        long telefono;
        boolean encontrado = false;

        while(encontrado == false){
            System.out.println( "Seleccione una opcion de busqueda:  (1 - 4 + Enter)");
            System.out.println( "1) Buscar por nombre" );
            System.out.println( "2) Buscar por apellido" );
            System.out.println( "3) Buscar por telefono" );
            System.out.println( "4) Regresar al menu anterior" );
            int aux = sc.nextInt();

            if(aux == 4) {
                encontrado = true;
                return;
            }

            switch (aux){
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    nombre = sc.next();
                    break;
                case 2:
                    System.out.println("Ingrese los apellidos del contacto: ");
                    lastname = sc.next();
                    break;
                case 3:
                    System.out.println("Ingresa el numero de telefono del contacto: ");
                    telefono = sc.nextLong();
                    break;
                default:
                    System.out.println("Ingreses una opcion valida........... (1 - 4)");
                    return;
            }

        }
    }
}