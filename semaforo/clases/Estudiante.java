package clases;
/**
 * Clase que define a estudiante, esta se extiende a Persona.
 * @author Usuario
 */
public class Estudiante extends Persona{
	// Incluye un metodo de clase que se une a los heredados
	int i_Curso;
        /**
         * Ofrece los datos del estudiante
         */
    	public Estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
        /**
         * Imprime una pequeña presentación del Estudiante.
         */
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
        /**
         * Método para saber el color que quiere el estudiante, para ello pregunta al ordenador.
         * @return Devuelve el color del Estudiante sacado del Ordenador.
         */
	public String preguntacolor(){
		presentarse();
		Ordenador mipc = new Ordenador();
        	return mipc.color();
    	}
}
