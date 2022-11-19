// Uniersidad del Valle de Guatemala
// Paolo Antonio Consuegra Castillo
// 221097
// 18 de nomviembre 2022
// Laboratorio Sustituto

import java.util.Scanner;

public class InterfazEmpresa {

    public static void main(String[] args) {

        //Crear instancia de ControlEmpresa y leer bases de datos
        ControlEmpresa control = new ControlEmpresa();

        /*Lectura csv */
        control.generarLista("trabajadoresC.csv");

        Scanner teclado = new Scanner(System.in);
        /*Menus guardados evariables */
        String menu = "1. Buscar Trabajadores\n2. Comprobar competencias\n3. Salir\n";
        String proyectos = "1. Investigativo\n 2. Nuevo cliente\n 3. Mantenimiento\n4.Interno ";

        int opcion = 1;
        System.out.println(menu);
        try {
        System.out.println("Ingrese la opción que desea: ");
        opcion = teclado.nextInt();
        teclado.nextLine();  
        } 
        catch (Exception e) {
            teclado.next();
            System.out.println("Entrada incorrecta");
            System.out.println(menu);
            System.out.println( "SE INGRESARA A LA PRIMERA OPCION\n");
            opcion = 1;        
        }
        while (opcion<3 && opcion>=0){
            switch (opcion) {
                case 1:
                    /*Buscar Trabajadores */
                    System.out.println(control.elegirTrabajadores());
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();  
            
                    break;
                case 2:
                    /*Comprobacion de competencias */
                    System.out.println(proyectos);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();  
                    System.out.println(control.comprobarCompetencias(opcion));

                    /*Menu */
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();  
                break;
            }



        }
        System.out.println("Feliz dia");

        
        
    }
    
}
