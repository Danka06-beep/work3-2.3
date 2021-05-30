package com.company;

public class VehicleType {
    protected String attribute;

    public VehicleType (){

    }

    public VehicleType (String attribute){
        this.attribute = attribute;
    }
    public String getAttributeOfType() {
        return attribute;
    }
    public String getTypeName() {
        return "Some vehicle type name";
    }

}
