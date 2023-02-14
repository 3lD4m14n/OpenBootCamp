package com.tema4;

public abstract class SmartDevice {
    private String screen;
    private String status;
    private String CPU;
    private long time;
    private long date;

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public SmartDevice(){
        setCPU("Standard");
        setDate(0);
        setScreen("Standard");
        setTime(0);
        setStatus("On");
    }

    public SmartDevice(String screen, String status, String CPU, long time, long date) {
        this.setScreen(screen);
        this.setStatus(status);
        this.setCPU(CPU);
        this.setTime(time);
        this.setDate(date);
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "screen='" + screen + '\'' +
                ", status='" + status + '\'' +
                ", CPU='" + CPU + '\'' +
                ", time=" + time +
                ", date=" + date +
                '}';
    }
}
