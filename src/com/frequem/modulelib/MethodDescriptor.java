/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frequem.modulelib;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class MethodDescriptor extends FeatureDescriptor{
    private Reference<Method> methodReference;
    private ParameterDescriptor[] params;
    
    public MethodDescriptor(Method method){
        this(method, ParameterDescriptor.fromClasses(method.getParameterTypes()));
    }    
    public MethodDescriptor(Method method, ParameterDescriptor[] params){
        this.setClassObj(method.getClass());
        this.methodReference = method == null ? null : new WeakReference(method);
        this.params = params;
    }
    
    public ParameterDescriptor[] getParameterDescriptors(){
        return this.params;
    }
    
    public Method getMethod(){
        return this.methodReference == null ? null : this.methodReference.get();
    }
    
    public Object invokeMethod(Object... args){
        try {
            Method m = this.getMethod();
            if(m != null)
                return m.invoke(m.getName(), args);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
