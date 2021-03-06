package com.gruber.pfr.space.numbers.rational;

import com.gruber.pfr.space.AutoOperation;
import com.gruber.pfr.space.Set;

public class RationalMultiplication extends AutoOperation {

//	protected RationalMultiplication() {
//		
//		super(RationalNumber.class);
//	}
//	
	public Set operate(Set op1, Set op2) throws OperantException {
		
		RationalNumber c1 = null;
		RationalNumber c2 = null;
		try{
			c1 = (RationalNumber)op1;
			c2 = (RationalNumber)op2;
			return new RationalNumber(c1.base * c2.base);
		} catch(Exception e) {
			
			if(c1 == null)
				throw new OperantException(op1);
			else
				throw new OperantException(op2);
		}
	}
}
