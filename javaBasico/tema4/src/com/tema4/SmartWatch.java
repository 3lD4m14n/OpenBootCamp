package com.tema4;

public class SmartWatch extends SmartDevice{
    private String SensorName;
    private double len;
    private String model;

    public String getSensorName() {
        return SensorName;
    }

    public void setSensorName(String sensorName) {
        SensorName = sensorName;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SmartWatch(){
        super();
        this.setLen(2);
        this.setModel("Standard");
        this.setSensorName("Standard");
    }

    public SmartWatch(String screen, String status, String CPU, long time,
                      long date, String SensorName, double len, String model){
        super(screen,status,CPU,time,date);
        this.setLen(len);
        this.setSensorName(SensorName);
        this.setModel(model);
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "SensorName='" + SensorName + '\'' +
                ", len=" + len +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }
}
