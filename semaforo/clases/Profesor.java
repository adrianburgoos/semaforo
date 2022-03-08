package clases;

/**
 * Persona que se encarga de preguntar los colores a los estudiantes
 * @author Usuario
 */
public class Profesor  extends Persona{
    	public Profesor() {}				// Constructor

	// Hace la pregunta al estudiante sobre el color
        /**
         * Pregunta al estudiante que color va a elegir.
         * @return Color que ha elegido el estudiante
         */
    	public String preguntacolor(){

		Estudiante alumno = new Estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
    	}
}
