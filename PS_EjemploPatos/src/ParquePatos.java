
public class ParquePatos {

	public static void main(String[] args) {
		//Patos Basicos
		PatoGoma goma = new PatoGoma();
		PatoMergo mergo = new PatoMergo();
		//Behaviours
		NoVolar noVolar = new NoVolar();
		NoGraznar noGraznar = new NoGraznar();
		//Ejecucion del Parque
		System.out.println("\nParque Patos\n");
		System.out.println(goma.dibujar());
		System.out.println(goma.realizarVuelo());
		System.out.println(goma.realizarGraznido());
		System.out.println(mergo.dibujar());
		System.out.println(mergo.realizarVuelo());
		System.out.println(mergo.realizarGraznido());
		//Si el mergo se estrella
		System.out.println("El mergo se estrella y deja de volar");
		mergo.setComportamientoVuelo(noVolar);
		System.out.println(mergo.realizarVuelo());
		
	}
}
