public class CloneGraphBFS {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return node;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        queue.offer(node);
        map.put(node,null);
        
        while (!queue.isEmpty()){
            UndirectedGraphNode curr = queue.poll();
            UndirectedGraphNode copy = new UndirectedGraphNode(curr.label);
            map.put(curr,copy);
            for (UndirectedGraphNode neighbor : curr.neighbors){
            if (!map.containsKey(neighbor)){
                queue.offer(neighbor);
                map.put(neighbor, null);
            }
            }
            
        }
        for (UndirectedGraphNode ori : map.keySet()){
            UndirectedGraphNode cop = map.get(ori);
            for (UndirectedGraphNode nei : ori.neighbors){
               cop.neighbors.add(map.get(nei));
            }
        }
        return map.get(node);
        
    }
    }
