package com.mycompany.operatorbitwise;

/**
 * Demonstrasi Operator Bitwise dalam Java
 * @author luqmanaru
 */
public class OperatorBitwise {
    public static void main(String[] args) {
        int a = 60;    // 60 = 0011 1100 
        int b = 13;    // 13 = 0000 1101
        int c = 0;
        
        // Operasi AND bitwise
        c = a & b;     // 12 = 0000 1100
        System.out.println("a & b = " + c);
        
        // Operasi OR bitwise
        c = a | b;     // 61 = 0011 1101
        System.out.println("a | b = " + c);
        
        // Operasi XOR bitwise
        c = a ^ b;     // 49 = 0011 0001
        System.out.println("a ^ b = " + c);
    }
}
