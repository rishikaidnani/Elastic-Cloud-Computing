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
public class Service {

    private Queue queue;
    private LinkedList linkedList;
    private Boolean isAvailable;
    private int availableLoad;
    private int serverNumber;
    private static int noOfServersUsed;

    public Service(int availableLoad, int serverNumber) {
        isAvailable = true;
        this.linkedList = new LinkedList();
        queue = new Queue(linkedList);
        this.availableLoad = availableLoad;
        setServerNumber(serverNumber);
        noOfServersUsed++;
    }

    public Boolean getIsAvailable() {
        if (availableLoad > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Queue getQueue() {
        return queue;
    }

    public int getAvailableLoad() {
        return availableLoad;
    }

    public void setAvailableLoad(int availableLoad) {
        this.availableLoad = availableLoad;
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public int getServerNumber() {
        return serverNumber;
    }

    public void setServerNumber(int serverNumber) {
        this.serverNumber = serverNumber;
    }

    public static int getNoOfServersUsed() {
        return noOfServersUsed;
    }

}
