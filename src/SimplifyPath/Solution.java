package SimplifyPath;

import java.util.LinkedList;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/31/2014
 */
public class Solution
{
  public String simplifyPath(String path)
  {
    String[] dirs = path.split("/");

    LinkedList<String> stack = new LinkedList<String>();

    for (String dir : dirs)
    {
      if (dir.equals("."))
      {
        // Do nothing
      }
      else if (dir.equals(".."))
      {
        if (!stack.isEmpty())
        {
          stack.removeLast();
        }
      }
      else if (dir.length() > 0)
      {
        stack.addLast(dir);
      }
    }

    StringBuilder sb = new StringBuilder();

    for (String dir : stack)
    {
      sb.append("/");
      sb.append(dir);
    }

    if (sb.length() == 0)
    {
      return "/";
    }
    else
    {
      return sb.toString();
    }
  }
}
