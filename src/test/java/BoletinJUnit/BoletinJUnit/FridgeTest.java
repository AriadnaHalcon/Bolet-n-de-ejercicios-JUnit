package BoletinJUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FridgeTest {

	private Fridge f;
	
	@BeforeEach
	public void init() {
		f = new Fridge();
	}
	
	@Test
	public void contains() {
		
	}
	
	@AfterEach
	public void finish() {
		Fridge f = null;
	}
}
