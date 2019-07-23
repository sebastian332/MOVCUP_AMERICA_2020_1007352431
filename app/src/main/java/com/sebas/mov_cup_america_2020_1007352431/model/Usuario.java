package com.sebas.mov_cup_america_2020_1007352431.model;

public class Usuario {
    private String usuario;
    private String contra;
    private String contra2;
    private String correo;

    public Usuario() {
    }

    public Usuario(String usuario, String contra, String contra2, String correo) {
        this.usuario = usuario;
        this.contra = contra;
        this.contra2 = contra2;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getContra2() {
        return contra2;
    }

    public void setContra2(String contra2) {
        this.contra2 = contra2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
