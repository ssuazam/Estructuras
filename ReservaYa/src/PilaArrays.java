import java.util.Arrays;

public class PilaArrays {
    private int size;
    private Object[] pila;
    private int top;

    PilaArrays(){
        size = 10;
        pila = new Object[size];
        top = 0;
    }

    PilaArrays(int size){
        this.size = size;
        pila = new Object[size];
        top = 0;
    }

    public void push(Object element){
        if(!full()){
            pila[top] = element;
            top++;
        }else{
            System.out.println("La pila esta llena!");
        }
    }
    public Object pop(){
        Object element = 0;
        if(!empty()){
            //throw new RuntimeException("");
            top--;
            element = pila[top];
        }
        return element;
    }

    public Object peek(){
        if(!empty()){
            Object elemento = pila[pila.length-1];
            return elemento;
        }else{
            return null;
        }

    }

    public boolean full(){
        return top == size;
    }

    public boolean empty(){
        return top == 0;
    }

    public void verPila() {
        for(Object objeto : pila){
            System.out.print(objeto + " ");
        }
    }

    public int getSize() {
        return size;
    }
    public void clon(PilaArrays x, PilaArrays y){

        for(int i = 0; i< x.size; i++){
            Object elementoX = x.get(i);
            y.push(elementoX);

        }
    }
    public boolean buscarElemento(Object o){
        int indice = Arrays.asList(pila).indexOf(o);
        if(indice!=-1){
            System.out.println("El elemento se encuentra en la posicion "+ indice);
            return true;
        }else{
            System.out.println("El elemento no se encuentra en la pila");
            return false;

        }
    }


    public Object get(int i){
        Object elementoX = pila[i];
        return elementoX;
    }

    public void setPila(Object[] pila) {
        this.pila = pila;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
