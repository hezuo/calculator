package com.ingeniadev.app.calculator;


public class Calculator implements CalculatorInterface{
    @Override
    public Long sumarDosEnteros(Long param1, Long param2) {
        Long resultado = new Long(0);
        if ( validarParametros(param1, param2)){
            resultado = param1 + param2;
        }

        return resultado;
    }

    protected boolean validarParametros(Long param1, Long param2){
        return ( param1 !=null && param2 != null && ( ( param1 + param2) > 0 ));
    }
}
