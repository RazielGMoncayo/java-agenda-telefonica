
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
        System.out.println("Bienvenido a Agendrix!! Tu agenda personal");
        System.out.println("\n");
        System.out.println("¿Prefieres configuración personalizada o inicio rapido?  (Ingresa 1 o 2 seguido de enter)");

        System.out.println("1) Personalizar");
        System.out.println("2) Inicio rapido (10 contactos por defecto)");

        menu = sc.nextInt();
        sc.nextLine();

        if(menu == 1){
            System.out.println("Ingresa el numero de contactos que deseas tener en tu agenda");
            numContactos= sc.nextInt();
            sc.nextLine();
            Agenda agenda = new Agenda(numContactos);
        }else{
            numContactos = 10;
            Agenda agenda = new Agenda(10);
        }

        Agenda agenda = new Agenda(numContactos);

        while(programa){

            int currentContactos = agenda.getContactos().size();
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
            sc.nextLine();

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
                    if(currentContactos >= numContactos){
                        System.out.println("El numero maximo de contactos fue alcanzado, no puedes agregar mas contactos.");
                        break;
                    }
                    agregarContacto(agenda);
                    break;
                case 3:
                    System.out.println("Eliminar contacto");
                    System.out.println("\n");
                    eliminarContacto(agenda);
                    break;
                case 4:
                    System.out.println("Modificar contacto");
                    System.out.println("\n");
                    modificarContacto(agenda);
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
            nombre = sc.nextLine();
            System.out.println("Ingrese los apellidos del contacto: ");
            lastname = sc.nextLine();
            System.out.println("Ingresa el numero de telefono del contacto: ");
            telefono = sc.nextLong();
            sc.nextLine();
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

    public static void modificarContacto(Agenda agenda){
        long telefono;

        System.out.println( "Ingrese el nombre del contacto a modificar: " );
        System.out.println("\n");
        String nombre = sc.nextLine();
        System.out.println( "Ingrese los apellidos del contacto a modificar: " );
        System.out.println("\n");
        String lastname = sc.nextLine();

        Contacto modContact = agenda.buscaContactoNombreApellido(nombre, lastname);

        if(modContact == null){
            System.out.println("No se encontro el contacto");
            return;
        }else{
            System.out.println("Ingrese el nuevo nombre del contacto: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese los apellidos del contacto: ");
            lastname = sc.nextLine();
            System.out.println("Ingresa el nuevo numero de telefono del contacto: ");
            telefono = sc.nextLong();
            sc.nextLine();

            try{
                agenda.modificarContacto(modContact, nombre, lastname, telefono);
            }catch(Exception e){
                System.out.println( "Error al modificar el contacto, verifique sus datos e intente nuevamente.");
                return;
            }
            System.out.println("El contacto: ");
            System.out.println(modContact.getApellido() + " " + modContact.getName() + " " + modContact.getTelefono());
            System.out.println("ha sido modificado con exito!!");
        }
    }

    public static void eliminarContacto(Agenda agenda){
        String nombre;
        String lastname;

        System.out.println( "Ingrese el nombre del contacto a eliminar: " );
        nombre = sc.nextLine();
        System.out.println( "Ingrese los apellidos del contacto a eliminar: " );
        lastname = sc.nextLine();

        Contacto deletedContacto;
        deletedContacto = agenda.buscaContacto(nombre, lastname);

        if(deletedContacto == null){
            System.out.println("No se encontro el contacto");
            return;
        }

        System.out.println("El contacto: ");
        System.out.println(deletedContacto.getApellido() + " " + deletedContacto.getName() + " " + deletedContacto.getTelefono());
        System.out.println("ha sido eliminado con exito!!");
        agenda.eliminarContacto(deletedContacto);
    }

    public static void buscarContacto(Agenda agenda){
        String nombre;
        String lastname;
        long telefono;
        boolean encontrado = false;

        while(encontrado == false){
            System.out.println( "Seleccione una opcion de busqueda:  (1 - 4 + Enter)");
            System.out.println( "1) Buscar por nombre y apellido" );
            System.out.println( "2) Buscar por telefono" );
            System.out.println( "3) Regresar al menu anterior" );

            int aux = sc.nextInt();
            sc.nextLine();

            if(aux == 3) {
                encontrado = true;
                return;
            }

            switch (aux){
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese los apellidos del contacto: ");
                    lastname = sc.nextLine();
                    Contacto contactoEncontrado = agenda.buscaContactoNombreApellido(nombre, lastname);
                    if(contactoEncontrado != null){
                        System.out.println("Contacto encontrado: " + contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono());
                        return;
                    }else{
                        System.out.println("No existe el contacto");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el numero de telefono del contacto: ");
                    telefono = sc.nextLong();
                    sc.nextLine();
                    Contacto contactoEncontradoNumero = agenda.buscaContactoNumero(telefono);
                    if(contactoEncontradoNumero != null){
                        System.out.println("Contacto encontrado: " + contactoEncontradoNumero.getApellido() + " " + contactoEncontradoNumero.getName() + " " + contactoEncontradoNumero.getTelefono());
                        return;
                    }else{
                        System.out.println("No existe el contacto");
                    }
                    break;
                default:
                    System.out.println("Ingreses una opcion valida........... (1 - 3)");
                    return;
            }


        }
    }
}