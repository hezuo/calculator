package com.ingeniadev.app.calculator;

public class Calculator implements CalculatorInterface {
    @Override
    public Long sumarDosEnteros(Long param1, Long param2) {
        Long res = new Long(0);
        if( this.validarParametros(param1, param2)){
            Long temp = new Long(param1+param2);
            if( temp > 0){
                res =  temp;
            }
        }

        return res;
    }

    protected boolean validarParametros(Long param1, Long param2){
        return (param1 != null && param2 != null);
    }
}
