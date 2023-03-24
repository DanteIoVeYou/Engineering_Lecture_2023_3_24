#include "gtest/gtest.h"
#include "cal.h"

TEST(cal, add_two_positive_integer) {
    // prepare two positive integer
    int num1 = 10;
    int num2 = 20;
    // prepare the real result
    int real_value = 30;
    // call the add() method
    int result = add(num1, num2);
    // assert the result with the real value
    ASSERT_EQ(result, real_value);
}

TEST(cal, minus_two_positive_integer) {
    // prepare two positive integer
    int num1 = 10;
    int num2 = 20;
    // prepare the real result
    int real_value = num1 - num2;
    // call the minus() method
    int result = minus(num1, num2);
    // assert the result with the real value
    ASSERT_EQ(result, real_value);
}

TEST(cal, multiply_two_positive_integer) {
    // prepare two positive integer
    int num1 = 10;
    int num2 = 20;
    // prepare the real result
    int real_result = num1 * num2;
    // call the multiply() method
    int result = multiply(num1, num2);
    // assert the result with the real value
    ASSERT_EQ(result, real_result);
}

TEST(cal, divide_divisor_equals_zero) {
    // prepare two integer
    int num1 = 10;
    int num2 = 0;
    // call the multiply() method and make death test
    EXPECT_EXIT(divide(num1, num2), testing::KilledBySignal(SIGFPE), "");
}