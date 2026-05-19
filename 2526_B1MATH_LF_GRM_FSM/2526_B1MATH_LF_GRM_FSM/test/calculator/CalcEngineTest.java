package calculator;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Test class for CalcEngine.java
 *
 * @author  François Schumacker
 */
public class CalcEngineTest
{
    private CalcEngine calcEngine;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        calcEngine = new CalcEngine();
        calcEngine.clear();        

    }

    /*
     * TEST PLAN
     * 
     * The first parameter of assertEquals() describes the test case.
     */
    @Test
    public void test1()
    {
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(1);
        assertEquals(1, calcEngine.getDisplayValue(), "- 1 --> 1");
    }

    @Test
    public void test2()
    {
        calcEngine.digitPressed(1);
        calcEngine.plusOrMinus('-');
        calcEngine.plusOrMinus('-');
        assertEquals(1, calcEngine.getDisplayValue(), "1 - -  -->  1");
    }

    @Test
    public void test3()
    {
        calcEngine.digitPressed(1);
        calcEngine.plusOrMinus('-');
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(2);
        assertEquals(2, calcEngine.getDisplayValue(), "1 - - 2  -->  2");
    }

    @Test
    public void test4()
    {
        calcEngine.digitPressed(1);
        calcEngine.plusOrMinus('-');
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(2);
        calcEngine.equals();
        assertEquals(-1, calcEngine.getDisplayValue(), "1 - - 2 =  -->  -1");
    }

    @Test
    public void test5()
    {
        calcEngine.equals();
        assertEquals(0, calcEngine.getDisplayValue(), "<init>  -->  0");
    }

    @Test
    public void test6()
    {
        calcEngine.equals();
        calcEngine.digitPressed(1);
        assertEquals(1, calcEngine.getDisplayValue(), "= 1  -->  1");
    }

    @Test
    public void test7()
    {
        calcEngine.equals();
        calcEngine.digitPressed(1);
        calcEngine.equals();
        assertEquals(1, calcEngine.getDisplayValue(), "= 1 =  -->  1");
    }

    @Test
    public void test8()
    {
        calcEngine.digitPressed(1);
        assertEquals(1, calcEngine.getDisplayValue(), "1  -->  1");
    }

    @Test
    public void test9()
    {
        calcEngine.digitPressed(1);
        calcEngine.equals();
        assertEquals(1, calcEngine.getDisplayValue(), "1 =  -->  1");
    }

    @Test
    public void test10()
    {
        calcEngine.digitPressed(1);
        calcEngine.plusOrMinus('+');
        assertEquals(1, calcEngine.getDisplayValue(), "1 +  -->  1");
    }

    @Test
    public void test11()
    {
        calcEngine.digitPressed(1);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        assertEquals(2, calcEngine.getDisplayValue(), "1 + =  -->  2");
    }

    @Test
    public void test12()
    {
        calcEngine.digitPressed(1);
        calcEngine.plusOrMinus('+');
        calcEngine.plusOrMinus('+');
        assertEquals(1, calcEngine.getDisplayValue(), "1 + +  -->  1");
    }

    @Test
    public void test13()
    {
        calcEngine.digitPressed(3);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        assertEquals(9, calcEngine.getDisplayValue(), "3 + = =  -->  9");
    }

    @Test
    public void test14()
    {
        calcEngine.digitPressed(3);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.equals();
        assertEquals(0, calcEngine.getDisplayValue(), "3 + = = - =  -->  0");
    }

    @Test
    public void test15()
    {
        calcEngine.digitPressed(3);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(2);
        assertEquals(2, calcEngine.getDisplayValue(), "3 + = = - 2  --> 2");
    }

    @Test
    public void test16()
    {
        calcEngine.digitPressed(3);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(2);
        calcEngine.equals();
        assertEquals(7, calcEngine.getDisplayValue(), "3 + = = - 2 =  --> 7");
    }

    @Test
    public void test17()
    {
        calcEngine.digitPressed(3);
        calcEngine.plusOrMinus('-');
        calcEngine.equals();
        calcEngine.equals();
        assertEquals(-3, calcEngine.getDisplayValue(), "3 - = =  -->  -3");
    }

    @Test
    public void test18()
    {
        calcEngine.digitPressed(3);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.digitPressed(2);
        calcEngine.equals();
        assertEquals(5, calcEngine.getDisplayValue(), "3 + = = 2 =  -->  5");
    }

    @Test
    public void test19()
    {
        calcEngine.digitPressed(5);
        calcEngine.plusOrMinus('+');
        calcEngine.digitPressed(9);
        calcEngine.equals();
        assertEquals(14, calcEngine.getDisplayValue(), "5 + 9 =  -->  14");
    }

    @Test
    public void test20()
    {
        calcEngine.digitPressed(9);
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(5);
        calcEngine.equals();
        assertEquals(4, calcEngine.getDisplayValue(), "9 - 5 =  -->  4");
    }

    @Test
    public void test21()
    {
        calcEngine.digitPressed(5);
        calcEngine.plusOrMinus('+');
        calcEngine.digitPressed(9);
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(8);
        calcEngine.equals();
        assertEquals(6, calcEngine.getDisplayValue(), "5 + 9 - 8 =  -->  6");
    }

    @Test
    public void test22()
    {
        calcEngine.digitPressed(4);
        calcEngine.plusOrMinus('-');
        calcEngine.equals();
        assertEquals(0, calcEngine.getDisplayValue(), "4 - =  -->  0");
    }

    @Test
    public void test23()
    {
        calcEngine.digitPressed(4);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.equals();
        calcEngine.equals();
        assertEquals(-12, calcEngine.getDisplayValue(), "4 + = = - = =  -->  -12");
    }

    @Test
    public void test24()
    {
        calcEngine.digitPressed(4);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.digitPressed(5);
        calcEngine.equals();
        calcEngine.equals();
        assertEquals(2, calcEngine.getDisplayValue(), "4 + = = - 5 = =  -->  2");
    }

    @Test
    public void test25()
    {
        calcEngine.digitPressed(4);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.plusOrMinus('+');
        calcEngine.digitPressed(5);
        calcEngine.equals();
        calcEngine.equals();
        assertEquals(22, calcEngine.getDisplayValue(), "4 + = = - + 5 = =  -->  22");
    }

    @Test
    public void test26()
    {
        calcEngine.digitPressed(4);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.digitPressed(8);
        calcEngine.equals();
        assertEquals(-4, calcEngine.getDisplayValue(), "4 + = = - = = 8 =  -->  -4");
    }
    
    @Test
    public void test27()
    {
        calcEngine.digitPressed(4);
        calcEngine.plusOrMinus('+');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.plusOrMinus('-');
        calcEngine.equals();
        calcEngine.equals();
        calcEngine.digitPressed(8);
        calcEngine.equals();
        calcEngine.equals();
        assertEquals(-16, calcEngine.getDisplayValue(), "4 + = = - = = 8 = =  -->  -16");
    }

    @Test
    public void test28()
    {
        calcEngine.digitPressed(4);
        calcEngine.digitPressed(2);
        calcEngine.plusOrMinus('+');
        calcEngine.plusOrMinus('+');
        calcEngine.plusOrMinus('-');
        calcEngine.equals();
        calcEngine.equals();
        assertEquals(-42, calcEngine.getDisplayValue(), "4 2 + + - = =  -->  -42");
    }


    /*
     * Miscellaneous tests
     */
    @Test
    public void testGetTitle()
    {
        assertEquals("Calculator", calcEngine.getTitle());
    }

    @Test
    public void testGetAuthor()
    {
        assertEquals("Hacker T. Largebrain", calcEngine.getAuthor());
    }

    @Test
    public void testGetVersion()
    {
        assertEquals("Version 0.2", calcEngine.getVersion());
    }

}
