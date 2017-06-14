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

    static void bitwiseOperators() { 
        System.out.println("\nInside bitwiseOperators ...");
        int x = 1;
        int y = 3;

        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("~x: " + (~x));
        System.out.println("true & false: " + (true & false));

        char c1 = 'a'; // U+0061 --> 0110 0001
        char c2 = 'b'; // U+0062 --> 0110 0010
        System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --< 99 in decimial

        // Since bitwise work only on INteger types, following will not compile
        // double d1 = 3.14;
        // double d2 = 5.15;
        // System.out.println("d1 | d2: " + (d1 | d2));

    }

    static void switchExample() { 
        System.out.println("\nInside switchExample ...");
        final byte month2 = 2; // final makes this a constant and allows this to compile
        byte month = 3;
        // Integer month = new Integer(3);
        switch(month){
            case 1: System.out.println("January");
                    break;
            case month2: System.out.println("Febuary");
                    break;
            case 3: System.out.println("March");
                    break;
            default: System.out.println("April");
        }
    }

    // Ternary statement
    
    static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    static void labeledBreak() {
        System.out.println("\nInside labeledBreak ...");
        int num = 0;

        outermost: for (int i = 0; i < 10; i ++) { 
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break outermost;
                }
                num++;
            }
        }

        System.out.println("num: " + num); // 55
    }

    static void labeledContinue() {
        System.out.println("\nInside labeledContinue ...");
        int num = 0;

        outermost: for (int i = 0; i < 10; i ++) { 
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    continue outermost;
                }
                num++;
            }
        }

        System.out.println("num: " + num); // 95
    }

    public static void main(String[] args) {


        // int[] iArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // for(int i = 0; i < iArray.length; i++) {
        //     System.out.println(iArray[i]);
        // }
        // for(int i = 0; i < iArray.length; System.out.println(iArray[i++])); valid compact for loop

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

        // charTypePromotion();
        // bitwiseOperators();

        // switchExample();

        // int min = min(9, 3);
        // System.out.println("min: " + min);

        // labeledBreak();
        labeledContinue();
    }

    // Field declarations OK
    // Method declarations OK
    // Constructor declarations OK
    // Nested class & interface declarations OK
    // Instance and static initalizers OK

}