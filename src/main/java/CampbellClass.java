public final class CampbellClass {
	private CampbellClass() {

	}
	/**
	 * * This method converts the given int to a string.
	 * @param a
	 * @return returns the int as a string
	 */
	public static String convertString(int a) {
		return String.valueOf(a);
	}
	/**
	 * This method returns the given double to a string
	 * @param a
	 * @return returns the double as a string
	 */
	public static String convertString(double a) {
		return String.valueOf(a);
	}
	/**
	 * This method returns the given float to a string
	 * @param a
	 * @return returns the char as a string
	 */
	public static String convertString(char a) {
		return String.valueOf(a);
	}

	/**
	 * This method returns the given boolean to a string
	 * @param a
	 * @return returns the boolean as a string
	 */
	public static String convertString(boolean a) {
		return String.valueOf(a);
	}

	/**
	 * This method converts meters as an int to centimeters
	 * @param meters
	 * @return returns the meters as centimeters
	 */
	public static int convertMetersToCenti(int meters) {
		return (int) meters * 100;
	}

	/**
	 * This method converts meters as a double to centimeters
	 * @param meters
	 * @return returns the meters as centimeters
	 */
	public static double convertMetersToCenti(double meters) {
		return meters * 100;
	}

	/**
	 * * This method removes all non-letter characters from the given string.
	 * @param str
	 * @return returns the string with all non-letter characters removed
	 */
	public static String removeNonAlpha(String str) {
		return str.replaceAll("[^a-zA-Z]", ""); // removes all non-letter characters 
	}

	/**
	 * This method removes all non-letter characters from the given string and converts it to upper or lower case.
	 * @param str
	 * @param isAlpha
	 * @return returns the all letters in the string to uppercase if boolean is true else if it's false it will return the string in lowercase
	 */
	public static String removeNonAlpha(String str, boolean isAlpha) {
		if (isAlpha == true) {
			return str.replaceAll("[^a-zA-Z]", "").toUpperCase();
		} else {
			return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		}
	}
}