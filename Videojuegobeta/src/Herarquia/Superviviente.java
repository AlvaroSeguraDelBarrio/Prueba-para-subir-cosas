package Herarquia;

public class Superviviente extends Personajes{
	
	protected boolean repararMotores;
	protected boolean gruñirDolor;
	protected boolean curarse;
	protected boolean saltarVentana, bloaquearPuertas, hacerBarricadas;
	

	public Superviviente(String id, boolean correr, boolean trotar, int velocidad, String tipo, float altura,
			int fuerza, int vida, int inteligencia, boolean repararMotores, boolean gruñirDolor, boolean curarse,
			boolean saltarVentana, boolean bloaquearPuertas, boolean hacerBarricadas) {
		super(id, correr, trotar, velocidad, tipo, altura, fuerza, vida, inteligencia);
		this.repararMotores = repararMotores;
		this.gruñirDolor = gruñirDolor;
		this.curarse = curarse;
		this.saltarVentana = saltarVentana;
		this.bloaquearPuertas = bloaquearPuertas;
		this.hacerBarricadas = hacerBarricadas;
	}
	
	
	
	
	
	public void existir() {
	}
	
	
	

}
