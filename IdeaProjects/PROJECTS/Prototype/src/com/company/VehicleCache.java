package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCache {
    private final Map<String, Vehicle> vehicleMap = new HashMap<>();

    public VehicleCache() {
        Car car = new Car("Bugatti", "Chiron", "Blue", 261);
        vehicleMap.put("Bugatti Chiron", car);
    }

    public Vehicle get(String key) {
        return vehicleMap.get(key).clone();
    }


}
