/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frequem.modulelib.modules.complexcalc;

import com.frequem.modulelib.Module;
import static com.frequem.modulelib.modules.complexcalc.MultCalcModule.mult;

/**
 *
 * @author user
 */
public class PowCalcModule extends Module{
    public static int pow(int a, int b){
        int out = a;
        for(int i = 1; i < b; i++)
            out = mult(out, a);
        return out;
    }
}
