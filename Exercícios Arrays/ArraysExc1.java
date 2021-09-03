package Familia3201;

import java.util.Scanner;

public class ArraysExc4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int A[] = {1,0,5,-2,-5,7};
		int soma=0,valor=100;
		
		
		for(int x=0;x<6;x++)
		{
			soma = A[0] + A[1] + A[5];
			A[4] = valor;
			System.out.println("\nA soma é: "+soma);
		}	
		for(int i = 0; i < 6; i++) {
			System.out.println("O valor na posição [" + i + "] é: " + A [i]);
		}

		}
	}


