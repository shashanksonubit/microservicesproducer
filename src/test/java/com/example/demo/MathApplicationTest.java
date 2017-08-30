package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.demo.controller.MathApplication;
import com.example.demo.service.CalculatorService;

public class MathApplicationTest extends EmployeeProducerApplicationTests {

	@Mock
	CalculatorService calculatorService;
	@InjectMocks
	MathApplication mathApplication ;

	@Test(expected = RuntimeException.class)
	public void testAdd() {
		//when(calculatorService.add(2, 3)).thenReturn(5);
		doThrow(new RuntimeException("Add operation not implemented")).when(calculatorService).add(2, 3);
		assertEquals(5, mathApplication.add(2, 3));
		verify(calculatorService).add(2, 3);
	}
}
