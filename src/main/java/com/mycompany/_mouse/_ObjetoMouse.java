
package com.mycompany._mouse;

import java.util.Scanner;

/**
 *
 * @author Alexsandre
 */
public class _ObjetoMouse {
    String marca;
    String cor;
    boolean usb;
    
    void estado(){
       
        System.out.println("Sua marca é: "+ this.marca);
        System.out.println("Sua cor é: "+ this.cor);
        System.out.println("Está conectado? "+ (this.usb? "sim" : "não"));
    }
    
    boolean perguntaUsb(){
        Scanner tecladoString = new Scanner(System.in);
        System.out.println("O usb do mouse está conectado?");
        String resposta = tecladoString.nextLine().toLowerCase();
        
        if(resposta.equals("sim")){
            return true;
            
        }else if(resposta.equals("não") || resposta.equals("nao")){
            return false;
            
        }else{
            
            return perguntaUsb();
            
        }
        
        
        
        
    }
    
    void clicar(){
        if(this.usb == true){
            System.out.println("Você pode clicar a vontade");
            
        }else{
            
            System.out.println("Conecte o mouse no computador para conseguir clicar");
        }
        
    }
    
    
}
