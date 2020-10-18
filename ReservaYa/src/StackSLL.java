public class StackSLL<T>{

    public static class Nodo<T>{
        public T element;
        public Nodo<T> next;
        public Nodo(T e, Nodo<T> n){
            element = e;
            next = n;
        }
        public T getElement(){
            return element;
        }
        public Nodo<T> getNext(){
            return next;
        }
        public void setNext(Nodo<T> n){
            next = n;
        }
    }
    public Nodo<T> head = null;
    public Nodo<T> tail = null;
    public int size = 0;
    public StackSLL(){};

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;

    }
    public T peek(){
        if(!isEmpty()){
            return head.getElement();
        }else{
            return null;
        }
    }
    public T last(){
        if(!isEmpty()){
            return tail.getElement();
        }else{
            return null;
        }
    }
    public void push(T e){
        head = new Nodo<>(e, head);
        if (size == 0){
            tail = head;
        }
        size ++;

    }
    public T pop(){
        if(!isEmpty()){
            T element = head.getElement();
            head = head.getNext();
            size--;

            if(size==0){
                tail = null;
            }

            return element;
        }else{
            return null;
        }
    }
    public void reverseSLL(){
        if(size<=1){

        }else if(size == 2){
            tail.setNext(head);
            head = tail;
            tail = head.getNext();
            tail.setNext(null);
        }else{
            Nodo<T> actual = head;
            Nodo<T> actualNext = head.getNext();
            Nodo<T> actualDNext = actualNext.getNext();
            tail = head;
            while(actualNext !=null){
                actualNext.setNext(actual);
                actual = actualNext;
                actualNext = actualDNext;
                if(actualDNext != null){
                    actualDNext = actualDNext.getNext();

                }
            }   tail.setNext(null);
                head = actual;
        }



    }
    public void clon(StackSLL<T> x, StackSLL<T> y){
        x.reverseSLL();
        Nodo<T> actual = x.head;
        Nodo<T> previous = x.head;

        while(actual != null){
            previous = actual;
            T e = actual.getElement();
            y.push(e);
            actual = actual.getNext();

        }
    }

    public boolean buscarElemento(T e){
        Nodo<T> actual = head;
        Nodo<T> previous = head;
        int pos = 0;
        while(actual != null && actual.getElement() != e){
            previous = actual;
            actual = actual.getNext();
            pos++;
        }if(actual == null){
            System.out.println("No se encontró el elemento: "+ e);
            return false;
        }else{
            System.out.println("El elemento se encuentra en la posicion: " + pos);
            return true;
        }

    }
}
