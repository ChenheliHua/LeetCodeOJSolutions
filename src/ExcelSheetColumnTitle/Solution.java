package ExcelSheetColumnTitle;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/2/2015
 */
public class Solution
{
  private String[] map =
    {
      "Z", "A", "B", "C",
      "D", "E", "F", "G",
      "H", "I", "J", "K",
      "L", "M", "N", "O",
      "P", "Q", "R", "S",
      "T", "U", "V", "W",
      "X", "Y"
    };

  public String convertToTitle(int n)
  {
    if (n <= 0)
    {
      return "";
    }

    StringBuilder sb = new StringBuilder();

    while (n >= 26)
    {
      sb.insert(0, map[n % 26]);

      if (n % 26 == 0)
      {
        n = n / 26 - 1;
      }
      else
      {
        n = n / 26;
      }
    }

    if (n != 0)
    {
      sb.insert(0, map[n % 26]);
    }

    return sb.toString();
  }
}
