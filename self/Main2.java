package self;

public class Main2 {

	public static void main (String[] args) {

	// int values
		int myMinValue = -2_147_483_648;
		int myMaxValue = 2_147_483_647;
		int myTotal = (myMinValue/2);
		System.out.println("myTotal = " + myTotal);

	// byte values
		byte myByteValue = -128;
		byte myNewByteValue = (byte) (myByteValue/2);
		System.out.println("myNewByteValue = " + myNewByteValue);

	// short values
		short myShortValue = 32767;
		short myNewShortValue = (short) (myShortValue/2);

	// long value
		long myLongValue;
		myLongValue = 9_223_372_036_854_775_807L;

	}
}
