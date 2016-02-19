/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Rishika Idnani
 */
public class Request {

    private int requestNumber;
    private Boolean requestDispatched;
    private Date generatedTime;
    private Date processedTime;

    public Request(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public Boolean getRequestDispatched() {
        return requestDispatched;
    }

    public void setRequestDispatched(Boolean requestDispatched) {
        this.requestDispatched = requestDispatched;
    }

    public Date getGeneratedTime() {
        return generatedTime;
    }

    public void setGeneratedTime(Date generatedTime) {
        this.generatedTime = generatedTime;
    }

    public Date getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(Date processedTime) {
        this.processedTime = processedTime;
    }

}
