package com.frequem.modulelib;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public abstract class ModuleDescriptor extends FeatureDescriptor{
    public abstract MethodDescriptor[] getMethodDescriptors();
    public abstract FieldDescriptor[] getFieldDescriptors();
    
    public static ArrayList<ModuleDescriptor> fromJarPath(String jarPath){
        ArrayList<ModuleDescriptor> modules = new ArrayList<>();
        try{
            JarFile jar = new JarFile(jarPath);
            
            URL[] urls = {new URL("jar:file:" + jarPath + "!/")};
            URLClassLoader cl = URLClassLoader.newInstance(urls);
            Manifest m = jar.getManifest();
            Attributes attr_main = m.getMainAttributes();
            String module = attr_main.getValue("Module");
            boolean isModule = module == null?false:module.toUpperCase().equals("TRUE");
            Attributes attr_desc = m.getAttributes("Module-Descriptors");
            if(isModule && attr_desc != null){
                for (Map.Entry<Object,Object> entry : attr_desc.entrySet()) {
                    String className = String.valueOf(entry.getValue());
                    JarEntry je = jar.getJarEntry(className.replace(".", "/") + ".class");
                
                    Class c = cl.loadClass(className);
                    if(ModuleDescriptor.class.isAssignableFrom(c)){
                        Object t = c.newInstance();
                        ModuleDescriptor d = (ModuleDescriptor) t;
                        modules.add(d);
                    }
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return modules;
    }
}
