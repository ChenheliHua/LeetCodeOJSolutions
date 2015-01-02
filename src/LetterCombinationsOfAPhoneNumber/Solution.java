package LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/31/2014
 */
public class Solution
{
  private String[][] map = new String[][]
    {
      {}, // 0
      {}, // 1
      {"a", "b", "c"}, // 2
      {"d", "e", "f"}, // 3
      {"g", "h", "i"}, // 4
      {"j", "k", "l"}, // 5
      {"m", "n", "o"}, // 6
      {"p", "q", "r", "s"}, // 7
      {"t", "u", "v"}, // 8
      {"w", "x", "y", "z"} // 9
    };

  public List<String> letterCombinations(String digits)
  {
    return letterCombinationsKernel(digits, 0);

  }

  private List<String> letterCombinationsKernel(String digits, int idx)
  {
    if (digits == null || idx == digits.length())
    {
      List<String> result = new ArrayList<String>();
      result.add("");

      return result;
    }

    List<String> recur = letterCombinationsKernel(digits, idx + 1);
    List<String> result = new ArrayList<String>();

    for (String str : recur)
    {
      int digit = digits.charAt(idx) - '0';

      for (int i = 0; i < map[digit].length; i++)
      {
        result.add(map[digit][i] + str);
      }
    }

    return result;
  }
}