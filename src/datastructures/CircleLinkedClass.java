/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author FELIX
 */
public class CircleLinkedClass <E> {
  private static class Node <E>{
     private E element;
     private Node<E> next;
     public Node(E e, Node <E> n){
     element  = e;
     next = n;
     }
     
     public E getelement(){
     
     return element; }
     public Node<E> getnext(){
     return next;
     }
     public void setnext(Node <E> n){
     next = n;
     }
 }
private Node<E> tail = null;  
private int size = 0;
public CircleLinkedClass(){};
public int size(){return size;}
public boolean isEmpty(){return size==0;}
public E first(){
if(isEmpty()){return null;}else{

return tail.getnext().getelement();
}

}
public E last(){
if(isEmpty())return null;
return tail.getelement();

}
public void rotate(){
if(tail!=null) tail=tail.getnext();
}

public void Addfirst (E e){
if(size==0){

tail = new Node<>(e,null);
tail.setnext(tail);
}
else {
Node <E> nuevo = new Node <>(e,tail.getnext());
tail.setnext(nuevo);
}

}
public void AddLast(E e){
Addfirst(e);
tail=tail.getnext();
}

public E removeFirst(){
if(isEmpty())return null;
Node <E> head = tail.getnext();
if(head==tail)tail= null;
else tail.setnext(head.getnext());
size--;
return head.getelement();

}
}
