class LRUCache {
    class Node{
        int value;
        int key;
        Node prev;
        Node next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private HashMap<Integer, Node> map;
    private Node head;
    private Node tail;
    private int capacity;
    
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head = null;
        tail = null;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        if (node != tail){
                if (node == head){
                    head = head.next;
                }else{
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
            }
        return tail.value;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null){
            node.value = value;
            if (node != tail){
                if (node == head){
                    head = head.next;
                }else{
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
            }
        }else{
            Node newNode = new Node(key, value);
            if (capacity == 0){
                Node temp = head;
                head = head.next;
                map.remove(temp.key);
                capacity++;
            }
            if (head == null || tail == null){
                head = newNode;
            }else{
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = null;
            }
            tail = newNode;
            map.put(key, newNode);
            capacity--;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
