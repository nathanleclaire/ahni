package com.anji.nn.activationfunction;

/**
 * Square-root function.
 * 
 * @author Oliver Coleman
 */
public class PowerActivationFunction implements ActivationFunction, ActivationFunctionNonIntegrating {
	/**
	 * identifying string
	 */
	public final static String NAME = "power";

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return NAME;
	}

	/**
	 * This class should only be accessd via ActivationFunctionFactory.
	 */
	PowerActivationFunction() {
		// no-op
	}

	/**
	 * Not used, returns 0.
	 */
	@Override
	public double apply(double input) {
		return 0;
	}

	/**
	 * Return first input raised to the power of the absolute value of the second input (or just first input if no second input).
	 */
	@Override
	public double apply(double[] input, double bias) {
		if (input.length < 2)
			return input[0];
		double v = Math.pow(input[0], Math.abs(input[1]));
		return Double.isNaN(v) ? 0 : v;
	}

	/**
	 * @see com.anji.nn.activationfunction.ActivationFunction#getMaxValue()
	 */
	public double getMaxValue() {
		return Double.MAX_VALUE;
	}

	/**
	 * @see com.anji.nn.activationfunction.ActivationFunction#getMinValue()
	 */
	public double getMinValue() {
		return -Double.MAX_VALUE;
	}

	/**
	 * @see com.anji.nn.activationfunction.ActivationFunction#cost()
	 */
	public long cost() {
		return 75;
	}
}
