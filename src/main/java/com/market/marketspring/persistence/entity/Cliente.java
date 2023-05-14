package com.market.marketspring.persistence.entity;

import jakarta.persistence.*;

import java.text.DecimalFormat;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(name = "id_cliente")
    private Integer id;
    private String nombre;
    private String apellido;
    private Double celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


}
