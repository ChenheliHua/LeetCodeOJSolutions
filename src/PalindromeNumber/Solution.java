package PalindromeNumber;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/2/2014
 */
public class Solution
{
  public boolean isPalindrome(int x)
  {
    if (x < 0)
    {
      return false;
    }

    int copy = x;
    int reverse = 0;
    int digit;

    while (copy != 0)
    {
      digit = copy - (copy / 10) * 10;

      reverse = reverse * 10 + digit;
      copy /= 10;
    }

    return reverse == x;
  }
}
