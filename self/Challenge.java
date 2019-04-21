package self;

public class Challenge {

	public static void main (String[] args) {

	// Byte Number	
	byte myByteNumber = 10;

	// Short Number
	short myShortNumber = 20;

	// Int Number
	int myIntNumber = 50;

	// Long Number Variable
	long myLongNumber = 50000L + 10L * (myByteNumber + myShortNumber + myIntNumber);

	System.out.println(myLongNumber);

	// Number of Pounds
	double numberOfPounds = 200; //
	// A Pound is equal to 0.45359237 kilograms
	
	double numberOfKilograms = 200 * 0.45359237d;
	
	System.out.println("Kilograms = " + numberOfKilograms);

	char myUnicode1 = '\u00A9';

	System.out.println("10" + myUnicode1);


	}
}
