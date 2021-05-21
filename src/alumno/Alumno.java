package alumno;

/**
 *
 * @author duarte_martin
 * @version 1.0
 * 
 */
public class Alumno {       //la clase alumno tiene variable nombre como string
  private String nombre;
  private double notaMedia = 0.0;       //variable nota media como double
  
    /**
     *nos devuelve el mombre de los parametros de los metodos
     * @param nombreAlumno     es un nombre de alumno
     * @param notaAsignada      es la nota que se le asigna
     * @param scala             es la variable escala que creamos
     */
    public void AsignarNota(String nombreAlumno, double notaAsignada, int scala) {
        setNombre(nombreAlumno);
        setNotaMedia(notaAsignada);
  }

    /**
     * @return   nos devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre le establecemos el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the notaMedia        con ello obtenemos la nota media
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia  establecemos la nota media
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
