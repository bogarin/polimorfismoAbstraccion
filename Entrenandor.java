package polimorfismoAbstraccion;

public class Entrenandor extends Seleccionfutbol {

	   private int idFederacion;

	   // constructor, getter y setter
	   
		
	   @Override
	   public void entrenamiento() {
	      System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	   }

	   public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	   public void partidoFutbol() {
	      System.out.println("Dirige un Partido (Clase Entrenador)");
	   }

	   public void planificarEntrenamiento() {
	      System.out.println("Planificar un Entrenamiento");
	   }

}
