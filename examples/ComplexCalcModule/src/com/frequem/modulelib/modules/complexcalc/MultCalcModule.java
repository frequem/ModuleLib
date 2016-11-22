/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frequem.modulelib.modules.complexcalc;

import com.frequem.modulelib.Module;
import static com.frequem.modulelib.modules.basiccalc.BasicCalcModule.add;


/**
 *
 * @author user
 */
public class MultCalcModule extends Module{
    public static int mult(int a, int b){
        int out = 0;
        for(int i = 0; i < b; i++){
            out = add(out, a);
        }
        return out;
    }
}
