package com.gruber.pfr.space.numbers.integer;

import com.gruber.pfr.space.EquivalenceClass;
import com.gruber.pfr.space.EquivalenceRelation;
import com.gruber.pfr.space.Set;

public class ModuloRelation extends EquivalenceRelation {
	
	int length;
	
	public ModuloRelation(int length) {
		this.length = length;
	}

	public EquivalenceClass getEquivalenceClass(Set el) {
		
		int base =((IntegerNumber)el).base;
		return new ModuloClass(length, base);
	}

	public boolean related(Set el1, Set el2) {
		
		ModuloClass cl1 = (ModuloClass)el1;
		ModuloClass cl2 = (ModuloClass)el2;
		
		return ((cl1.intBase - cl2.intBase) % length) == 0;
	}
}
