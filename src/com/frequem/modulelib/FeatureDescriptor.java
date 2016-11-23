package com.frequem.modulelib;

public abstract class FeatureDescriptor {
    private String name;
    private String description;
    
    public FeatureDescriptor(){
    }
    
    public FeatureDescriptor(String name){
        this.setName(name);
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
