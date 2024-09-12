package Controllers;

import Dto.TicketGenerateRequestDto;
import Dto.TicketGenerateResponseDto;
import Exceptions.NoSpotException;
import Model.Ticket;
import Model.VehicleType;
import Service.TicketService;

import java.util.Date;

public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService  = ticketService;
    }

    public TicketGenerateResponseDto generateTicket(TicketGenerateRequestDto ticketGenerateRequestDto){
        try{
            Integer gateId = ticketGenerateRequestDto.getGateId();
            VehicleType vehicleType = ticketGenerateRequestDto.getVehicleType();
            Date entryTime = ticketGenerateRequestDto.getEntryTime();
            String vehicleNumber= ticketGenerateRequestDto.getVehicleNumber();

            Ticket ticket  = ticketService.generateTicket(gateId,vehicleType,entryTime,vehicleNumber);

        } catch (NoSpotException noSpotException){

        }
    }





}
