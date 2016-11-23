package com.frequem.modulelib.modules.basiccalc;

import com.frequem.modulelib.*;

public class BasicCalcModuleDescriptor extends ModuleDescriptor{

    private final static int METHOD_ADD = 0;
    private final static int METHOD_SUBTRACT = 1;
    
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        MethodDescriptor[] methods = new MethodDescriptor[2];
        try{
        methods[METHOD_ADD] = new MethodDescriptor(BasicCalcModule.class.getMethod("add", new Class[] {int.class, int.class}));
        methods[METHOD_ADD].setName("Add");
        methods[METHOD_ADD].setDescription("Adds two ints");
        
        methods[METHOD_SUBTRACT] = new MethodDescriptor(BasicCalcModule.class.getMethod("sub", new Class[] {int.class, int.class}));
        methods[METHOD_SUBTRACT].setName("Subtract");
        methods[METHOD_SUBTRACT].setDescription("Substracts two ints");
        
        }catch(Exception ex){}
        return methods;
    }

    @Override
    public FieldDescriptor[] getFieldDescriptors() {
        return null;
    }
    
}
