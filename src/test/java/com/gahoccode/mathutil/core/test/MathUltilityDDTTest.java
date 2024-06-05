/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.gahoccode.mathutil.core.test;

import com.gahoccode.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ASUS
 */
public class MathUltilityDDTTest {

    // CHUẨN BỊ DATA, SAU NÀY ĐƯA VÀI HÀM ASSTERT, CỦA FREAMWWORK
    // DATA NÀY ĐƯỢC TỪ TỪ TRCH1 VÀO TRONG HÀM ASSRECT
    // CHUẨN VỊ DATA, SAU NÀY KH VỪA VÀO HÀM ASSERT() CỦA FRAMWORK
    // DATA NÀY SẼ TỪ TỪ ĐC TRÍCH VÀO TRONG HÀM ASSERT()
    // NÓ NẰM TRONG HÀM CÓ STYLE LÀ STATIC
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }

    // Test case so sánh có trả về kì vọng hay ko
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        Assertions.assertEquals(expected, MathUtility.getFactorial(n));
    }

}
