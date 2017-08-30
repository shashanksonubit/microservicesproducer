package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.CalculateService;
@Service
public class CalculateServiceImpl implements CalculateService{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int divide(int a, int b) {
		
		return a/b;
	}

}
