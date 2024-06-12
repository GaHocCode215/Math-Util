/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.gahoccode.mathutil.main;

import com.gahoccode.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Main {

    // This method is written in local
    public static void sayHiFromLocal() 
       {
        System.out.println("Hello");
    }
    //this method is written in directly in server to simulate
    //the word of another term member, he uploads code before me
    public static void SayHiFromServer() {
        System.out.println("Hello Local");
    }

    public static void main(String[] args) {
        // CÁCH KIỂM THỨ 2
        // Test case #1: Check if 0! returns 1
        int n = 0;
        long expectedResult = 1; // 0! == 1
        long actualResult = MathUtility.getFactorial(n);
        String msg = "0! | Expected " + expectedResult + " Actual: " + actualResult;
        JOptionPane.showMessageDialog(null, msg);
    }
//
//    public static void main(String[] args) {
//    CÁCH KIỂM THỨ 1
//        // NƠI TEST HÀM
//        // Viết ra các test case
//        // Test case #1: n = 0 | 0! = hy vọng == 1 
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! | Expected: " + expectedValue + " Actual: " + actualValue);
//        // Test case #2: n = 1 | 1! = hy vọng == 1 
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected: " + expectedValue + " Actual: " + actualValue);
//        // Test case #3: n = 5 | 5! = hy vọng == 120
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue + " Actual: " + actualValue);
//        // Test case #4: n = -1 | -1! = hy vọng hàm ném ra ngoại lệ
//        n = -1;
//        // expectedValue = HÀM TUNG RA NGOẠI LỆ; 
//        System.out.println("Check getF(-1) to see the exception!");
//        actualValue = MathUtility.getFactorial(n);
//        // HY VỌNG NGOẠI LỆ XUẤT HIỆN
//    }
//

}
