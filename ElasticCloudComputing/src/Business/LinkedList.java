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
public class LinkedList {

    private Link first;
    private Link last;

    public void addLast(Request request) {
        Link newLink = new Link(request);
        if (first == null) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public Link removeFirst() {
        Link temp = null;

        if (first != null) {
            temp = first;
            if (first.next == null) {
                last = null;
            }
            first = first.next;
        }
        return temp;
    }
}
