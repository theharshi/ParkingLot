package Repository;

import Model.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepo {
    Map<Long, Vehicle> vehicleMap = new HashMap<>();

    public Optional<Vehicle> getVehicleById(Long vehicleId){
        if(vehicleMap.containsKey(vehicleId)){
            return Optional.of(vehicleMap.get(vehicleId));
        }
        return Optional.empty();
    }
}
