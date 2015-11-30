
package algoritimos;



public class Pilha {
    private int topo;
    private int dados[];

    public Pilha() {
        topo = -1;
        dados = new int[50];
    }
    
    
    public boolean isFull(){
        return (topo == dados.length-1);
    }
    
    public boolean isEmpty(){
        return(topo == -1);
    }
    
    public void push(int x){
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        }else{
            System.out.println("Pilha Cheia");
        }
    }
    
    public int pop(){
        if (!isEmpty()) {
            int x = dados[topo];
            topo--;
            return x;
        }else{
            System.out.println("Pilha Vazia");
            return 0;
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
