package com.example.davidfresh.tiendamascotas.models;

/**
 * Created by Davidfresh on 24/03/15.
 */
public class perros extends aves {

    private Integer id;
    private String raza;
    private String precio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
