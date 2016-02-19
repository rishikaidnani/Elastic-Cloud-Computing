/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Rishika Idnani
 */
public class ThreadImplementation implements Runnable {

    private Service server;
    private static long maximumTime;

    public ThreadImplementation(Service server) {
        this.server = server;
    }

    public int generateRandomNumberForProcessing() {
        Random random = new Random();
        return 1 + random.nextInt(4);
    }

    @Override
    public void run() {
        long differenceInSeconds;
        Request request = null;
        System.out.println("Hi! I entered the run method");
        int randomNumberForOutgoingRequest = generateRandomNumberForProcessing();
        while (randomNumberForOutgoingRequest > 0) {
            randomNumberForOutgoingRequest--;
            System.out.println("Hi! I entered the while loop");
            Link link = server.getQueue().deQueue();
            if (link != null) {
                request = link.getRequest();
                request.setProcessedTime(new Date());
                differenceInSeconds = (request.getProcessedTime().getTime() - request.getGeneratedTime().getTime()) / 1000 % 60;
                if (differenceInSeconds > maximumTime) {
                    maximumTime = differenceInSeconds;
                }
                System.out.println("Request number dequed is:" + request.getRequestNumber());
                System.out.println("Server Number processing is:" + server.getServerNumber());
                int load = server.getAvailableLoad();
                load++;
                server.setAvailableLoad(load);
            }
        }
    }

    public static long getMaximumTime() {
        return maximumTime;
    }

}
