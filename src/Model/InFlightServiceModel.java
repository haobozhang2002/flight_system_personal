package Model;

import View.InFlightServiceUI;

import java.util.List;

public class InFlightServiceModel {

    private InFlightServiceUI serviceUI;
    private List<Passenger> passengers;

    public InFlightServiceModel(List<Passenger> passengers, InFlightServiceUI serviceUI) {
        this.serviceUI = serviceUI;
        this.passengers = passengers;
    }

    public void requestService(Passenger passenger) {
        serviceUI.notifyService(passenger);
    }
}
