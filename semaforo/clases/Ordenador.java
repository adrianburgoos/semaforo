package clases;
import java.util.Random;
/**
 * Recoje todos los datos de las otras clases
 * @author Adrián Burgos
 */
public class Ordenador {
    /**
     * Constructor del ordenador.
     */
    public Ordenador() {}
    /**
     * Método que devuelve un color random para cada estudiante
     * @return Color random
     */
    public String color(){
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
	if(randomInt == 0)
	{  return "rojo";}
	else if(randomInt == 1)
	{ return "amarillo";}
	else
	{ return "verde";}
    }
}
