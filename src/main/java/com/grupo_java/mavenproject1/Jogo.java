/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo_java.mavenproject1;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Fernando
 */
public class Jogo extends Palavra implements Metodos{
 
    @Override
    public void jogar(char ch, String cat, JLabel jPalavra, JTextArea jImage){   
        
        if(Jogo.count<5){

            boolean certo = false;
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == ch) {
                    letras_confirmadas[i] = ch;
                    certo = true;
                }
            }
            if (!certo) {
                Jogo.count++; 
                imageForca(Jogo.count, jImage, palavra);
            }
            Metodos verificacao = new Palavra();
            
            String exibir_palavra = String.copyValueOf(letras_confirmadas);
            jPalavra.setText(exibir_palavra);
            
            if (verificacao.verificar(letras_confirmadas)) {
                
                 jImage.append("Parabens, voce ganhou!");
                System.out.println("Parabens, voce ganhou!");
                
            }
        }
        if (Jogo.count == 5) {
            
            jPalavra.setText("A PALAVRA ERA "+palavra);
            System.out.println("Voce perdeu!");
            
        }
    } 
    
    public static void imageForca(int count, JTextArea jImage, String palavra) {

	if (count == 1){
            jImage.append("PALAVRA ERRADA, TENTE NOVAMENTE\n");
            jImage.append("   ____________\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("___|___\n");
	}
	if (count == 2) {
            jImage.setText(null);
            jImage.append("PALAVRA ERRADA, TENTE NOVAMENTE\n");
            jImage.append("   ____________\n");
            jImage.append("   |          _|_\n");
            jImage.append("   |         /   \\\n");
            jImage.append("   |        |     |\n");
            jImage.append("   |         \\_ _/\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("   |\n");
            jImage.append("___|___\n");
	}
	if (count == 3) {
            jImage.setText(null);   
            jImage.append("PALAVRA ERRADA, TENTE NOVAMENTE\n");
            jImage.append("   ____________\n");
            jImage.append("   |          _|_\n");
            jImage.append("   |         /   \\\n");
            jImage.append("   |        |     |\n");
            jImage.append("   |         \\_ _/\n");
            jImage.append("   |           |\n");
            jImage.append("   |           |\n");
            jImage.append("   |\n");
            jImage.append("___|___\n");
	}
	if (count == 4) {
            jImage.setText(null);
            jImage.append("PALAVRA ERRADA, TENTE NOVAMENTE\n");
            jImage.append("   ____________\n");
            jImage.append("   |          _|_\n");
            jImage.append("   |         /   \\\n");
            jImage.append("   |        |     |\n");
            jImage.append("   |         \\_ _/\n");
            jImage.append("   |           |\n");
            jImage.append("   |           |\n");
            jImage.append("   |          / \\ \n");
            jImage.append("___|___      /   \\\n");
	}
	if (count == 5) {
            jImage.setText(null);
            jImage.append("GAME OVER!\n");
            jImage.append("   ____________\n");
            jImage.append("   |          _|_\n");
            jImage.append("   |         /   \\\n");
            jImage.append("   |        |     |\n");
            jImage.append("   |         \\_ _/\n");
            jImage.append("   |          _|_\n");
            jImage.append("   |         / | \\\n");
            jImage.append("   |          / \\ \n");
            jImage.append("___|___      /   \\\n");
            jImage.append("GAME OVER!\n");
            jImage.append("Tente novamente!!");
        }
   }
}

