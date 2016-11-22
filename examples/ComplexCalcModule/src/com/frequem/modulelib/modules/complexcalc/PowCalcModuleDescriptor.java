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
public class PowCalcModuleDescriptor extends ModuleDescriptor{

    private final static int METHOD_POW = 0;
    
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        MethodDescriptor[] methods = new MethodDescriptor[1];
        try{
        methods[METHOD_POW] = new MethodDescriptor(PowCalcModule.class.getMethod("pow", new Class[] {int.class, int.class}));
        methods[METHOD_POW].setName("Power");
        methods[METHOD_POW].setDescription("calculates the given power of an integer");
        
        }catch(Exception ex){}
        return methods;
    }

    @Override
    public FieldDescriptor[] getFieldDescriptors() {
        return null;
    }
    
}
