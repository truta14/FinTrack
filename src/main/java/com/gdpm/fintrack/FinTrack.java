/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gdpm.fintrack;

import App.Database;
import Controller.MainController;
import java.net.URISyntaxException;
/**
 *
 * @author gdpm
 */
public class FinTrack {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        MainController mc = new MainController();
        
        String teste1 = "MainController.java";
        String teste2 = "ControllerInterface.java";
        
        teste1 = teste1.substring(0, (teste1.length() - 5));
        teste2 = teste2.substring(0, (teste2.length() - 5));
        
        //System.out.println("Teste1: \n"+teste1+"\n Teste2: \n"+teste2);
        
        //System.out.println("Teste1 contains? \n"+(teste1.contains("Manin"))+"\nTeste2 contains? \n"+(teste2.contains("Interface")));
        
        mc.callRoute("teste");
        
    }
}
