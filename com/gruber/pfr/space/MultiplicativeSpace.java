package com.gruber.pfr.space;

public interface MultiplicativeSpace extends Set {

	public Set getOneElement();
	
	public Set getInverse(Set element);
	
	public Operation getMultiplication();
	
	public Set multiply(Set op1, Set op2);
}
