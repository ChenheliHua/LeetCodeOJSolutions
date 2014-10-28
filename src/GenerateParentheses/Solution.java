package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public List<String> generateParenthesis(int n)
  {
    return generateParenthesisKernel(n, n);
  }

  private List<String> generateParenthesisKernel(int open, int close)
  {
    if (open == 0 && close == 0)
    {
      List<String> result = new ArrayList<String>();
      result.add("");

      return result;
    }

    if (open < close)
    {
      List<String> result = new ArrayList<String>();

      List<String> addClose = generateParenthesisKernel(open, close - 1);
      for (String s : addClose)
      {
        result.add(")" + s);
      }

      List<String> addOpen;
      if (open > 0)
      {
        addOpen = generateParenthesisKernel(open - 1, close);
        for (String s : addOpen)
        {
          result.add("(" + s);
        }
      }

      return result;
    }
    else
    {
      List<String> result = new ArrayList<String>();

      List<String> addOpen = generateParenthesisKernel(open - 1, close);
      for (String s : addOpen)
      {
        result.add("(" + s);
      }

      return result;
    }
  }
}
