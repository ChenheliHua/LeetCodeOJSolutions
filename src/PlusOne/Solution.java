package PlusOne;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/29/2014
 */
public class Solution
{
  public int[] plusOne(int[] digits)
  {
    int carry = 0;
    digits[digits.length - 1]++;

    for (int i = digits.length - 1; i >= 0; i--)
    {
      int val = digits[i] + carry;
      digits[i] = val % 10;
      carry = val / 10;
    }

    if (carry == 0)
    {
      return digits;
    }
    else
    {
      int[] newDigits = new int[digits.length + 1];
      newDigits[0] = carry;

      for (int i = 0; i < digits.length; i++)
      {
        newDigits[i + 1] = digits[i];
      }

      return newDigits;
    }
  }
}
