package pl.tkleszczynski.tycho.unittests;

import pl.tkleszczynski.tycho.unittests.api.Calculator;

public class SampleCalculator implements Calculator {

	private final Adder adder;

	public SampleCalculator(Adder adder) {
		this.adder = adder;
	}

	@Override
	public int add(int a, int b) {
		return adder.add(a, b);
	}

}
