
import com.generation.ejercicio.informacion.Agenda;
import com.generation.ejercicio.informacion.Contacto;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        boolean programa = true;
        int numContactos = 10; // Valor por defecto
        Agenda agenda = null;

        System.out.println("\nBienvenido a Agendrix!! Tu agenda personal\n");
        System.out.println("¿Prefieres configuración personalizada o inicio rápido?");

        while (agenda == null) {
            try {
                System.out.println("Ingresa 1 o 2 seguido de enter");
                System.out.println("1) Personalizar");
                System.out.println("2) Inicio rápido (10 contactos por defecto)");
                menu = sc.nextInt();
                sc.nextLine();

                if (menu == 1) {
                    System.out.println("Ingresa el número de contactos que deseas tener en tu agenda:");
                    numContactos = sc.nextInt();
                    sc.nextLine();
                }
                agenda = new Agenda(numContactos);
            } catch (InputMismatchException e) {
                System.out.println("---Error: debes ingresar un número válido---");
                sc.nextLine();
            }
        }

        while (programa) {
            try {
                int currentContactos = agenda.getContactos().size();
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

                switch (menu) {
                    case 1:
                        System.out.println("Listar contactos");
                        listarContactos(agenda);
                        break;
                    case 2:
                        System.out.println("Agregar contacto");
                        if (currentContactos >= numContactos) {
                            System.out.println("El número máximo de contactos ha sido alcanzado.");
                            System.out.println("Deberás eliminar un contacto para poder agregar un nuevo contacto");
                        } else {
                            agregarContacto(agenda);
                        }
                        break;
                    case 3:
                        System.out.println("Eliminar contacto");
                        eliminarContacto(agenda);
                        break;
                    case 4:
                        System.out.println("Modificar contacto");
                        modificarContacto(agenda);
                        break;
                    case 5:
                        System.out.println("Buscar contacto");
                        buscarContacto(agenda);
                        break;
                    case 6:
                        System.out.println("Hasta luego!!");
                        programa = false;
                        break;
                    default:
                        System.out.println("Ingresa una opción válida (1 - 6)");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("---Error: debes ingresar un número válido---");
                sc.nextLine();
            }
        }
    }

    public static void agregarContacto(Agenda agenda) {
        String nombre;
        String lastname;
        long telefono;

        try {
            System.out.println("Ingresa el nombre del contacto: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese los apellidos del contacto: ");
            lastname = sc.nextLine();
            System.out.println("Ingresa el numero de telefono del contacto: ");
            telefono = sc.nextLong();
            sc.nextLine();
        } catch(Exception e) {
            System.out.println("Error al ingresar los datos del contacto, verifique sus datos e intente nuevamente.");
            return;
        }

        // Validación de nombre y apellido
        if (nombre.isEmpty() || lastname.isEmpty()) {
            System.out.println("Error: El nombre y los apellidos no pueden estar vacíos.");
            System.out.println("Intentalo de nuevo");
            return;
        }

        // Verifición de contacto
        boolean existeContacto = agenda.existeContacto(lastname, nombre);

        if (existeContacto) {
            System.out.println("El contacto " + nombre + " " + lastname + " ya existe en la agenda.\n");
        } else {
            Contacto c = new Contacto(lastname, nombre, telefono);
            agenda.adContacto(c);
            System.out.println("El contacto " + c.getName()+ " " + c.getApellido() + " con numero " + c.getTelefono()+ " ha sido añadido con éxito!!" );
        }
    }

    public static void listarContactos(Agenda agenda){
        ArrayList<Contacto> contactos = agenda.getContactos();

        if (contactos.isEmpty()){
            System.out.println("¡No hay contactos! Tu agenda está vacía\n");
        } else {
            System.out.println( "Listado de contactos: ");
            for(Contacto c : contactos){
                System.out.println(c.getName() + " " + c.getApellido() + " " + c.getTelefono());
            }
        }
    }

    public static void modificarContacto(Agenda agenda){
        long telefono;

        System.out.println( "Ingrese el nombre del contacto a modificar: " );

        String nombre = sc.nextLine();
        System.out.println( "Ingrese los apellidos del contacto a modificar: " );

        String lastname = sc.nextLine();

        Contacto modContact = agenda.buscaContactoNombreApellido(nombre, lastname);

        if(modContact == null){
//            System.out.println("No se encontro el contacto");
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
                agenda.modificarTelefono(modContact, nombre, lastname, telefono);
            }catch(Exception e){
                System.out.println( "Error al modificar el contacto, verifique sus datos e intente nuevamente.");
                return;
            }
            System.out.println("El contacto: ");
            System.out.println(modContact.getName() + " " +  modContact.getApellido()+ " " + modContact.getTelefono());
            System.out.println("ha sido modificado con exito!!");
        }
    }

    public static void eliminarContacto(Agenda agenda) {
        System.out.println("Ingrese el nombre del contacto a eliminar: ");
        String nombre = sc.nextLine().trim();

        System.out.println("Ingrese los apellidos del contacto a eliminar: ");
        String lastname = sc.nextLine().trim();

        Contacto contactoAEliminar = agenda.buscaContacto(nombre, lastname);

        if(contactoAEliminar == null) {
            System.out.println("No se encontró el contacto:");
            System.out.println("- Verifique el nombre y apellido");
            System.out.println("- Confirme que el contacto existe");
            return;
        }

        // Eliminación directa sin confirmación
        if(agenda.eliminarContacto(contactoAEliminar)) {
            System.out.println("Contacto eliminado con éxito:");
            System.out.println(contactoAEliminar.getName() + " " +  contactoAEliminar.getApellido()+ " " +  contactoAEliminar.getTelefono());
        } else {
            System.out.println("Error al eliminar el contacto");
        }
    }

    public static void buscarContacto(Agenda agenda){
        String nombre;
        String lastname;
        long telefono;
        boolean encontrado = false;

        while(encontrado == false){
            System.out.println( "Seleccione una opcion de busqueda: (1 - 3 + Enter)");
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
                        System.out.println("Contacto encontrado: " + contactoEncontrado.getName() + " " +  contactoEncontrado.getApellido()+ " " + contactoEncontrado.getTelefono());
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
                        System.out.println("No existe el contacto\n");
                    }
                    break;
                default:
                    System.out.println("Ingreses una opcion valida........... (1 - 3)");
                    return;
            }


        }
    }
}