package Oct.ex_11102024;

public class Lab_006 {
    public static void main(String[] args) {
        // Here is a list of all operators in Java with separate examples:

// 1. **Arithmetic Operators**
  //      Used to perform common mathematical operations.

        //  - **Addition (+)**:
        int a = 5, b = 3;
        System.out.println(a + b); // Output: 8

        //- **Subtraction (-)**:
        int a = 5, b = 3;
        System.out.println(a - b); // Output: 2

        //- **Multiplication (*)**:
        int a = 5, b = 3;
        System.out.println(a * b); // Output: 15

       // - **Division (/)**:
        int a = 10, b = 2;
        System.out.println(a / b); // Output: 5

        //- **Modulus (%)**:
        int a = 10, b = 3;
        System.out.println(a % b); // Output: 1


//  2. **Unary Operators**
  //      Used with one operand.
        // - **Unary minus (-)**:
        int a = 5;
        System.out.println(-a); // Output: -5

//        - **Increment (++), Pre and Post**:
        int a = 5;
        System.out.println(++a); // Pre-increment, Output: 6
        System.out.println(a++); // Post-increment, Output: 6 (a becomes 7)

        //- **Decrement (--), Pre and Post**:
        int a = 5;
        System.out.println(--a); // Pre-decrement, Output: 4
        System.out.println(a--); // Post-decrement, Output: 4 (a becomes 3)


  //      - **Logical NOT (!)**:
        boolean flag = true;
        System.out.println(!flag); // Output: false

// 3. **Relational Operators**
 //       Used to compare two values.

  //              - **Equal to (==)**:
        int a = 5, b = 5;
        System.out.println(a == b); // Output: true

  //      - **Not equal to (!=)**:
        int a = 5, b = 3;
        System.out.println(a != b); // Output: true

        //      - **Greater than (>)**:
        int a = 5, b = 3;
        System.out.println(a > b); // Output: true


//        - **Less than (<)**:
        int a = 5, b = 3;
        System.out.println(a < b); // Output: false

//        - **Greater than or equal to (>=)**:
        int a = 5, b = 5;
        System.out.println(a >= b); // Output: true

//        - **Less than or equal to (<=)**:
        int a = 5, b = 8;
        System.out.println(a <= b); // Output: true


// 4. **Logical Operators**
//        Used to perform logical "AND", "OR", and "NOT" operations.

//                - **Logical AND (&&)**:
        boolean a = true, b = false;
        System.out.println(a && b); // Output: false


//        - **Logical OR (||)**:
        boolean a = true, b = false;
        System.out.println(a || b); // Output: true

//        - **Logical NOT (!)**:
        boolean a = true;
        System.out.println(!a); // Output: false

// 5. **Bitwise Operators**
//        Operate on bits and perform bit-by-bit operations.

//                - **Bitwise AND (&)**:

        int a = 5, b = 3;
        System.out.println(a & b); // Output: 1 (Binary: 0101 & 0011 = 0001)

//        - **Bitwise OR (|)**:
        int a = 5, b = 3;
        System.out.println(a | b); // Output: 7 (Binary: 0101 | 0011 = 0111)


//        - **Bitwise XOR (^)**:
        int a = 5, b = 3;
        System.out.println(a ^ b); // Output: 6 (Binary: 0101 ^ 0011 = 0110)

//        - **Bitwise NOT (~)**:
        int a = 5;
        System.out.println(~a); // Output: -6 (Inverts bits)


// 6. **Assignment Operators**
//        Used to assign values to variables.

//        - **Assignment (=)**:
        int a = 5;
        System.out.println(a); // Output: 5


//        - **Add and assign (+=)**:
        int a = 5;
        a += 3; // a = a + 3;
        System.out.println(a); // Output: 8

//        - **Subtract and assign (-=)**:
        int a = 5;
        a -= 2; // a = a - 2;
        System.out.println(a); // Output: 3


//        - **Multiply and assign (*=)**:
        int a = 5;
        a *= 2; // a = a * 2;
        System.out.println(a); // Output: 10

//        - **Divide and assign (/=)**:
        int a = 10;
        a /= 2; // a = a / 2;
        System.out.println(a); // Output: 5

//        - **Modulus and assign (%=)**:
        int a = 10;
        a %= 3; // a = a % 3;
        System.out.println(a); // Output: 1


// 7. **Ternary Operator**
//        It is a shorthand for `if-else`.

//        - **Ternary ( ? : )**:
        int a = 5, b = 3;
        int max = (a > b) ? a : b;
        System.out.println(max); // Output: 5


// 8. **Shift Operators**
//        Used to shift bits of a number left or right.

//        - **Left Shift (<<)**:
        int a = 5;
        System.out.println(a << 1); // Output: 10 (5 * 2^1)


//        - **Right Shift (>>)**:
        int a = 8;
        System.out.println(a >> 1); // Output: 4 (8 / 2^1)


//        - **Unsigned Right Shift (>>>)**:

        int a = -8;
        System.out.println(a >>> 1); // Output: 2147483644 (unsigned shift)

// 9. **Instanceof Operator**
//        Used to check if an object is an instance of a specific class or subclass.

//        - **Instanceof (instanceof)**:
        String str = "Hello";
        System.out.println(str instanceof String); // Output: true

// 10. **Type-Casting Operators**
//        Used to cast one data type to another.

//        - **Type Casting**:
        double d = 9.8;
        int i = (int) d; // explicit casting
        System.out.println(i); // Output: 9
  }
}
