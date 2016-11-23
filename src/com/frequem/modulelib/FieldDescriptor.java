package com.frequem.modulelib;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class FieldDescriptor extends TypeableFeatureDescriptor{
    private Reference<Field> fieldReference;
    
    public FieldDescriptor(Field field){
        this.setType(field.getType());
        this.fieldReference = field == null ? null : new WeakReference(field);
    }
    
    public Field getField(){
        return this.fieldReference == null ? null : this.fieldReference.get();
    }
    
    public Object getFieldValue(){
        try{
            Field f = this.getField();
            if(f != null)
                return f.get(f.getName());
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public void setFieldValue(Object value){
        try{
            Field f = this.getField();
            if(f != null)
                f.set(f.getName(), value);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
