package com.frequem.modulelib.modules.complexcalc;

import com.frequem.modulelib.Module;
import static com.frequem.modulelib.modules.basiccalc.BasicCalcModule.add;

public class MultCalcModule extends Module{
    public static int mult(int a, int b){
        int out = 0;
        for(int i = 0; i < b; i++){
            out = add(out, a);
        }
        return out;
    }
}
