/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimos;

/**
 *
 * @author Miqueas Santos
 */
public class Fila {
    
    Object[] fila;
    int fim;
    int inicio;
    
    public Fila(){
        fila = new Object[5];
        inicio = 0;
        fim = 0;
    }

    
    
    public boolean vazia(){
        return (fim==inicio);
    }
    
    public boolean cheia (){
        return ((fim+1) % fila.length == inicio);
    }
    
    public Object desempilhar(){
        if (vazia()) {
            System.out.println("Fila esta Vazia");
            return null;
        }else{
            Object aux = fila[inicio];
            inicio++;
            if (inicio==fila.length) {
                inicio = 0;
            }
            return aux;
        }
    }
    
    public void empilhar(Object x){
        if (cheia()) {
            System.out.println("Fila esta Cheia");
        }else{
            fila[fim] = x;
            fim++;
            if (fim == fila.length) {
                fim = 0;
            }
        }
    }
    
    public void furarFila(Object n){
        if (!cheia()) {
            if (inicio==0) {
                inicio = fila.length-1;
                fila[inicio] = n;
            }
        }
    }
    
}
