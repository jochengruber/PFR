package com.gruber.pfr.space.numbers.natural;

import com.gruber.pfr.space.AutoOperation;
import com.gruber.pfr.space.Set;

public class NaturalMultiplication extends AutoOperation {
	
	public Set operate(Set op1, Set op2) throws OperantException {
		
		NaturalNumber c1 = null;
		NaturalNumber c2 = null;
		try{
			c1 = (NaturalNumber)op1;
			c2 = (NaturalNumber)op2;
			return new NaturalNumber(c1.base * c2.base);
		} catch(Exception e) {
			
			if(c1 == null)
				throw new OperantException(op1);
			else
				throw new OperantException(op2);
		}
	}
}
