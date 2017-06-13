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

    static void threeDimensionalArrays() { // 3D Matrix
        System.out.println("\nInside threeDimensionalArrays ...");
        int[][][] unitsSold = new int[][][]{ // can remove `new int` from 2 dimensional and up
            { // New York
                {0, 0, 0, 0}, // Jan
                {0, 0, 0, 0}, // Feb
                {0, 0, 0, 0}, // Mar
                {0, 850, 0, 0} // Apr
            },
            { // San Francisco
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            { // DC
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            },
            { // Denver
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
            }
        };
        System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
    } 

    static void go(int[] array) {
        System.out.println("array[0]: " + array[0]);
        System.out.println("array[1]: " + array[1]);

        array[1] = 22;
    }

    static void go(int i) {
        System.out.println("go(int i)");
    }

    static void go(short s) {
        System.out.println("go(short s)");
    }

    static void varargsOverload(boolean b, int i, int j, int k) {
        System.out.println("\nInside varargsOverload without varargs ...");
    }

    static void varargsOverload(boolean b, int... list) {
        System.out.println("\nInside varargsOverload with varargs ...");
        System.out.println("list.length: " + list.length);
    }

    static void charTypePromotion() {
        System.out.println("\nInside charTypePromotion ...");
        char char1 = 50; // Will be assigned corresponding UTF16 value 2
        System.out.println("char1: " + char1);
        System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e. decimal eq. 50 in UTF16 is used
        System.out.println("(char1 - '3'): " + (char1 - '3')); // char 1 & 3 are promoted to ints
        System.out.println("('a' + 'b'): " + ('a' + 'b')); // 'a' + 'b' are promoted to ints and the respected eq. 97 & 98 are added
    }

    public static void main(String[] args) {
        // // if (count < 49) {
        // //     NOT ON CLASS LEVEL
        // // } 
        // // count = 34 NOT ON CLASS LEVEL        
        // Language Basics 1
        // print();
        // primitives();
        // typeCasting();
        // arrays();
        // threeDimensionalArrays();

        // int[] array = {1, 2};
        // go(array);
        // System.out.println("array[1]: " + array[1]);

        // byte b = 22;
        // go(b); // method overload short s
        // go(23); method overload int i

        // varargsOverload(true, 1, 2, 3);
        // varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
        // varargsOverload(true);

        charTypePromotion();
    }

    // Field declarations OK
    // Method declarations OK
    // Constructor declarations OK
    // Nested class & interface declarations OK
    // Instance and static initalizers OK

}