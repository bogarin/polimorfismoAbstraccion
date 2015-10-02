package polimorfismoAbstraccion;

public class Masajista extends Seleccionfutbol {

	   private String titulacion;
	   private int aniosExperiencia;

	   // constructor, getter y setter
		
	   @Override
	   public void entrenamiento() {
	      System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	   }

	   public void darMasaje() {
	      System.out.println("Da un Masaje");
	   }

}
