import java.util.Iterator;

public class LList<T> implements Iterable<T>{
    public Node<T> head;

    public LList(T data){
        push(data);
    }    

    public LList(){
        head = null;    
    }

    public class Node<T> {
        protected T data;
        protected Node<T> next;

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
        public Node(T data){
            this(data, null);
        }

        /**
         * @return the data
         */
        public T getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(T data) {
            this.data = data;
        }

        /**
         * @return the next
         */
        public Node<T> getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

    // Push
    public void push(T newData){
        head = new Node<T>(newData, head);
    } 

    // Delete
    public T deleteFirst(){
        Node<T> temp = head;
        head = head.next; 
        return temp.getData();
    } 

    // Search
    public Node<T> search(Node<T> L, T searchKey) {
        while (L.data != null){
            if (L.data == searchKey)
                return L;
            L = L.next;
        }
        return null;
    }

    public static void main(String args[]){
        System.out.println("working"); 
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new LListIterator();
    }

    private class LListIterator implements Iterator<T> {
        private Node<T> nextNode;

        public LListIterator() {
            nextNode = head;
        }
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return nextNode != null;
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            if (!hasNext())
                try {
                    throw new Exception();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            T data = nextNode.data;
            nextNode = nextNode.next;
            return data;
        }

    }
    

}
