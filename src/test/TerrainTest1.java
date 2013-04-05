package test;

import implementation.Terrain;

import org.junit.Before;

import contract.TerrainContract;

public class TerrainTest1 extends TerrainAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setTerrain(new TerrainContract(new Terrain()));
	}

}
