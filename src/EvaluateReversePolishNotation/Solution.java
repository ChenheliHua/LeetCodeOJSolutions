package EvaluateReversePolishNotation;

import java.util.Stack;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/20/2014
 */
public class Solution
{
  public int evalRPN(String[] tokens)
  {
    if (tokens == null || tokens.length == 0)
    {
      return 0;
    }

    Stack<Integer> numStack = new Stack<Integer>();

    for (String s : tokens)
    {
      if (isOperand(s))
      {
        int b = numStack.pop();
        int a = numStack.pop();
        numStack.push(compute(a, b, s));
      }
      else
      {
        numStack.push(Integer.parseInt(s));
      }
    }

    return numStack.pop();
  }

  private boolean isOperand(String str)
  {
    return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
  }

  private int compute(int a, int b, String operand)
  {
    switch (operand.toCharArray()[0])
    {
      case '+':
        return a + b;
      case '-':
        return a - b;
      case '*':
        return a * b;
      case '/':
        return a / b;
      default: // Shouldn't happen.
        return 0;
    }
  }
}
