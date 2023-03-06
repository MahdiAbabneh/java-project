package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Car("car_brand", "car_model", "car_color", 300),
        );

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }

        copyList.forEach(System.out::println);

        System.out.println("=======================================");

        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);
        System.out.println(registry.get("car_brand car_model"));

    }
    }
}
