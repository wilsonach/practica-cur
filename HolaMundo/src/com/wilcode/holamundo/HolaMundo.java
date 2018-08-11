package com.wilcode.holamundo;




//Uper Camel Case nombre de clase

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo:)");

		//Enteros
		byte edad = 2;
		short year = 2020;
		int id_User = 1001;
		long id_twitter = 126554738902L;//para long se debe agregar l al final para que el compilador lo acepte
		
		//Punto Flotante
		float diametro = 34.25f;// para que el compilador lo acepete se coloca la f al final
		double precio = 123474.64758593739;
		
		//Texto
		char genero = 'F';		
		
		
		//Logico
		boolean isvible = true;
		boolean funciona = false;
		
		//Constantes
		int VALOR =0;
		int VALOR_MAXIO = 1;
		
		//Lower Camel Case nombre de metodos y declaracion de variables
		int minValor = 4;
		
		int i = 1;
		double d = 2.5;
		i= (int) d;
		
		int codigo = 97;
		char codigoASCII = (char) codigo;// casteo
		
		
		//Arrays
		//Declaracion de array
		
		//arreglo de 1 dimension
		
		int[] arregloInt = new int[3];
		double arregloDouble[];
		
		
		//arreglo de 2 dimensiones
		int[][] array2D = new int[2][3];// le caben 6 cupcakes
		
		//arrego de tres dimensiones
		int[][][] array3D = new int[1][2][3]; //caben 18 cookies
		
		//arrays con texto
		
		char[][] days = {{'M', 'T', 'W'},{'M', 'T', 'W'}};
		
		
		char[] names = new char[4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		 
		char [][][][] monkey = new char [2][3][2][2]; 
		monkey[1][0][0][1] = 'm';
		System.out.println(monkey[1][0][0][1]);
		
		//Operadores Ariteticos
		int a = 1;
		int aa = a+a;
		System.out.println("el valor de aa: "+ aa);
		
		double x = 2.56;
		int y = 9;
		
		float w = (float)x +y;
		System.out.println(w*2);
		
		double k =4/0.00002;
		//System.out.println(k);
		
		//System.out.println(7%2);
		
		
		int f = 2;
		int g = 3;
		//f = f + g;
		f+= g;
		System.out.println(f);
		
		
		int l = 3;
		l++;
		System.out.println(l);
		
		//1. Incrementar el valor l+1
		//2 Asignar el valor a l
		
		int p = 5;
		int q = 6;
		System.out.println(p == q);
		
		
		//Operadores relacionales
		System.out.println("q > p ->" + (q > p));
		System.out.println("q < p ->" + (q < p));
		
		System.out.println("q >= p ->" + (q >= p));
		System.out.println("q <= p ->" + (q <= p));
		
		//Operadores lógicos
		boolean n = false;
		boolean m = true;
		
		System.out.println("n && m ->" + (n && m)) ;
		System.out.println("n || m ->" + (n || m)) ;
		System.out.println("!n -> m " + (!n)) ;
		System.out.println("!m -> " + (!m)) ;
		
		//Control del flujo
		//If/else
		
		if (q > p) {
			//true
			System.out.println("si es mayor");
		}else if(q== p){
			System.out.println("Es igual");
		} else {
			
			System.out.println("No es mayor, y no es igual");
		}
		
		//Switch
		int mes = 8;
		
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("no existe un mes");
			break;
		}
		
		
		
		//Bucle While 
		int e = 1;
		while (e <= 5) {
			System.out.println("e es menor o igual que 5");
			e++;
		}
		
		
			System.out.println();
			int[] numeros = new int[5];
		for(int c = 0; c < 5; c++) {
			numeros[c] = c;
			
			System.out.println("numeros ["+c+"]:" + numeros[c]);
		}
		
			for (int j : numeros) {
				System.out.println(j);
				
			}
		
		System.out.println("continuamos con el flujo");
		
		
		
		
		
		//System.out.println(codigoASCII);
	
		
		
	}

}

