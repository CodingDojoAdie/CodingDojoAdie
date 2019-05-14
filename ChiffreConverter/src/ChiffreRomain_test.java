import static org.junit.Assert.*;

import org.junit.Test;

public class ChiffreRomain_test {

	@Test
	public void test1() {
		assertEquals("I", convertNumberToRoman(1));
	}
	
	@Test
	public void test2() {
		assertEquals("II", convertNumberToRoman(2));
	}
	
	@Test
	public void test3() {
		assertEquals("III", convertNumberToRoman(3));
	}
	
	@Test
	public void test4() {
		assertEquals("IV", convertNumberToRoman(4));
	}
	
	@Test
	public void test5() {
		assertEquals("V", convertNumberToRoman(5));
	}
	
	@Test
	public void test6() {
		assertEquals("VI", convertNumberToRoman(6));
	}
	
	@Test
	public void test7() {
		assertEquals("VII", convertNumberToRoman(7));
	}
	
	@Test
	public void test8() {
		assertEquals("VIII", convertNumberToRoman(8));
	}
	
	@Test
	public void test9() {
		assertEquals("IX", convertNumberToRoman(9));
	}
	
	@Test
	public void test10() {
		assertEquals("X", convertNumberToRoman(10));
	}
	
	@Test
	public void test14() {
		assertEquals("XIV", convertNumberToRoman(14));
	}
	
	public String convertNumberToRoman(int nombre) {
		String nombreRoman = "";
		
		if (nombre > 9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i <= nombre ; i=i+10) {
				sb.append(charRoman(10));
				nombre -= 10;
			}
			nombreRoman = sb.toString();
		}
		
		if( nombre == 1) {
			nombreRoman += charRoman(1);
		} else if (nombre == 2) {
			nombreRoman += charRoman(2);
		} else if (nombre == 3) {
			nombreRoman += charRoman(3);
		} else if (nombre % 10 == 10-1) {
			nombreRoman += charRoman(1);
			nombreRoman += charRoman(10);
		} else if(nombre % 5 == 5-1) {
			nombreRoman += charRoman(1);
			nombreRoman += charRoman(5);
		} else if (nombre % 5 == 1) {
			nombreRoman += charRoman(5);
			nombreRoman += charRoman(1);
		} else if (nombre % 5 == 2) {
			nombreRoman += charRoman(5);
			nombreRoman += charRoman(2);
		} else if (nombre % 5 == 3) {
			nombreRoman += charRoman(5);
			nombreRoman += charRoman(3);
		}
		else {
			nombreRoman += charRoman(nombre);
		}
		
		return nombreRoman;
	}

	private String charRoman(int nombre) {
		String nombreRoman = "";
		switch (nombre) {
			case 1:
				nombreRoman = "I";
				break;
			case 2: 
				nombreRoman = "II";
				break;
			case 3:
				nombreRoman = "III";
				break;
			case 5:
				nombreRoman = "V";
				break;
			case 10:
				nombreRoman = "X";
				break;
		}
		return nombreRoman;
	}

}
