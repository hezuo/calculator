package com.ingeniadev.app;

public class Calculator implements CalculatorInterface{

	public Long sum(Long param1, Long param2){
		Long respuesta = new Long(0);
		if( param1 != null
				&& param2 != null
				&& param1> 0				
				&& param2 > 0){
			respuesta = param1 + param2;	
		}
		
		return respuesta;
	}
}
