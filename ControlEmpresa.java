import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

// Uniersidad del Valle de Guatemala
// Paolo Antonio Consuegra Castillo
// 221097
// 18 de nomviembre
// Laboratorio Sustituto


public class ControlEmpresa {
    //Atributos
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Trabajador> trabajadoresE;

    //Constructor sin parametros
    public ControlEmpresa() {
         trabajadores = new ArrayList<Trabajador>();
         trabajadoresE = new ArrayList<Trabajador>();
    }



    
    /** 
     * @param archivo
     * Función que lee el archivo csv y llena la lista de trabajadores
     */
    public void generarLista(String archivo){
        String path = archivo;
        String line = "";
        /*Leer archivo */
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                /*Separar los elementos y meterlos a un array */
                String[] a = line.split(",");
                /*Agregarlos a la lista de trabajdores */
                trabajadores.add(new Trabajador(a[0], a[1], Boolean.parseBoolean(a[2]),Boolean.parseBoolean(a[3]),Boolean.parseBoolean(a[4]), Boolean.parseBoolean(a[5]),Boolean.parseBoolean(a[6]), Boolean.parseBoolean(a[7]), Boolean.parseBoolean(a[8]),Boolean.parseBoolean(a[9]),Boolean.parseBoolean(a[10])));         
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        }

    
    /** 
     * @return String
     * Función para elegir 3 trabajadores
     */
    public String elegirTrabajadores(){
        int index1 = 0;
        int i = 0;
        String cadena = "";
        /*El ciclo se repite 3 veces y crea un numero random */
        while (i<3) {
        Random rand = new Random();
        index1 = (int)(rand.nextDouble()*trabajadores.size());
        trabajadoresE.add(trabajadores.get(index1));
        i++;
        cadena = cadena + trabajadores.get(index1).toString();
        }

        return cadena;

    }

    
    /** 
     * @param op
     * @return String
     * Acepta un int para elegir proyecto
     */
    public String comprobarCompetencias(int op){

        switch (op) {
            /*Condiciones para proyecto de investigaciones */
            case 1:
                for (Trabajador trabajador : trabajadoresE) {
                    if (trabajador.getExperiencia()==true && trabajador.getConocimiento()==true && trabajador.getCreatividad()==true) {
                        return "Cumple con las competencias: "+trabajador.toString();   
                    }
                    else{
                        return "No cumple con la condicion";
                    }
                    
                }
                
                break;
                /*Condicionoes para proyecto de nuevo cliente */
            case 2:
            for (Trabajador trabajador : trabajadoresE) {
                if (trabajador.getProfesional()==true && trabajador.getConocimiento()==true && trabajador.getCreatividad()==true) {
                    return "Cumple con las competencias: "+trabajador.toString();     
                }
                else{
                    return "No cumple con la condicion";
                }
                
            }
                
                break;
            case 3:
            /*Proyecto de mantenimiento  */
            for (Trabajador trabajador : trabajadoresE) {
                if (trabajador.getLiderazgo()==true && trabajador.getColaboracion()==true && trabajador.getExperiencia()==true) {
                    return "Cumple con las competencias: "+trabajador.toString();    
                }
                else{
                    return "No cumple con la condicion";
                }
                
            }
                
                break;
                /*Proyecto interno */
            case 4:
            for (Trabajador trabajador : trabajadoresE) {
                if (trabajador.getCompanerismo()==true && trabajador.getBarato()==true && trabajador.getCompleto()==true ) {
                    return "Cumple con las competencias: "+trabajador.toString();    
                }
                else{
                    return "No cumple con la condicion";
                }
                
            }
                
                break;
        }
        return "";
    }



}