/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import cifrador.Cifrador;
import util.LeitorArquivo;

/**
 *
 * @author Gabriel
 */
public class Main {
    public static void main(String[] args) {
        LeitorArquivo leitorArquivo = new LeitorArquivo();
        String mensagem = leitorArquivo.lerArquivo();
        
        Cifrador cifrador = new Cifrador();
        cifrador.analisarCifra(mensagem);
        
        cifrador.imprimirListaReferencia();
        cifrador.imprimirListaTextoFechado();
        
        int chave = cifrador.encontrarChave();
        
        //False pq não vai usar pra vernan (TEM QUE TER TRUE NOS 2)
        StringBuilder mensagemDecifrada = cifrador.decifraUniversoProfessor(mensagem, chave, true);
        
        //False pra não gerar arquivo pra usar em vernan (TEM QUE TER TRUE NOS 2)
        leitorArquivo.criarArquivo(mensagemDecifrada, true);
        
//        String mensagemCifrada = cifrador.cifra(mensagem, 1, false);
//        cifrador.decifra(mensagemCifrada, chave);
        
    }
}
