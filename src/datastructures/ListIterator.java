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
public interface ListIterator {
    Object next();
    boolean hasNext();
    void add(Object element);
    void remove();
    void set(Object element);
}
