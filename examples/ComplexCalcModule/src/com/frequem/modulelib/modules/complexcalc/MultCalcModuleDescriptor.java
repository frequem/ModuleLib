/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frequem.modulelib.modules.complexcalc;

import com.frequem.modulelib.*;

/**
 *
 * @author user
 */
public class MultCalcModuleDescriptor extends ModuleDescriptor{

    private final static int METHOD_MULTIPLY = 0;
    
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        MethodDescriptor[] methods = new MethodDescriptor[1];
        try{
        methods[METHOD_MULTIPLY] = new MethodDescriptor(MultCalcModule.class.getMethod("mult", new Class[] {int.class, int.class}));
        methods[METHOD_MULTIPLY].setName("Multiply");
        methods[METHOD_MULTIPLY].setDescription("Multiplies two ints");
        
        }catch(Exception ex){}
        return methods;
    }

    @Override
    public FieldDescriptor[] getFieldDescriptors() {
        return null;
    }
    
}
