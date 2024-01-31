/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo_java.mavenproject1;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Fernando
 */
public interface Metodos {
    
    void verificar(String letra, String cat, JLabel JPalavra, JTextArea jLetraUtilizada, JTextArea jImage);
    void jogar(char ch, String cat, JLabel jPalavra, JTextArea jImage);
    boolean verificar(char[] letras_confirmadas);  
    public abstract void Avaliar();
    
}
