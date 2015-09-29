
public abstract class Pato {

	IVuelo comportamientoVolar;
	IGraznido comportamientoGraznar;
		
	Pato(IVuelo comportamientoVolar, IGraznido comportamientoGraznar){
		this.comportamientoVolar=comportamientoVolar;
		this.comportamientoGraznar=comportamientoGraznar;		
	}
	
	public abstract String dibujar();
	public String nadar(){
		return "Nado";
	}
	public String realizarGraznido(){
		return comportamientoGraznar.graznar();
	}
	public String realizarVuelo(){
		return comportamientoVolar.volar();
	}	
	public void setComportamientoGraznar(IGraznido compGraznar){
		comportamientoGraznar = compGraznar;
	}
	public void setComportamientoVuelo(IVuelo compVolar){
		comportamientoVolar = compVolar;
	}
	
}
