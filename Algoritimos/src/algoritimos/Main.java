/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimos;



/**
 *
 * @author miqueas.bsantos
 */
public class Main {
    
    static int soma(Pilha p, int n){
        int aux = p.pop();
        if (n < 0)
            return 0;
        return aux + soma(p, n-1);
    }
    
    static int mult(Pilha p, int n){
        int aux = p.pop();
        if (aux == 0)
            return 1;
        return aux * mult(p, n-1);
    }
    
    public static void main(String[] args) {
      
        String a = "5 9 *";
        String[] b = a.split(" ");
        
        System.out.println(b.length);
        Pilha p = new Pilha();
        String operando = "123456789";
        
         for (int i = 0; i < b.length; i++) {
            if ((operando).contains(b[i])) {
                p.push(Integer.parseInt(b[i]));
            }else if("+".contains(b[i])){
               p.push(soma(p, 2));
            }else if("*".contains(b[i])){
               p.push(mult(p, 2));
            }
            
         }
        
        
        while (!p.isEmpty()) {            
            System.out.println(p.pop());
        }
      
    }
    
}
