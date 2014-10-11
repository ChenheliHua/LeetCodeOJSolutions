package CloneGraph;

import etc.UndirectedGraphNode;

import java.util.HashMap;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/10/2014
 */
public class Solution
{
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node)
  {
    if (node == null)
    {
      return null;
    }

    return cloneGraphKernel(node, new HashMap<UndirectedGraphNode, UndirectedGraphNode>());
  }

  private UndirectedGraphNode cloneGraphKernel(UndirectedGraphNode node,
                                               HashMap<UndirectedGraphNode, UndirectedGraphNode> map)
  {
    if (map.containsKey(node))
    {
      return map.get(node);
    }

    UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
    map.put(node, newNode);

    for (UndirectedGraphNode neighbour : node.neighbors)
    {
      newNode.neighbors.add(cloneGraphKernel(neighbour, map));
    }

    return newNode;
  }
}
