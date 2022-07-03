package View;

import Model.Passenger;

public class InFlightServiceUI {

    public void notifyService(Passenger passenger) {
        System.out.println(passenger.getSeatNumber() + " calls for service.");
    }
}
