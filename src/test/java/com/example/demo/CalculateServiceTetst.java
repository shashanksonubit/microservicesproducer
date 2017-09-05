package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.service.CalculateService;
import com.example.demo.service.impl.CalculateServiceImpl;
/**
 * 
 * @author shashank
 *
 */
public class CalculateServiceTetst {
	CalculateService calculateServiceImpl;
	@Before
	public void setup(){
		calculateServiceImpl=new CalculateServiceImpl();
	}
	@Test
	public void testadd(){
		assertEquals("error msg",4,calculateServiceImpl.add(3, 2));
	}
	@Test(expected=ArithmeticException.class)
	public void tesDivide(){
		
		assertEquals("error msg",3,calculateServiceImpl.divide(6, 0));
	}
	

}
