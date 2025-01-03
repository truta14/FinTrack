/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Views.ViewInterface;
import java.lang.reflect.InvocationTargetException;

import App.*;

/**
 *
 * @author gdpm
 */
public class MainController {
    protected String title;
    private App app;
    public MainController() {
        StackTraceElement[] stackTree = Thread.currentThread().getStackTrace();
        
        String className = stackTree[2].getClassName();
        String methodName = stackTree[2].getMethodName();
        
        System.out.println("Class name: \n - Class: "+className + "\n - Method name: "+methodName);
        System.out.println("MainController constructor called");
        app = App.getInstance();
    }

    protected void loadView(String viewName) {
        try {
            String classFullName = "Views." + viewName + "View";
            Class<?> view = Class.forName(classFullName);
            Object instance = (ViewInterface) view.getDeclaredConstructor().newInstance();
            app.loadPage(instance, classFullName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
