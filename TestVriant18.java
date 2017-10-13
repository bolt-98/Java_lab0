package lab0;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.Assert;

public class TestVriant18 {
 
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][] testNum(){
		return new Object[][]{
			{10.0,11.0,15.0,546.0},{10.0,15.0,40.0,1375.0}
		};
	}
	@Test (dataProvider = "testNum")
		public void testForNumm(double a, double b, double c, double res){
			assertEquals(new Variant18().nummberTaks(a,b,c),res);
		}
	@Test(expectedExceptions = AssertionError.class)
	public void erorrtest() {
		new Variant18().nummberTaks(10.0, 5, 15);
	}
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][] testInt(){
		return new Object[][] {
			{350}, {517}
		};
	}
	/*@Test (dataProvider = "testInt")
	public void testForInt(int a, int b) {
		assertEquals(new Variant18().integerTask(a), b);
	}*/
	@Test(expectedExceptions = AssertionError.class, dataProvider ="testInt")
	public void erorrtest2(int a) {
		new Variant18().integerTask(a);
	}
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][] testBool(){
		return new Object[][] {
			{2,34,54, false}, {2,4,4,true}
		};
	}
	@Test(dataProvider = "testBool")
	public void testForBool(int a, int b, int c, boolean k) {
		assertEquals(new Variant18().strTask(a, b, c),k);
	}
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][]testIf(){
		return new Object[][] {
			{22,4,22,2},{32,32,184,3}, {23,12,12,1}
		};
	}
	@Test(dataProvider = "testIf")
	public void testForIf(int a, int b, int c, int ind) {
		assertEquals(new Variant18().indexTask(a,b,c), ind);
	}
	@Test(expectedExceptions = AssertionError.class)
	public void erorrtest3() {
		new Variant18().indexTask(23, 23, 23);
		new Variant18().indexTask(3, 18, 69);
	}
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][]testCase(){
		return new Object[][] {
			{256, "Двести Пятьдесят Шесть"}, {109, "Сто  Девять"}, 
			{500, "Пятьсот  "}, {314, "Триста Четырнадцать "}
		};
	}
	@Test(dataProvider = "testCase")
	public void testForCase(int num, String s) {
		assertEquals(new Variant18().numStrTask(num),s);
	}
	@Test(expectedExceptions = AssertionError.class)
	public void erorrtest4() {
		new Variant18().numStrTask(99);
		new Variant18().numStrTask(85745);
	}
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][]testFor(){
		return new Object[][] {
			{3.5,2,8.75}, {4.8, 10, 5373107.760707172}, {5.0, 4, 520.0}
		};
	}
	@Test(dataProvider="testFor")
	public void testFortest(double a, int n, double rez) {
		assertEquals(new Variant18().forTask(a, n),rez);
	}
	@Test(expectedExceptions = AssertionError.class)
	public void erorrtest5() {
		new Variant18().forTask(256.0, -1);
	}
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][]testWhil(){
		return new Object[][] {
			{352, 3, 10}
		};
	}
	Variant18 main = new Variant18();
	@Test (dataProvider = "testWhil")
	public void testForWhil(int test1, int test2, int test3) {
		assertEquals(main.calculate(test1), main.new WhileNumm(test2, test3));
		}
	/*-----------------------------------------------------------------------------------*/
	@DataProvider
	public Object[][]testArr(){
		return new Object[][] {
			{ new double[] {3,5,3,5,3,5,21,5,12},9,21}, {new double [] {3,5,234,5,43,5},6,234}
		};
	}
	@Test(dataProvider = "testArr")
	public void testForArr(double [] mas, int n, double r) {
		assertEquals(new Variant18().arrTask(mas, n),r);
	}
	/*-----------------------------------------------------------------------------------*/
	@Test
	public void testMartix() {
		int [][] mas = {{1,2,3, 4},
						{8,378,1,2},
						{4,2,5,24},
						{2,5,40,274}};
		
		int [][] rez = {{1,3,4},
						{8,1,2},
						{4,5,24},
						{2,40,274}};
		
		Assert.assertTrue(Arrays.deepEquals(new Variant18().matrixTask(mas), rez));
		
	}
}

