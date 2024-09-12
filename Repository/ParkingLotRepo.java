package Repository;

import Model.Gate;
import Model.ParkingFloor;
import Model.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepo {
    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();

    public Optional<ParkingLot> getParkingLotByGateId(Long gateId){
        for( ParkingLot parkingLot : parkingLotMap.values()){
            for (ParkingFloor parkingFloor: parkingLot.getParkingFloorList()){
                for( Gate gate : parkingFloor.getGateList()){
                    if(gate.getId().equals(gateId)){
                        return Optional.of(parkingLot);
                    }
                }
            }
        }
        return Optional.empty();
    }
}
