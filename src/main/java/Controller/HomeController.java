package Controller;

import Views.HomeView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gdpm
 */
public class HomeController extends MainController implements ControllerInterface{
    
    public HomeController(){
        
    }
    
    public void index(){        
        this.loadView("Home");
    } 
    
}
