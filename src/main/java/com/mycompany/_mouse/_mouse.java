

package com.mycompany._mouse;

import java.util.Scanner;

/**
 *
 * @author Alexsandre
 *
 * 
 * 
 * 
 * ATRIBUTOS / CARACTERISTICAS
 * Classe / objeto = MOUSE
 * modelo/marca = tecladoString
 * cor = tecladoString
 * Usb conectado? = Boolean
 * 
 * 
 * MÉTODOS
 * conectar usb();
 * SE conectado = está ligado; CASO NAO = está desligado
 * 
 * 
 * 
 * ESTADO = Feedback
 * 
 *
 * 
 * 
 */

public class _mouse {

    public static void main(String[] args) {
        Scanner tecladoString = new Scanner(System.in);
       
        System.out.println("Você tem um mouse?");
      
        String resposta = tecladoString.nextLine().toLowerCase();
     
        
        if(resposta.equals("sim")){
        
        
        
        _ObjetoMouse c1 = new _ObjetoMouse();
       
        System.out.println("Qual a marca do seu mouse?");
        c1.marca = tecladoString.nextLine();
      
        System.out.println("Qual é a cor do seu mouse?");
        c1.cor = tecladoString.nextLine();
        
        boolean respostaUsb = c1.perguntaUsb();
        c1.usb = respostaUsb;
        
      c1.estado();
        
      c1.clicar();
      
        }else if(resposta.equals("não") || resposta.equals("nao")){
            System.out.println("Trate de comprar um");
            
        }else{
            
            System.out.println("Valor inválido tente novament");
        }
        
            
   
        
        
        
        
    }
}
