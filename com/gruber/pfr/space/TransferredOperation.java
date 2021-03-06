package com.gruber.pfr.space;

public class TransferredOperation implements Operation {

	Injection map;
	Map map1;
	Map map2;
	Operation op;

	public TransferredOperation(Map operant1Map, Map operant2Map, Injection rangeMap, Operation op) {
		
		this.map1 = operant1Map;
		this.map2 = operant2Map;
		this.map = rangeMap;
		this.op = op;
	}

	public Set getFirstOperantDomain() {
		
		return map1.getDomain();
	}

	public Set getSecondOperantDomain() {
		
		return map2.getDomain();
	}

	public Set operate(Set op1, Set op2) throws OperantException {

		if(!map1.getDomain().isElement(op1))
			throw new OperantException(op1);
		
		if(!map2.getDomain().isElement(op2))
			throw new OperantException(op2);
		
		return map.getPreImage(this.op.operate(map1.getImage(op1), map2.getImage(op2)));
	}

	public Set getOperationRange() {

		return map.getDomain();
	}
}
