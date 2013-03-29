package test;

import implementation.Terrain;

import org.junit.Before;

public class TerrainTest2 extends TerrainAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		setTerrain(new Terrain());
	}

}
