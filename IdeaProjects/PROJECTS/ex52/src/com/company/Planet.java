package com.company;

import com.company.HeavenlyBody;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyTypes() == HeavenlyBody.BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}