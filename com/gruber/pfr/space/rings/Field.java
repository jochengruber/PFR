package com.gruber.pfr.space.rings;

import com.gruber.pfr.space.AutoOperation;

public abstract class Field extends Ring {

	protected Field(AutoOperation addition, AutoOperation multiplication) {
		super(addition, multiplication);
	}
}
