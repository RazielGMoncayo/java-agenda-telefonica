import com.generation.ejercicio.informacion.Agenda;
import com.generation.ejercicio.informacion.Contacto;

import java.lang.invoke.SwitchPoint;
import java.lang.runtime.SwitchBootstraps;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu;
        boolean programa = true;
        Scanner sc = new Scanner(System.in);
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
            agenda.listarContactos();
        }else{
            numContactos = 10;
            Agenda agenda = new Agenda(10);
        }

        while(programa){

            int maxContactos = numContactos;
            
            System.out.println("Agendix                          (5 / 20)");
            System.out.println("\n");
            System.out.println("1) Listar contactos");
            System.out.println("2) Agregar contacto");
            System.out.println("3) Eliminar contacto");
            System.out.println("4) Modificar contacto");
            System.out.println("5) Salir");

            menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Listar contactos");
                    break;
                case 2:
                    System.out.println("Agregar contacto");
                    break;
                case 3:
                    System.out.println("Eliminar contacto");
                    break;
                case 4:
                    System.out.println("Modificar contacto");
                    break;
                default:
                    programa = false;
            }

        }
    }
}