package Controller;

import Model.InFlightServiceModel;
import Model.Passenger;

public class InFlightServiceController {

    private InFlightServiceModel serviceModel;

    public InFlightServiceController(InFlightServiceModel serviceModel) {
        this.serviceModel = serviceModel;
    }

    public void requestService(Passenger passenger) {
        serviceModel.requestService(passenger);
    }
}
