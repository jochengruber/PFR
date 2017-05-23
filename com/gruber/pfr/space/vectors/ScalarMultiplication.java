package com.gruber.pfr.space.vectors;

import com.gruber.pfr.space.Operation;
import com.gruber.pfr.space.Set;

public abstract class ScalarMultiplication implements Operation {

	Module base = null;
	
	public void setBase(Module base) {
		this.base = base;
	}

	public Module getBase() {
		return base;
	}

	public Set getFirstOperantDomain() {
		
		return base.getBaseRing();
	}

	public Set getSecondOperantDomain() {

		return base;
	}

	public Set getOperationRange() {

		return base;
	}
}
