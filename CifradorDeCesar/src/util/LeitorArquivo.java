/**
 * 
 */
package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Gabriel Klockner
 */
public class LeitorArquivo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o nome do arquivo de texto:\n");
		String nome = ler.nextLine();
		
		System.out.println("Conte�do do arquivo:\n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			
			String linha = lerArq.readLine();
			
			while (linha != null) {
				System.out.printf("%s \n", linha);
				
				linha = lerArq.readLine();
			}
			
			arq.close();
			ler.close();
		} catch (IOException e) {
			System.err.printf("Erro ao abrir arquivo: %s. \n", e.getMessage());
		}
		
		System.out.println();
	}
}
