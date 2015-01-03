package ExcelSheetColumnNumber;


/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/2/2015
 */
public class Solution
{
  public int titleToNumber(String s)
  {
    int num = 0;

    if (s == null || s.length() == 0)
    {
      return num;
    }

    for (int i = 0; i < s.length(); i++)
    {
      num = num * 26 + (s.charAt(i) - 'A' + 1);
    }

    return num;
  }
}
