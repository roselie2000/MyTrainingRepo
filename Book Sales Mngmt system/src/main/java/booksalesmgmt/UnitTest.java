package booksalesmgmt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnitTest {

	Validator vd = new Validator();
	
	@Test
	public void testName1() {
		assertFalse(vd.checkName(" "));
	}
	
	@Test
	public void testName2() {
		assertEquals(true, vd.checkName("Roselie"));
	}
	
	@Test
	public void testName3() {
		assertFalse(vd.checkName("ty"));
	}
	
	@Test
	public void testName4() {
		assertFalse(vd.checkName(""));
	}
	
	@Test
	public void testUserName1() {
		assertFalse(vd.checkUserName("Roselie", "Roselie"));
	}
	
	@Test
	public void testUserName2() {
		assertTrue(vd.checkUserName("Roselie", "Roselie@2000"));
	}
	
	@Test
	public void testUserName3() {
		assertFalse(vd.checkUserName("Roselie", " "));
	}
	
	@Test
	public void testUserName4() {
		assertFalse(vd.checkUserName("Roselie", ""));
	}
	
	@Test
	public void testUserName5() {
		assertFalse(vd.checkUserName("Roselie", "rt"));
	}
	
	@Test
	public void testPassword1() {
		assertFalse(vd.checkPwd("Roselie@2000", "Roselie@2000"));
	}
	
	@Test
	public void testPassword2() {
		assertTrue(vd.checkPwd("Roselie", "Roselie@2000"));
	}
	
	@Test
	public void testPassword3() {
		assertFalse(vd.checkPwd("Roselie", " "));
	}
	
	@Test
	public void testPassword4() {
		assertFalse(vd.checkPwd("Roselie", ""));
	}
	
	@Test
	public void testPassword5() {
		assertFalse(vd.checkPwd("Roselie", "rt"));
	}
	
	@Test
	public void testEmail1() {
		assertFalse(vd.checkEmail("@gmail.com"));
	}
	
	@Test
	public void testEmail2() {
		assertFalse(vd.checkEmail(" "));
	}
	
	@Test
	public void testEmail3() {
		assertFalse(vd.checkEmail("@gmail.com34567"));
	}
	
	@Test
	public void testEmail4() {
		assertFalse(vd.checkEmail("erty34567@gmail"));
	}
	
	@Test
	public void testEmail5() {
		assertTrue(vd.checkEmail("roselie2000@gmail.com"));
	}
	
	@Test
	public void testEmail6() {
		assertFalse(vd.checkEmail("ere@gmail.com"));
	}
	
	@Test
	public void testDoorno1() {
		assertFalse(vd.checkDoorno(" "));
	}
	
	@Test
	public void testDoorno2() {
		assertTrue(vd.checkDoorno("12A"));
	}
	
	@Test
	public void testAddr1() {
		assertFalse(vd.checkDoorno(" "));
	}
	
	@Test
	public void testAddr2() {
		assertTrue(vd.checkDoorno("Chennai"));
	}
}
