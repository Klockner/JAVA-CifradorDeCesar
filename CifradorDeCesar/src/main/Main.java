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
        cifrador.descobrirCifra(mensagem);
        
        cifrador.imprimirListaReferencia();
        cifrador.imprimirListaTextoFechado();
        
        cifrador.fazMatch();
        
//        String mensagemCifrada = cifrador.cifra(mensagem, 1, false);
//        cifrador.decifra(mensagemCifrada, 1);
    }
}
