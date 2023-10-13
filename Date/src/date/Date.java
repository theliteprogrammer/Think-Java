/**
 * 
 */
package date;

public class Date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String day = "Friday";
		String month = "October";
		int year = 2023;
		int date = 13;
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);
	}

}
