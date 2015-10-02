package polimorfismoAbstraccion;
import polimorfismoAbstraccion.*;

public class Futbolista extends Seleccionfutbol {

	   private int dorsal;
	   private String demarcacion;

	   
	   public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
			super(id, nombre, apellidos, edad);
			this.dorsal = dorsal;
			this.demarcacion = demarcacion;
		}
	   
	   // constructor, getter y setter
	   

	   public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	   public void partidoFutbol() {
	      System.out.println("Juega un Partido (Clase Futbolista)");
	   }

	   public void entrevista() {
	      System.out.println("Da una Entrevista");
	   }

}
