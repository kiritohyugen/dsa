// 231. Power of Two
// Easy
// Topics
// Companies

// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1

// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16

// Example 3:

// Input: n = 3
// Output: false

// Constraints:

//     -231 <= n <= 231 - 1

class Solution {
    public boolean isPowerOfTwo(int n) {
        // if (n == 0) {
        // return false;
        // }
        // // for negative cases --> Ex -16
        // // if(n < 0){
        // // n = -n;
        // // }
        // if (n == 1) {
        // return true;
        // }
        // if (n % 2 == 1) {
        // return false;
        // }
        // return isPowerOfTwo(n / 2);









        // explain using bitwise in detail
        // ChatGPT

        // Sure, let's dive into the bitwise approach to check if a number is a power of
        // two.

        // The idea behind the bitwise approach is that for any power of two, there is
        // only one bit set in its binary representation. For example, binary
        // representations of some powers of two are:

        // 1: 0001
        // 2: 0010
        // 4: 0100
        // 8: 1000

        // You can observe that there is always exactly one '1' bit set in these binary
        // representations.

        // Now, let's consider the bitwise AND operation between a power of two and its
        // predecessor:

        // 1 & (1 - 1) = 1 & 0 = 0
        // 2 & (2 - 1) = 2 & 1 = 0
        // 4 & (4 - 1) = 4 & 3 = 0
        // 8 & (8 - 1) = 8 & 7 = 0

        // In general, for any power of two x, the result of x & (x - 1) is always 0.
        // This property holds because the bitwise AND of a power of two with its
        // predecessor will always result in all bits being cleared except for the
        // highest bit.
        return (n > 0) && ((n & (n - 1)) == 0);

    }
}