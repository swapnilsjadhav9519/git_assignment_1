
package staragile;
import junit.framework.Assert;
import org.junit.Test;

public class calctest 
{

	@Test
	public void testSum()
	{		
		newcalc calculator = new newcalc();		
		Assert.assertEquals(5, calculator.add(2, 3));
	
	}

	@Test
	public void testMinus() {
		newcalc calculator = new newcalc();
		Assert.assertEquals(0, calculator.sub(3, 3));
	}

	@Test
	public void testMUL() {
		newcalc calculator = new newcalc();
		Assert.assertEquals(6, calculator.mul(2, 3));
	}
	
		
	@Test
	public void testDivide()
	{
		newcalc calculator = new newcalc();
		Assert.assertEquals(2, calculator.div(6, 3));
	}
	

	@Test(expected = ArithmeticException.class)
	
	public void testDivideWillThrowExceptionWhenDivideOnZero()
	{
		newcalc calculator = new newcalc();
		calculator.div(2,0);
	}
}

