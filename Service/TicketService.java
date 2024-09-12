package Service;

import Exceptions.NoSpotException;
import Model.ParkingSpot;
import Model.Ticket;
import Model.VehicleType;

import java.util.Date;

public class TicketService {

    public Ticket generateTicket(Integer gateId, VehicleType vehicleType, Date entryTime, String vehicleNumber) throws NoSpotException {

    }

    public ParkingSpot getParkingSpot(Integer gateId, VehicleType vehicleType, Date entryTime, String vehicleNumber){
        return null;
    }
}
