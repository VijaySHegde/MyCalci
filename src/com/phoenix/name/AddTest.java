package com.phoenix.name;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.phoenix.OperatingClass;

class AddTest {

	@Test
	void Addtest() {
		
		OperatingClass junit = new OperatingClass(1,2,"+");
		junit.calc();
		int result = junit.getResult1();
		
		assertEquals(3,result);
		
		OperatingClass junit2 = new OperatingClass(2,1,"-");
		junit2.calc();
		int result1 = junit2.getResult1();
		
		assertEquals(1,result1);
		
		OperatingClass junit3 = new OperatingClass(1,2,"*");
		junit3.calc();
		int result3 = junit3.getResult1();
		
		assertEquals(2,result3);
		
		OperatingClass junit4 = new OperatingClass(2,1,"/");
		junit4.calc();
		double result4 = junit4.getResult2();
		
		assertEquals(2,result4);

}
}
