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
    public static void main(String[] args) {
        Pilha p = new Pilha();
        int a = 3;
        
        while (a != 0) {
            int r = a % 2;
            p.push(r);
            a /= 2;
        }
        while (!p.isEmpty()) {            
            System.out.println(p.pop());
        }
        
    }
    
}
