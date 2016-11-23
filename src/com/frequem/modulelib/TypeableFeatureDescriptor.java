/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frequem.modulelib;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public abstract class TypeableFeatureDescriptor extends FeatureDescriptor{
    
    private Reference<Class> typeReference;
    
    private static final Map<Type, Type> primitiveMap;
    static {
        Map<Type, Type> map = new HashMap<Type, Type>();
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Character.TYPE, Character.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Float.TYPE, Float.class);
        map.put(Double.TYPE, Double.class);
        map.put(Void.TYPE, Void.class);
        primitiveMap = Collections.unmodifiableMap(map);
    }
    
    public final void setType(Class type){
        this.typeReference = type == null ? null : new WeakReference(primitiveMap.getOrDefault(type, type));
    }
    
    public final Class getType(){
        return this.typeReference == null ? null : this.typeReference.get();
    }
}
