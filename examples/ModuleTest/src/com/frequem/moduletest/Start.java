/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frequem.moduletest;

import com.frequem.modulelib.*;
import java.util.ArrayList;


/**
 *
 * @author user
 */
public class Start {
    public static void main(String[] args){
        try{
            ArrayList<ModuleDescriptor> modules = new ArrayList<>();
            for(String s : args){
                modules.addAll(ModuleDescriptor.fromJarPath(s));
            }
            
            for(ModuleDescriptor m : modules){
                MethodDescriptor[] methods = m.getMethodDescriptors();

                for(MethodDescriptor me : methods){
                    System.out.println(me.getName() + " - " + me.getDescription());
                    System.out.println((int)me.invokeMethod(3, 3));
                }     
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
