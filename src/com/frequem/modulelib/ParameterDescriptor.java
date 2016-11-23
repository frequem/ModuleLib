package com.frequem.modulelib;

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
