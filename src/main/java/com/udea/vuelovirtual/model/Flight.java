package com.udea.vuelovirtual.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name= "flight")
public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFlight")
    private Long idFlight;

    @Column(name = "nombreavion", nullable = false, length = 80)
    private @NotNull String nombreAvion;

    @Column(name = "numerovuelo", nullable = false, length = 80)
    private @NotNull String numeroVuelo;

    @Column(name = "origen", nullable = false, length = 80)
    private @NotNull String origen;

    @Column(name = "destino", nullable = false, length = 80)
    private @NotNull String destino;

    @Column(name = "capacidad", nullable = false, length = 80)
    private @NotNull String capacidad;

    @Column(name = "rating", nullable = false, length = 80)
    @Min(value = 1, message = "Id should be more or than equal 1")
    @Max(value = 5, message = "Id should be more or than equal 5")
    private @NotNull Long rating;

    @Column(name = "planvuelo", nullable = false, length = 80)
    private @NotNull String planVuelo;

    private boolean cumplido;

    public Flight(Long idFlight, boolean cumplido, String planVuelo, String capacidad, Long rating, String destino, String origen, String nombreAvion, String numeroVuelo) {
        this.idFlight = idFlight;
        this.cumplido = cumplido;
        this.planVuelo = planVuelo;
        this.capacidad = capacidad;
        this.rating = rating;
        this.destino = destino;
        this.origen = origen;
        this.nombreAvion = nombreAvion;
        this.numeroVuelo = numeroVuelo;
    }

    public Flight() {
    }

    public Long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Long idFlight) {
        this.idFlight = idFlight;
    }

    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public String getPlanVuelo() {
        return planVuelo;
    }

    public void setPlanVuelo(String planVuelo) {
        this.planVuelo = planVuelo;
    }

    public boolean isCumplido() {
        return cumplido;
    }

    public void setCumplido(boolean cumplido) {
        this.cumplido = cumplido;
    }
}
