package com.company;

public class PassengerType extends VehicleTypeByPurpose {
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }

}
