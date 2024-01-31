/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo_java.mavenproject1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Fernando
 */
public class Palavra extends Tela_Forca implements Metodos {
    
    @Override
    public void verificar(String letra, String cat, JLabel jPalavra, JTextArea jLetraUtilizada, JTextArea jImage){   
        
        try{
            if(!letra.matches("^[a-zA-Z]+$")){
                throw new Exception("Letra invalida!");
            }
            else if(letra.length()>1){
                letra = "";
                JOptionPane.showMessageDialog(null, "Não é uma letra!");
            }
            else{
                
                jLetraUtilizada.append(""+letra+" -- "+" ");
       
                char ch =  letra.charAt (0); 

                Metodos forca = new Jogo();
                forca.jogar(ch, cat, jPalavra, jImage);
                
            }
        }catch(Exception e){
            System.out.println(e.toString());
            letra = "";
            JOptionPane.showMessageDialog(null,"Letra invalida!");
        }    
        
    }
    
    @Override
    public boolean verificar(char[] letras_confirmadas){
        
        for (int i = 0; i < letras_confirmadas.length; i++) {
            if (letras_confirmadas[i] == '_') {
                return false;
            }
        }
        return true;     
    }

    public void jogar(char ch, String cat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void jogar(char ch, String cat, JLabel JImage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void jogar(char ch, String cat, JLabel jPalavra, JTextArea jImage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Avaliar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

