package pl.tkleszczynski.tycho.unittests;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SampleCalculatorTest {

	@InjectMocks
	private SampleCalculator calculator;

	@Mock
	private Adder adder;

	@Test
	public void testAdd() {
		calculator.add(1, 2);
		verify(adder).add(1, 2);
	}

}
