package calcu;

import java.util.Scanner;

public class TpCalculadora {
    
	private Integer a;
	private Integer b;
	private Integer resultado;
	
	public MiCalculadora(Integer a, Integer b) {
		this.a = a;
		this.b = b;
		this.resultado=0;
	}
	//Metodo para sumar:
		public Integer sumar(){
			return this.resultado = a+b;
		}
	
	
	//Metodo para restar:
	public Integer restar(){
		return this.resultado = a-b;
		
	}
	//Metodo para multiplicar
	public Integer multiplicar(){
		return this.resultado = a*b;
		
	}
	//Metodo para dividir
	public Integer dividir(){
		return this.resultado = a/b;
		
	}
	public static void main (String[]args) {
		
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado=0;
		
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese su operacion /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dvidir");
			
			opcion = teclado.nextInt();
			
		}while (opcion > 1 && opcion > 4);
			
			System.out.println("Ingrese el primer numero");
		    a=teclado.nextInt();

			System.out.println("Ingrese el segundo numero");
			b=teclado.nextInt();
		
		switch (opcion){
			case (4):
			resultado = a + b;
			break;
			case (3):
			resultado = a - b;
			break;
			case (2):
			resultado = a * b;
			break;
			case (1):
			resultado = a / b;
			break;
		}
			
	

			System.out.println("El resultado es " + resultado.toString());
	}
}
