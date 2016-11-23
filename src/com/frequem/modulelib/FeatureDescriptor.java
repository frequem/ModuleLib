package com.frequem.modulelib;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class FeatureDescriptor {
    private Reference<Class> classReference;
    private String name;
    private String description;
    
    public FeatureDescriptor(){
    }
    
    public FeatureDescriptor(String name){
        this.setName(name);
    }
    
    public final void setClassObj(Class c){
        this.classReference = c == null ? null : new WeakReference(c);
    }
    
    public final Class getClassObj(){
        return this.classReference == null ? null : this.classReference.get();
    }
    
    public final void setName(String name){
        this.name = name;
    }
    
    public final String getName(){
        return this.name;
    }
    
    
    public final void setDescription(String description){
        this.description = description;
    }
    
    public final String getDescription(){
        if(this.description == null)
            return this.getName();
        return this.description;
    }
    
}
