/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.gahoccode.mathutil.core.test;

import com.gahoccode.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// C# viết theo xuôi, chữ hoa từng đầu từ
// Microsoft.Sqlserver...
// Coding convention for ...
/**
 *
 * @author ASUS
 */
public class MathUtilityTest {

    // Ở đây chứa các lệnh các hàm dùng để đi test hàm chính ở bên code chính
    // ở bên thư mục source phía trên coi hàm chạy ổn không
    // ở đây ta làm các hàm ứng với các test case để test code chính ở bên
    // MathUtility. ví dụ .getFactorial()
    // TEST CASE: BỘ DATA ĐƯA VÀO HÀM, APP ĐỂ VERIFY HÀM, APP CÓ XỬ LÍ ĐÚNG HAY KO,
    // NÓ ĐI KÈM THEO CÁCH XÀI, TRÌNH TỰ XÀI APP + EXPECTED + VALUE + STATUS TEST CASE PASSED HAY FAILED
    // TEST CASE #1: CHECK GETFACTORIAL() WITH N = 0, 0! HOPE TO SEE 1 RETURNED
    @Test
    // Tên hàm mang ý nghĩa của test case
    public void testFactorialGivenRightArg0ReturnsWell() {
        int n = 0; //given right argument
        long expectedValue = 1; // Hy vọng n! 0! => 1
        long actualValue; // = ???, đoán xem trả về mấy
        // Nếu expected == actual, hàm ngon với test case
        actualValue = MathUtility.getFactorial(n);

        // Cách cũ là phải sout() từng cái 1 và dùng mắt để nhìn đúng sai
        Assertions.assertEquals(expectedValue, actualValue);
    }

    // TEST CASE #2: CHECK GETFACTORIAL WITH N = 1, EXPECTED => 1! = 1
    @Test
    public void testFactorialGivenRightArg1ReturnsWell() {
        int n = 1;
        long exptectedValue = 1; // Hy vọng 1! => 1
        long actualValue;
        actualValue = MathUtility.getFactorial(n);

        Assertions.assertEquals(exptectedValue, actualValue);
    }

    // TEST CASE #3: CHECK GETFACTORIAL WITH N = 2, EXPECTED => 2! = 2
    //                                       N = 3, EXPECTED => 3! = 6
    //                                       N = 3, EXPECTED => 5! = 120
    @Test
    public void testFactorialGivenRightArg235ReturnsWell() {
        int n = 2;
        long exptectedValue = 2; // Hy vọng 2! => 2
        long actualValue;
        actualValue = MathUtility.getFactorial(n);

        Assertions.assertEquals(exptectedValue, actualValue); // 2! == 2

        Assertions.assertEquals(6, MathUtility.getFactorial(3)); // 3! == 6

        Assertions.assertEquals(120, MathUtility.getFactorial(5)); // 5! == 120
    }

    // TEST CASE #4: CHECK IF GETFACTORIAL RETIRMS EXCEPTION IF WE PASS N < 0 
    @Test
    public void testFactorialGivenWrongArg_1ThrowsException() {
        // Input n < 0, n = -1
        // Expected result: Illegal Argument Exception
        // Màu xanh ứng với trả về như kì vọng
        // Màu đỏ actual != kì vọng
        // Ngoại lệ Exception không là value, ta không khai báo biến để = ngoại lệ
        // Không assertEquals(value , value )
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    MathUtility.getFactorial(-1);
                });
    }

}
// PHẦN KIẾN THỨC BỔ SUNG VÀO CV ( HỒ SƠ NĂNG LỰC )
// TDD - TEST DRIVEN DEVELOPMENT
// LÀ KĨ THUẬT VIẾT CODE CỦA DÂN DEV ĐI KÈM VỚI VIẾT CÁC TEST CASE
// ĐỂ KIỂM THỬ NGAY NHỮNG CODE VỪA VIẾT
// TỨC LÀ CODE MỖI HÀM, LUÔN ĐI KÈM CODE KIỂM THỬ
// KẾT QUẢ KIỂM THỬ HIỆN THỊ THEO 2 MÀU: XANH - CODE NGON ( PASS CÁC TEST CASE ) ; ĐỎ - CODE KO PASS TEST CASE
// VIỆC NÀY CỨ LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST CASE ĐỂ XEM XANH ĐỎ, KĨ THUẬT NÀY GỌI LÀ TDD
// MỌI NGÔN NGỮ LẬP TRÌNH ĐỀU HỖ TRỢ CÁC THƯ VIỆN, FRAMEWORK GIÚP TEST CODE 2 MÀU XANH ĐỎ, GỌI LÀ UNIT TESTING FRAMEWORK
// MỌI NGÔN NGŨ ĐỀU HỖ TRỢ TDD, VẤN ĐỀ LÀ DEV TEAM CÓ XÀI HAY KO
// NHÓM LÀM OBS CÓ XÀI

// ĐỀ BÀI THUYẾT TRÌNH NHÓM
// NHÓM HÃY CHỌN 1 UNIT TESTING FRAMEWORK ĐỂ DEMO
// VÀO GG GÕ: UNIT TESTING FRAMEWORK FOR <NNLT>, RA KQ THƯ VIỆN
// C#: NUNIT , XUNIT, MS TEST...
// JAVA: TESTING...
// JS: MOCHA, JASMINE...

// DÒNG THỨ 2 TRONG CV
// DDT - DATA DRIVEN TESTING <=> PARAMETERIZED TESTING ( VIẾT TEST CASE THEO STYLE THAM SỐ HÓA )
// ( ĐỪNG NHẦM VỚI TDD )
// DDT LÀ PHẦN MỞ RỘNG THÊM, KĨ THUẬT NÂNG CAO ĐỂ GIÚP TỔ CHỨC CÁC TEST CASE KHI VIẾT CODE UNIT TEST, CÓ BÀ CON VỚI TDD
// DDT - PARAMETERIZED TESTING LÀ KĨ THUẬT VIẾT CÁC TEST CASE MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÂU LỆNH ASSERT() 
// CHO DỄ QUẢN LÍ TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
// DỄ THEO DÕI CÁC CODE LIÊN QUAN ĐẾN TEST HÀM
// VÌ CÂU LỆNH SO SÁNH EXPECTED VS ACTUAL TRỞ NÊN GỌN NHẸ HƠN