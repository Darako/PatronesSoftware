
public class PatoGoma extends Pato{	

	public PatoGoma(){
		super(new NoVolar(), new NoGraznar());
	}
	public PatoGoma(IVuelo comportamientoVolar, IGraznido comportamientoGraznar){
		super(comportamientoVolar, comportamientoGraznar);
	}
	@Override
	public String dibujar(){
		return "-Soy un pato de goma";
	}
}
