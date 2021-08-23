package com.example.finalcm;

public class Usuarios {
    private String carrera;
    private Integer id;


    @Override
    public String toString() {
        return carrera;
    }

    public Usuarios() {
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuarios(String carrera, Integer id) {
        this.carrera = carrera;
        this.id = id;

    }

}
