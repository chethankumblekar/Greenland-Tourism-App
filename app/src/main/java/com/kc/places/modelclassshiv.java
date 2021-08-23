package com.kc.places;

public class modelclassshiv {
    String pname,pimage,pdesc;

    public modelclassshiv() {
    }

    public modelclassshiv(String pname, String pimage, String pdesc) {
        this.pname = pname;
        this.pimage = pimage;
        this.pdesc = pdesc;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }
}
