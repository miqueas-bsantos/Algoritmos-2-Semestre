
package algoritimos;



public class Pilha {
    private int topo;
    private Object dados[];

    public Pilha() {
        topo = -1;
        dados = new Object[50];
    }
    
    
    public boolean isFull(){
        return (topo == dados.length-1);
    }
    
    public boolean isEmpty(){
        return(topo == -1);
    }
    
    public void push(Object x){
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        }else{
            System.out.println("Pilha Vazia");
        }
    }
    
    public Object pop(){
        if (!isEmpty()) {
            Object x = dados[topo];
            topo--;
            return x;
        }else{
            System.out.println("Pilha Vazia");
            return null;
        }
    }
    
    public Object top(){
        if (!isEmpty()) {
            return dados[topo];
        }else{
            System.out.println("Pilha Vazia");
            return null;
        }
    }
    
    
}
