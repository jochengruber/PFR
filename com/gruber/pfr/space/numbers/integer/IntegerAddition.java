package com.gruber.pfr.space.numbers.integer;

import com.gruber.pfr.space.AutoOperation;
import com.gruber.pfr.space.Set;

public class IntegerAddition extends AutoOperation {

	public Set operate(Set op1, Set op2) throws OperantException {
		
		IntegerNumber c1 = null;
		IntegerNumber c2 = null;
		try{
			c1 = (IntegerNumber)op1;
			c2 = (IntegerNumber)op2;
			return new IntegerNumber(c1.base + c2.base);
		} catch(Exception e) {
			
			if(c1 == null)
				throw new OperantException(op1);
			else
				throw new OperantException(op2);
		}
	}
}
