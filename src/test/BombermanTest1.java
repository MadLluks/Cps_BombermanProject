package test;

import org.junit.Test;

import contract.BombermanContract;

public class BombermanTest1 extends BombermanAbstractTest {

	@Test
	public void test() {
		super.setBomberman(new BombermanContract(bs));
	}

}
