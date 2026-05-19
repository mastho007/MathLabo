package calculator;

/**
 * The main class of a simple calculator application.
 * 
 * @author David J. Barnes and Michael Kolling
 */
public class Calculator
{
    /**
     * Create a new calculator and show it.
     */
	public static void main(String[] args) {
        new CalcInterface(new CalcEngine());
    }
}
