package calcu;

import java.util.Scanner;

public class TpCalculadora {
    
	private Integer a;
	private Integer b;
	private Integer resultado;
	
	public TpCalculadora(Integer a, Integer b) {
		this.a = a;
		this.b = b;
		this.resultado=0;
		
	}
	//Metodo para sumar:
		public Integer sumar(){
			return this.resultado = this.a+this.b;
		}
	
	
	//Metodo para restar:
	public Integer restar(){
		return this.resultado = this.a-this.b;
		
	}
	//Metodo para multiplicar
	public Integer multiplicar(){
		return this.resultado = this.a*this.b;
		
	}
	//Metodo para dividir
	public Integer dividir(){
		return this.resultado = this.a/this.b;
		
	}
	
	
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Integer getResultado() {
		return resultado;
	}
	
	public static void main (String[]args) {
		
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese su operacion /n 1 para dividir /n 2 para multiplicar /n 3 para restar /n 4 para sumar");
			
			opcion = teclado.nextInt();
			
		}while (opcion < 1 && opcion > 4);
			
			System.out.println("Ingrese el primer numero");
		    a=teclado.nextInt();

			System.out.println("Ingrese el segundo numero");
			b=teclado.nextInt();
			
		    TpCalculadora micalcu = new TpCalculadora(a,b);
		
		    switch (opcion){
		
			case (1):
			micalcu.dividir();
			break;
			case (2):
			micalcu.multiplicar();
			break;
			case (3):
			micalcu.restar();
			break;
			case (4):
		    micalcu.sumar();
			break;
		}
			
		System.out.println("El resultado es " + micalcu.getResultado().toString());
	}
}