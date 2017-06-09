/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domian;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author arturo
 */
public class List {

    private NodoDoble head, tail;

    public List() {
      
    }

   public void insertarInicio(Movie d) {
        NodoDoble nuevo = new NodoDoble();
        nuevo.data=d;
        if (head == null) {
            head=nuevo;
            head.nextPtr=head;
            nuevo.prevPtr=tail;
            tail=nuevo;
        } else {
            tail.nextPtr=nuevo;
            nuevo.nextPtr=head;
            nuevo.prevPtr=tail;
            tail = nuevo;
            head.prevPtr = tail;

        }
    }
   public void printList(){
       NodoDoble aux = new NodoDoble();
        aux = head;
        do {
            System.err.println(aux.data);
            aux=aux.nextPtr;    
        }while(aux!=head);
   }
}