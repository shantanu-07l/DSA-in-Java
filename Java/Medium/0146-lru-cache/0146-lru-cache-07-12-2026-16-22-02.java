class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private int capacity;

    private HashMap<Integer,Node> map;

    // Dummy head and tail
    private Node head;
    private Node tail;
    

    public LRUCache(int capacity) {
        this.capacity=capacity;
       map= new HashMap<>();

       head=new Node(0,0);
       tail=new Node(0,0);

       head.next=tail;
       tail.prev=head;
  
    }
    // Remove a node from DLL
    private void remove(Node node){
        //tail.prev = Most Recently Used
        Node prevs=node.prev;
        Node nextnode=node.next;

        prevs.next=nextnode;
        nextnode.prev=prevs;

    }
     // Insert node just before tail (Most Recently Used)
    private void insert(Node node){
        Node prevs=tail.prev;

        prevs.next=node;
        node.prev=prevs;

        node.next=tail;
        tail.prev=node;


    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        insert(node);
        return node.value;

        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){//if key alrady present update is value
            Node node=map.get(key);

            node.value=value;//update value of node
            remove(node);//if same node exist
            insert(node);
            map.put(key,node);
            return;
        }
        //if not present make new node
        Node newNode=new Node(key,value);
        insert(newNode);
        map.put(key,newNode);

        if(map.size() > capacity){
            Node lru=head.next;//head.next = Least Recently Used

            remove(lru);//delete from dll

            map.remove(lru.key);//remove from map
        }




        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */