package teaching.answer.lecture1;

import java.util.ArrayList;

public class A_JavaBasic {

	private static void TypeBasic(){
		
		// Integer Literals
		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		// int binVal = 0b11010; Java SE 7
		
		System.out.println(hexVal);
		
		ArrayList<String> al = new ArrayList<String>();
		
		// Floating-Point Literals
		double d1 = 123.4;
		// same value as d1, but in scientific notation
		double d2 = 1.234e2;
		float f1  = 123.4f;
		
		// Using Underscore Characters in Numeric Literals
		// Need Java SE 7
		/**
		long creditCardNumber = 1234_5678_9012_3456L;
		float pi =  3.14_15F;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		*/
		
		// casting:
		// 1. Widening Primitive Conversion
		/**
		 	19 specific conversions on primitive types are called the widening primitive conversions:
			byte to short, int, long, float, or double
			short to int, long, float, or double
			char to int, long, float, or double
			int to long, float, or double
			long to float or double
			
			A widening primitive conversion does not lose information about the overall magnitude of a numeric value.
			
			A widening conversion of an int or a long value to float, 
			or of a long value to double, may result in loss of precision 
			that is, the result may lose some of the least significant bits of the value. 
			In this case, the resulting floating-point value will be a correctly rounded version of the integer value
			
			Despite the fact that loss of precision may occur, 
			a widening primitive conversion never results in a run-time exception
		 */
        int big = 1234567890;
        float approx = big;
        System.out.println(big - (int)approx);
        
        // 2. Narrowing Primitive Conversion
        /**
         	22 specific conversions on primitive types are called the narrowing primitive conversions:

			short to byte or char
			char to byte or short
			int to byte, short, or char
			long to byte, short, char, or int
			float to byte, short, char, int, or long
			double to byte, short, char, int, long, or float
			
			A narrowing primitive conversion may lose information 
			about the overall magnitude of a numeric value 
			and may also lose precision and range.
         */
        float fmin = Float.NEGATIVE_INFINITY;
        float fmax = Float.POSITIVE_INFINITY;
        System.out.println("float: " + (float)fmin +
                ".." + (float)fmax);
        System.out.println("long: " + (long)fmin +
                           ".." + (long)fmax);
        System.out.println("int: " + (int)fmin +
                           ".." + (int)fmax);
        System.out.println("short: " + (short)fmin +
                           ".." + (short)fmax);
        System.out.println("char: " + (int)(char)fmin +
                           ".." + (int)(char)fmax);
        System.out.println("byte: " + (byte)fmin +
                           ".." + (byte)fmax);
        
        // 3. Widening and Narrowing Primitive Conversion
        /**
        	The following conversion combines both widening and narrowing primitive conversions:
        	byte to char

        	First, the byte is converted to an int via widening primitive conversion,
        	and then the resulting int is converted to a char by narrowing primitive conversion).
         */

	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A_JavaBasic a = new A_JavaBasic();
		a.TypeBasic();
	}

}
