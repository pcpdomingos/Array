package Familia3201;

import java.util.Scanner;

public class ArraysExc3 {
	public static void main(String[] args) {

	final int linha=3,coluna=3;
	int numeros[][] =  new int[linha][coluna];
	int contmais=0,numero;
	Scanner leia = new Scanner(System.in);

	
	for(int l=0;l<linha;l++)
	{
		
		for(int c=0;c<coluna;c++)
		{	
			System.out.println("\nDigite um numero: ");
			numeros[l][c] = leia.nextInt();
			if(numeros[l][c]>10)
			{
				contmais++;
			}
		}
	}
	System.out.println("\nMaiores que 10: "+contmais);
}
	
	
}
	
