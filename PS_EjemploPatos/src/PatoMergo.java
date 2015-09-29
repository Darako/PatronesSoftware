
public class PatoMergo extends Pato{
	
	public PatoMergo(){
		super(new VolarAlto(), new GraznarAlto());
	}
	public PatoMergo(IVuelo comportamientoVolar, IGraznido comportamientoGraznar){
		super(comportamientoVolar, comportamientoGraznar);
	}
	@Override
	public String dibujar(){
		return "-Soy un pato mergo";
	}
}
