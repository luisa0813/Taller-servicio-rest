package com.biblioteca.Biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import java.time.LocalDate;


@Data
@ToString
@AllArgsConstructor
@Entity
@Table(name = "libro")
public class Libro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Autor", nullable = false)
    private String autor;

    @Column(name = "Fecha Publiacion", nullable = false)
    private LocalDate fecha;

    @Column(name = "Nombre", nullable = false)
    private String nombre;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "vecesPrestadas")
    private int vecesPrestadas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;






}
