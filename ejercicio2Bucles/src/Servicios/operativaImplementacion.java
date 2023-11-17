package Servicios;

import java.util.Scanner;

public class operativaImplementacion implements operativaInterfaz {

	@Override
	public int pedirNumero() {
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero para calcular los numeros primos: ");
		num=sc.nextInt();
		return num;
	}

}
