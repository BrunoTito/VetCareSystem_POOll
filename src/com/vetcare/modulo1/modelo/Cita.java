package com.vetcare.modulo1.modelo;

import java.time.LocalDateTime;

public class Cita {
    private int idCita;
    private LocalDateTime fechaHora;
    private String motivo;
    private String estado;
    private Paciente paciente;

    public Cita(int idCita, LocalDateTime fechaHora, String motivo, String estado, Paciente paciente) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = estado;
        this.paciente = paciente;
    }

    public int getIdCita() { return idCita; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public String getMotivo() { return motivo; }
    public String getEstado() { return estado; }
    public Paciente getPaciente() { return paciente; }
    public void setEstado(String estado) { this.estado = estado; }
}