/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *
 * @author FELIX
 */
public class LinkedClass {
    private Node first;


    class Node{
    public Object data;
    public Node next;
    }
    public LinkedClass(){first = null;}
    public Object GetFirst(){
    if(first==null){
    throw new NoSuchElementException();
    }
    return first.data;}
    public void addFirst(Object element){
    Node newnode = new Node();
    newnode.data= element;
    newnode.next= first;
    first=newnode; 
    }
    
 public Object removeFirst(){
 if(first==null){throw new NoSuchElementException();}
 Object element =first.data;
 first=first.next;
 return element;
 }
 public ListIterator listIterator(){
 
 return new LinkedListIterator();}
 
 class LinkedListIterator implements ListIterator{
     private Node position;
     private Node previous;
     private boolean isafter;
     public LinkedListIterator(){
     position = null;
     previous= null;
     isafter = false;
     }

        @Override
        public boolean hasNext() {
if(position==null){
return first!=null;
} else{ return position !=null;}
        }

        @Override
        public Object next() {
             if (!hasNext()) { throw new NoSuchElementException(); }
            previous = position;
             isafter = true;
                     if (position == null) {
                     position = first;                    
                     }else{
                     position=position.next;
                     }
        return position.data;
        }

        @Override
        public boolean hasPrevious() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object previous() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int nextIndex() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int previousIndex() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void remove() {
          if(!isafter){
          
          throw new IllegalStateException();
          }
          if(position == first){
          removeFirst();
          }else{
          previous.next=position.next;
          }
          position=previous;
          isafter=false;
        }

        @Override
        public void set(Object e) {
            if(!isafter){throw new IllegalStateException();}
            position.data=e;
        }

        @Override
        public void add(Object e) {
            if(position==null){
            addFirst(e);
            position=first;
            }else{
            Node nuevo  = new Node();
            nuevo.data=e;
            nuevo.next=position.next;
            position.next=nuevo;
            position=nuevo;
            
            }
            isafter=false;
        }

       
    }
}

