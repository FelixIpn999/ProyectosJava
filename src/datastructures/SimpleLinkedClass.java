/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author FELIX
 * @param <E>
 */
public class SimpleLinkedClass <E> {
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
 
 private Node<E> head = null;
 private Node<E> tail = null;
 private int size = 0;
 public SimpleLinkedClass(){}
 public int size(){return size;}
 public boolean isEmpty(){return size==0;}
 public E first(){
 if(isEmpty()){return null;}
 else{
 return head.getelement();
 }
 
 }
 public E last(){
 
 if(isEmpty()) return null;
 return tail.getelement();
 
 
 }
 
 public void Add(E e){
 head  = new Node<>(e,head);
 if(size==0){
 tail=head;
 }
 size++;
 }
 public void AddLast(E e){
 Node <E> nuevo = new Node<> (e , null);
 if(isEmpty()){
 head=nuevo;
 }else {
 tail.setnext(nuevo);
 tail=nuevo;
 size++;
 }
 
 }
 
 public E removefirst(){
 if(isEmpty()) return null;
 E answer = head.getelement();
 head = head.getnext();
 size--;
 if(size==0)
     tail =null;
 return answer;
 
 }
 
 public void impresion(){

 if(this.head==null && this.tail==null){System.out.println("Lista Vacia");
 }else{
 
 Node<E> nodoq = this.head;
 while(nodoq!=null){
 
 System.out.println(nodoq.getelement().toString());
 nodoq= nodoq.getnext();
 }
 
 }

 }
}
