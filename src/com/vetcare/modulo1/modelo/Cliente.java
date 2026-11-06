package com.vetcare.modulo1.modelo;

public class Cliente {
    private int idCliente;
    private String dni;
    private String nombre;
    private String telefono;

    public Cliente(int idCliente, String dni, String nombre, String telefono) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getIdCliente() { return idCliente; }
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
}