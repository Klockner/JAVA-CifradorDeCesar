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

    public String lerArquivo() {
        Scanner ler = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Informe o nome do arquivo de texto:");
        String nome = ler.nextLine();

        System.out.println("CONTEUDO DO ARQUIVO:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while (linha != null) {
                sb.append(linha).append("\n");

                linha = lerArq.readLine();
            }
            
            System.out.println(sb.toString());
            
            arq.close();
            ler.close();
        } catch (IOException e) {
            System.err.printf("Erro ao abrir arquivo: %s. \n", e.getMessage());
        }
        
        return sb.toString();
    }
}
