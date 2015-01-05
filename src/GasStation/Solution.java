package GasStation;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/4/2015
 */
public class Solution
{
  public int canCompleteCircuit(int[] gas, int[] cost)
  {
    if (gas == null ||
      gas.length == 0 ||
      cost == null ||
      cost.length == 0)
    {
      return -1;
    }

    int i;
    int start = 0;
    int tank = 0;
    int totalDiff = 0;

    for (i = 0; i < gas.length; i++)
    {
      if (tank < 0)
      {
        start = i;
        tank = 0;
      }

      totalDiff += gas[i] - cost[i];
      tank += gas[i] - cost[i];
    }

    return (tank < 0 || totalDiff < 0) ? -1 : start;
  }
}
