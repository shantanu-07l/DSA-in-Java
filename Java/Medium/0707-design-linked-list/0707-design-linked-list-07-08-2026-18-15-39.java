class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;

        }
    }
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
       head=null;
       tail=null;
       size=0;
 
    }
    
    public int get(int index) {
        if(index<0 || index>=size || head==null){
            return -1;
        }
        Node temp=head;
        int i=0;
        while(i<index){
            temp=temp.next;
            i++;
        }
        return temp.val;
 
    }
    
    public void addAtHead(int val) {
        if(head==null){
            Node newNode=new Node(val);
            size++;
            head=tail=newNode;
            return;
        
        }
        Node newNode=new Node(val);
        size++;
        newNode.next=head;
        head=newNode;
        
    }
    
    public void addAtTail(int val) {
        if(head==null){
            Node newNode=new Node(val);
            size++;
            head=tail=newNode;
            return;
        }
        Node newNode=new Node(val);
        size++;
        tail.next=newNode;
        tail=newNode;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;

        }
        Node newNode=new Node(val);
        // if add at last index+1;means your size of node
        if(index==size){
            addAtTail(val);
            return;
        }
        Node prev=head;
        int i=0;
        while(i<index-1){
            prev=prev.next;
            i++;
        }
        
        size++;
        newNode.next=prev.next;
        prev.next=newNode;

        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            //beacuse only 1 node and also we delete it then need tail=null
            if(head==null){
                tail=null;
            }
            return;
        }
       
        int i=0;
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        if(size==index+1){
            temp.next=null;
            tail=temp;
            size--;
            return;
        }
        temp.next=temp.next.next;
        size--;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */