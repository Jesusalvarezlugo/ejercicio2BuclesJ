package Controladores;

import java.util.Scanner;

import Servicios.operativaImplementacion;
import Servicios.operativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		
		operativaInterfaz oi=new operativaImplementacion();
		int numN;
		Scanner sc=new Scanner(System.in);
		
		numN=oi.pedirNumero();
		
		System.out.println("1 2");
			int control;
		for(int i=3;i<=numN;i++) {
			control=0;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					control=1;
					break;
				}
				
			}
			
			if(control==0) {
				
				System.out.println("es primo: "+i);
			}
			
		}
	}

}
