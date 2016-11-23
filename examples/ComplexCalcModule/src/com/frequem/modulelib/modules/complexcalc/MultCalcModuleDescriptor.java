package com.frequem.modulelib.modules.complexcalc;

import com.frequem.modulelib.*;

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
