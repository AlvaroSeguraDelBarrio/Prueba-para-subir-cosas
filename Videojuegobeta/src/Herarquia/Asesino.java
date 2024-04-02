package Herarquia;

import java.util.Scanner;

public class Asesino extends Personajes{
	
	Scanner Teclado = new Scanner(System.in);
	private boolean SuperSalto;
	private boolean SuperFuerza;
	private boolean rastearSupervivientes;
	private int numeroArmas;
	private boolean sigiloso = false;
	private int numSonido;
	private String sonido;
	private int daño;
	private double distanciaAtaque=1.5;
	private float radioAtaque;
	//private int tiempoSegundos;
	
	/**
	 * @author Alvaro Segura
	 * @param id
	 * @param correr
	 * @param trotar
	 * @param velocidad
	 * @param tipo
	 * @param altura
	 * @param fuerza
	 * @param vida
	 * @param inteligencia
	 * @param superSalto
	 * @param superFuerza
	 * @param rastearSupervivientes
	 * @param numeroArmas
	 * @param sigiloso
	 * @param sonido
	 * @param daño
	 * @param distaciaAtaque
	 * @param radioAtaque
	 * @throws InterruptedException
	 * @retur Devuelve la creación del nuestro asesino
	 */
	
	public Asesino(String id, boolean correr, boolean trotar, int velocidad, 
			String tipo, float altura, int fuerza,
			int vida, int inteligencia, boolean superSalto,
			boolean superFuerza, boolean rastearSupervivientes,
			int numeroArmas, boolean sigiloso, String sonido, 
			int daño, float distaciaAtaque, float radioAtaque) 
		throws InterruptedException {
		super(id, correr, trotar, velocidad, tipo, altura, fuerza, vida, inteligencia);
		SuperSalto = superSalto;
			if(SuperSalto = true) {
				System.out.println("El asesino realizará un salto e impactara haciendo muchisimo daño");
				daño = 200;
				radioAtaque = 5.10f /*En metros*/;;
			}
		SuperFuerza = superFuerza;
			if(superFuerza=true) {
				daño = 200;
				cuentaAtras();	
			}
		this.rastearSupervivientes = rastearSupervivientes;
		this.numeroArmas = numeroArmas;
		this.sigiloso = sigiloso;
		this.sonido = sonido;
	}
	
	/**
	 * @author Alvaro Segura
	 * Nos permite generar un contador de dos minutos que es el tiempo
	 * donde el asesino puede usar la superfuerza
	 * @throws InterruptedException
	 * @version 1.0.0
	 */
	
	protected void cuentaAtras() throws InterruptedException {
		int horas = 0, minutos = 2, segundos = 0;
		while(!(horas==0 && minutos==0 && segundos==0)) {
			if(horas <10) {
				System.out.println("0"+horas);
			}else {
				System.out.println(horas);
			}
			System.out.println(":");
			if(minutos <10) {
				System.out.println("0"+minutos);
			}else {
				System.out.println(minutos);
			}
			System.out.println(":");
			if(segundos <10) {
				System.out.println("0"+segundos);
			}else {
				System.out.println(segundos);
			}
			System.out.println("");
			if(segundos==0) {
				if(minutos==0) {
					horas--;
					minutos=59;
					segundos=59;
				}else if(minutos !=0){
					minutos--;
					segundos=59;
				}		
			}else {
				segundos--;
			}
			Thread.sleep(1000);
		}
		this.SuperFuerza=false;
	}
	
	
	public void ejecucuiones() {
		int option = 0;
		
		if (vida!=0) {
			
		switch(option) {
			case 0:
				System.out.println("El asesino agarra al sueperviviente y lo mata con su arma numero 1");
			break;
			case 1:
				if(this.getNumeroArmas()==0) {
					System.out.println("El asesino agarrara con sus manos al superviviente y lo decapitará");					
				}else if(this.getNumeroArmas()!=0) {
					System.out.println("El asesino matará al superviviente con su segunda arma");
				}
			break;
			case 2:
				if(this.getNumeroArmas()==0) {
					System.out.println("El asesino agarrara con sus manos al superviviente y lo desmiembra");					
				}else if(this.getNumeroArmas()!=0) {
					System.out.println("El asesino matará al superviviente con su tercera arma");
				}
			break;
			case 3:
				System.out.println("El asesino usará una forma ingeniosa de matar con lo que haya en el entorno");
			break;				
		}	
		}else if (vida==1) {
			System.out.println("El personaje camina aturdido y empieza a convulsionar");
		} else if(vida==0){
			System.out.println("el superviviente muere *Salta Animacion de morir*");
		}
	}
	
	public void existir() {
	}



	protected boolean isSuperSalto() {
		return SuperSalto;
	}



	protected void setSuperSalto(boolean superSalto) {
		SuperSalto = superSalto;
	}



	protected boolean isSuperFuerza() {
		return SuperFuerza;
	}



	protected void setSuperFuerza(boolean superFuerza) {
		SuperFuerza = superFuerza;
	}



	protected boolean isRastearSupervivientes() {
		return rastearSupervivientes;
	}



	protected void setRastearSupervivientes(boolean rastearSupervivientes) {
		this.rastearSupervivientes = rastearSupervivientes;
	}



	protected int getNumeroArmas() {
		return numeroArmas;
	}



	protected void setNumeroArmas(int numeroArmas) {
		this.numeroArmas = numeroArmas;
	}



	protected boolean isSigiloso() {
		return sigiloso;
	}



	protected void setSigiloso(boolean sigiloso) {
		this.sigiloso = sigiloso;
	}



	protected int getNumSonido() {
		return numSonido;
	}



	protected void setNumSonido(int numSonido) {
		this.numSonido = numSonido;
	}



	protected String getSonido() {
		return sonido;
	}



	protected void setSonido(String sonido) {
		this.sonido = sonido;
	}



	protected int getDaño() {
		return daño;
	}



	protected void setDaño(int daño) {
		this.daño = daño;
	}



	protected double getDistanciaAtaque() {
		return distanciaAtaque;
	}



	protected void setDistanciaAtaque(double distanciaAtaque) {
		this.distanciaAtaque = distanciaAtaque;
	}



	protected float getRadioAtaque() {
		return radioAtaque;
	}



	protected void setRadioAtaque(float radioAtaque) {
		this.radioAtaque = radioAtaque;
	}
	

}
