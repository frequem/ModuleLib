/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frequem.modulelib;

/**
 *
 * @author user
 */
public class ParameterDescriptor extends FeatureDescriptor{
    public ParameterDescriptor(Class c){
        this.setClassObj(c);
    }
    
    public static ParameterDescriptor[] fromClasses(Class<?>[] classes){
        ParameterDescriptor[] params = new ParameterDescriptor[classes.length];
        for(int i = 0; i < classes.length; i++)
            params[i] = new ParameterDescriptor(classes[i]);
        return params;
    }
}
