/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Rishika Idnani
 */
public class Queue {

    private LinkedList linkedList;

    public Queue(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public Link deQueue() {
        return linkedList.removeFirst();
    }
}
