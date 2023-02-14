package com.tema4;

public class SmartPhone extends SmartDevice{
    private String SO;
    private double len;
    private String Camera;

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public SmartPhone(){
        super();
        this.setLen(8);
        this.setCamera("Standard");
        this.setSO("Unknown");
    }

    public SmartPhone(String SO, double len, String Camera,String screen,
                      String status, String CPU, long time, long date){
        super(screen,status,CPU,time,date);
        this.setSO(SO);
        this.setLen(len);
        this.setCamera(Camera);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "SO='" + SO + '\'' +
                ", len=" + len +
                ", Camera='" + Camera + '\'' +
                "} " + super.toString();
    }
}
