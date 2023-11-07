package com.competency.demo.util;

import java.util.Arrays;

public class MinMaxList {
	
	public Integer[] minMaxInput;

	public Integer[] getMinMaxInput() {
		return minMaxInput;
	}

	public void setMinMaxInput(Integer[] minMaxInput) {
		this.minMaxInput = minMaxInput;
	}

	@Override
	public String toString() {
		return "MinMaxList [minMaxInput=" + Arrays.toString(minMaxInput) + "]";
	}
	
	

}
