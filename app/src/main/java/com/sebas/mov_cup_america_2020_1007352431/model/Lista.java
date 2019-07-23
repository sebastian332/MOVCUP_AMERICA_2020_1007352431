package com.sebas.mov_cup_america_2020_1007352431.model;

import android.widget.ImageView;

public class Lista {

private String ima1;
private String equipo1;
private  String equipo2;
private String ima2;
private String fecha;

    public Lista() {
    }

    public Lista(String ima1, String equipo1, String equipo2, String ima2, String fecha) {
        this.ima1 = ima1;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.ima2 = ima2;
        this.fecha = fecha;
    }

    public String getIma1() {
        return ima1;
    }

    public void setIma1(String ima1) {
        this.ima1 = ima1;
    }

    public String getIma2() {
        return ima2;
    }

    public void setIma2(String ima2) {
        this.ima2 = ima2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }



    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
