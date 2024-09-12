package Repository;

import Model.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepo {

    Map<Long, Gate> gateMap = new HashMap<>();

    public Optional<Gate> getGateById(Integer id){
        if(gateMap.containsKey(id)){
            return Optional.of(gateMap.get(id));
        }
        return Optional.empty();
    }
}
