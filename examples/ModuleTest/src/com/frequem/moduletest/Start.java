package com.frequem.moduletest;

import com.frequem.modulelib.*;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args){
        try{
            ArrayList<ModuleDescriptor> modules = new ArrayList<>();
            for(String s : args){
                modules.addAll(ModuleDescriptor.fromJarPath(s));
            }
            
            for(ModuleDescriptor m : modules){
                MethodDescriptor[] methods = m.getMethodDescriptors();
                FieldDescriptor[] fields = m.getFieldDescriptors();
                
                if(methods != null)
                    for(MethodDescriptor me : methods){
                        System.out.println(me.getName() + " - " + me.getDescription());
                        System.out.println(me.getClassObj().cast(me.invokeMethod(3, 3)));
                    } 
                
                if(fields != null)
                    for(FieldDescriptor f : fields){
                        System.out.println(f.getName() + " - " + f.getDescription());
                        System.out.println(f.getClassObj().cast(f.getFieldValue()));
                    }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
