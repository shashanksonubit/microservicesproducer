package com.example.demo.controller;

import com.example.demo.service.CalculatorService;

public class MathApplication {
	   private CalculatorService calcService;

	   public void setCalculatorService(CalculatorService calcService){
	      this.calcService = calcService;
	   }
	   
	   public int add(int input1, int input2){
	      return calcService.add(input1, input2);
	     
	   }	   
	 
	}