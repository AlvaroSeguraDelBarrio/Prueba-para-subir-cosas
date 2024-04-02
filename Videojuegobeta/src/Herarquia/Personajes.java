package Herarquia;

abstract public class Personajes {
	
	protected String id;
	/**
	 * Si correr es true trotar y caminar searn falsos,
	 * si trotar es true correr y caminar seran falsos,
	 * si caminar es true correr y trotar seran falsos,
	 * pero tambien el personaje no puede ni correr ni caminar ni trotar,
	 * entonces consideraremos que el personaje estará quieto, 
	 * haciendo otro tipo de acciones u animaciones.
	 * 
	 */
	protected boolean correr = false;
	protected boolean trotar = false;
	protected boolean caminar = false;
	/**
	 * Este atributo indica Que tipos de Personajes pueden ser. En un futuro,
	 * añadiremos mas tipos, como alienigena, marinos, etc. Lo mas seguro es que 
	 * ampliemos la jerarquia.
	 * @author Alvaro Segura
	 * @version 1.0.0
	 */
	protected String Tipo; //Superviviente o Asesino
	protected int velocidad;
	protected float Altura;
	protected int Fuerza;
	protected int vida;
	protected int inteligencia;
	/**
	 * El constructor nos crea un personaje abtracto el cual no se invoca,
	 * pero nos sirve para dar el molde a los personajes Asesino y masculino.
	 * Dichos parametros iniciales devuelve los siguientes.
	 * @param id
	 * @param correr
	 * @param trotar
	 * @param velocidad
	 * @param tipo
	 * @param altura
	 * @param fuerza
	 * @param inteligencia
	 * @return devuelve el modelo basico de todos los personajes.
	 * 1.0.0
	 */
	
	public Personajes(String id, boolean correr, boolean trotar, int velocidad, String tipo, 
			float altura, int fuerza, int vida, int inteligencia) {
		super();
		this.id = id;
		if (this.correr=true && this.trotar && this.caminar) {
			this.velocidad = velocidad = 10;
		}else if (this.trotar=true && this.correr && this.caminar){
			this.velocidad = velocidad = 5;
		}else if (this.caminar=true && this.correr && this.trotar) {
			this.velocidad = velocidad = 1;
		}
		this.Tipo = tipo;
		this.Altura = altura;
		this.Fuerza = fuerza;
		this.vida = vida;
		this.inteligencia = inteligencia;
	}
	
	protected void morir() {
		if (this.vida==0) {
			System.out.println("Has muerto *Salta Animacion de morir");
		} else if (this.vida==1){
			System.out.println("El personaje camina aturdido y empieza a convulsionar");	
		}
	}
	
	
	protected void ejecuciones() {
		int option = 0;
		switch(option) {
			case 0:
			break;
		
		
		}
	}
	
	
	public abstract void existir();
	
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected boolean isCorrer() {
		return correr;
	}
	protected void setCorrer(boolean correr) {
		this.correr = correr;
	}
	protected boolean isTrotar() {
		return trotar;
	}
	protected void setTrotar(boolean trotar) {
		this.trotar = trotar;
	}
	protected boolean isCaminar() {
		return caminar;
	}
	protected void setCaminar(boolean caminar) {
		this.caminar = caminar;
	}
	protected int getVelocidad() {
		return velocidad;
	}
	protected void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	protected String getTipo() {
		return Tipo;
	}
	protected void setTipo(String tipo) {
		Tipo = tipo;
	}
	protected float getAltura() {
		return Altura;
	}
	protected void setAltura(float altura) {
		Altura = altura;
	}
	protected int getFuerza() {
		return Fuerza;
	}
	protected void setFuerza(int fuerza) {
		Fuerza = fuerza;
	}
	protected int getInteligencia() {
		return inteligencia;
	}
	protected void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	} 
	
	
	
	
	

}
