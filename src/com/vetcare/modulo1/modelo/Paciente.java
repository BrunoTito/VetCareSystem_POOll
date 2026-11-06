package com.vetcare.modulo1.modelo;

public class Paciente {
    private int idPaciente;
    private String nombre;
    private String especie;
    private String raza;
    private double peso;
    private Cliente cliente;

    public Paciente(int idPaciente, String nombre, String especie, String raza, double peso, Cliente cliente) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.cliente = cliente;
    }

    public int getIdPaciente() { return idPaciente; }
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public String getRaza() { return raza; }
    public double getPeso() { return peso; }
    public Cliente getCliente() { return cliente; }
}