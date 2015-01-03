package MajorityElement;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/2/2015
 */
public class Solution
{
  public int majorityElement(int[] num)
  {
    int curr = num[0];
    int vote = 1;

    for (int i=0;i<num.length;i++)
    {
      if (curr == num[i])
      {
        vote ++;
      }
      else
      {
        vote --;

        if (vote == 0)
        {
          curr = num[i];
          vote = 1;
        }
      }
    }

    return curr;
  }
}
