package ValidParentheses;

import java.util.Stack;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/6/2014
 */
public class Solution
{
  public boolean isValid(String s)
  {
    if (s == null)
    {
      return true;
    }

    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++)
    {
      switch (s.charAt(i))
      {
        case '(':
          stack.push(s.charAt(i));
          break;
        case ')':
          if (stack.isEmpty() || stack.pop() != '(')
          {
            return false;
          }
          break;
        case '[':
          stack.push(s.charAt(i));
          break;
        case ']':
          if (stack.isEmpty() || stack.pop() != '[')
          {
            return false;
          }
          break;
        case '{':
          stack.push(s.charAt(i));
          break;
        case '}':
          if (stack.isEmpty() || stack.pop() != '{')
          {
            return false;
          }
          break;
      }
    }

    return stack.isEmpty();
  }
}
