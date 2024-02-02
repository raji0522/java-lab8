/*Author: venigella
 * <p>:lab8
 * <p>:description:in main methos i wrote temperature converstion using convertCtoF: celsius* (9.0 / 5.0) + 32.
 for fahrenheit to celsius  using the formula (fahrenheit - 32) * (5.0 / 9.0). public static double economy(int miles, double gallons)
 The economy method calculates fuel economy in miles per gallon.The economy method takes in miles and gallons, checks for invalid inputs using a for loop, and calculates the fuel economy.
If the inputs are invalid, a warning message is printed.
 */
public class lab8
{

	public static void main(String[] args)
	{
		 double celsiusValue = 25.0;
	        double fahrenheitResult = convertCtoF(celsiusValue);
	        System.out.println(celsiusValue + " Celsius is equal to " + fahrenheitResult + " Fahrenheit");
	        
	        double fahrenheitValue = 77.0;
	        double celsiusResult = convertFtoC(fahrenheitValue);
	        System.out.println(fahrenheitValue + " Fahrenheit is equal to " + celsiusResult + " Celsius");
	        
	        int miles = 200;
	        double gallons = 10.0;
	        double mpgResult = economy(miles, gallons);
	        System.out.println("Fuel economy is " + mpgResult + " miles per gallon");
	        
	        int negativeMiles = -100;
	        double negativeGallons = -5.0;
	        mpgResult = economy(negativeMiles, negativeGallons);
	        System.out.println("Fuel economy with negative miles: " + mpgResult + " miles per gallon");
	        
	        int positiveMiles = 150;
	        double positiveGallons = 8.0;
	        mpgResult = economy(positiveMiles, positiveGallons);
	        System.out.println("Fuel economy with negative gallons: " + mpgResult + " miles per gallon");
	        
	        int zeroMiles = 120;
	        double zeroGallons = 0.0;
	        mpgResult = economy(zeroMiles, zeroGallons);
	        System.out.println("Fuel economy with zero gallons: " + mpgResult + " miles per gallon");
	    }
	    public static double convertCtoF(double celsius) {
	        return celsius * (9.0 / 5.0) + 32;
	    }

	    public static double convertFtoC(double fahrenheit) {
	        return (fahrenheit - 32) * (5.0 / 9.0);
	    }
	    public static double economy(int miles, double gallons) {
	    	for (int i = 0; i < 1 && (miles < 0 || gallons < 0 || gallons == 0); i++)
	    	{
	            System.out.println("Warning: Invalid input.");
	            return 0.0;
	    	}
	            return miles / gallons;
	        }
}
	    
	
	


