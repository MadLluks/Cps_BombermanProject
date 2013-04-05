package test;

import implementation.TerrainBugs;

import org.junit.Before;

import contract.TerrainContract;

public class TerrainTest2 extends TerrainAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setTerrain(new TerrainContract(new TerrainBugs()));
	}

}
