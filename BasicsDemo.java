class BasicsDemo {
    static void print() {
        System.out.println("\n\nInside print ...");
        System.out.println("Hello, world!!");
        System.out.println(); 
        System.out.print("Hello, world!!");
        System.out.println("Hello,");
        System.out.print(" ");
        System.out.print("world!!");
    }

    static void primitives() {
        System.out.println("\n\nInside primitives ...");
        // literals demo
        int intOctal = 0101;
        System.out.println("intOctal: " + intOctal);
        int intHex = 0x0041;
        System.out.println("intHex: " + intHex);
        int intChar = 'A'; // decimal value of 65
        System.out.println("intChar: " + intChar);
        int intBinary = 0b01000001;
        System.out.println("intBinary: " + intBinary);
        int intUnderscore = 1_23_456;
        System.out.println("intUnderscore: " + intUnderscore);

        char charA = 'A';
        System.out.println("charA: " + charA);
        char charInt = 65;
        System.out.println("charInt: " + charInt);
        char charHex = '\u0041'; // 4 * (16 power 1) + 1 * (16 power 0)
        System.out.println("charHex: " + charHex);
        char charUnicode = 0x41; // 4 * (16 power 1) + 1 * (16 power 0)
        System.out.println("charUnicode: " + charUnicode);
        char charBinary =  0b01000001; // binary correspoinding to decimal 65
        System.out.println("charBinary: " + charBinary);
    }

    static void typeCasting() {
        System.out.println("\nInside typeCasting ...");
        // Explicit casting
        long y = 42;
        // int x = y;
        int x = (int) y;

        // Information loss due to out-of-range assignment
        byte narrowdByte = (byte)123456;
        System.out.println("narrowdByte: " + narrowdByte);

        // Truncation
        int iTruncated = (int)0.99;
        System.out.println("iTruncated: " + iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: "  + iInt);

        // byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar: " + cChar);

    }

    static int count = 25; // declaration statment at class level

    static void arrays() {
        System.out.println("\nInside arrays ...");
        int[] myArray = new int [] {9, 11 ,2 ,5 ,4, 4, 6};
        System.out.println("MyArray.length: " + myArray.length);   
        System.out.println("MyArray.[1]: " + myArray[1]);
        // System.out.println("MyArray.[1]: " + myArray[7]); RUNTIME ERROR
    }

    public static void main(String[] args) {
        // if (count < 49) {
            // NOT ON CLASS LEVEL
        // } 
        // count = 34 NOT ON CLASS LEVEL        
        // Language Basics 1
        // print();
        // primitives();
        // typeCasting();
        arrays();
    }

    // Field declarations OK
    // Method declarations OK
    // Constructor declarations OK
    // Nested class & interface declarations OK
    // Instance and static initalizers OK

}