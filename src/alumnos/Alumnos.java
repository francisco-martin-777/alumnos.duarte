package alumnos;
import alumno.Alumno;
import java.util.Scanner;
/**
 * 
 * @author duarte_martin
 * version 1.0
 */

public class Alumnos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    Alumno[] lstAlumnos = new Alumno[5];
    
    

    String nombreIntroducido;
    double notaIntroducida;

      System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        IntroduceNotas(lstAlumnos, entrada);
    
    
  
    double  sumaDeMedias = 0;
  
    System.out.println("Los datos introducidos son los siguientes:");

    
        sumaDeMedias = MuestraResultados(lstAlumnos, sumaDeMedias); 
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  
  }

    private static double MuestraResultados(Alumno[] lstAlumnos, double sumaDeMedias) {
        for(int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + lstAlumnos[i].getNombre());
            System.out.println("Nota media: " + lstAlumnos[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias += lstAlumnos[i].getNotaMedia();
        }   return sumaDeMedias;
    }

    private static void IntroduceNotas(Alumno[] lstAlumnos, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;
        for (int i = 0; i < 5; i++) {
            
            lstAlumnos[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            //(alum[i]).nombre = nombreIntroducido;
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            //alum[i].notaMedia = notaIntroducida;
            
            lstAlumnos[i].AsignarNota(nombreIntroducido, notaIntroducida, 10);
            
        }
    }
}

