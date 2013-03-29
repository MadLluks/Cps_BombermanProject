package test;

import implementation.TerrainBugs;

import org.junit.Before;

public class TerrainTest1 extends TerrainAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		setTerrain(new TerrainBugs());
	}

}
