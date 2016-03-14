/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrador;

/**
 *
 * @author Gabriel
 */
public class Cifrador {
    
    public String cifra(String mensagem, int chave, boolean isDecifra) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < mensagem.length(); i++) {
            char c = (char) (mensagem.charAt(i) + chave);
            sb.append(c);
        }
        if (isDecifra) {
            System.out.println("\nMENSAGEM DECIFRADA:");
        } else {
            System.out.println("\nMENSAGEM CIFRADA:");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    
    public String decifra(String mensagem, int chave) {
        return cifra(mensagem, -chave, true);
    }
}
