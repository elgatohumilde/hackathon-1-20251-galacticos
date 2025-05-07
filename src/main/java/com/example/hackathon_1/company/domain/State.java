package com.example.hackathon_1.company.domain;

public enum State {
    ACTIVE("Activa"),
    INACTIVE("Inactiva");

    private final String descripcion;

    State(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
};
