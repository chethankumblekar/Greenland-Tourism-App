package com.kc.places;

public class modelclass {
    String dname, dimage;

    public modelclass() {
    }

    public modelclass(String dname, String dimage) {
        this.dname = dname;
        this.dimage = dimage;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDimage() {
        return dimage;
    }

    public void setDimage(String dimage) {
        this.dimage = dimage;
    }
}
