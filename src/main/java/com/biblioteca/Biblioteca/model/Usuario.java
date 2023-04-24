package com.biblioteca.Biblioteca.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Cedula", length = 15, nullable = false)
    private int cedula;


    @Column(name = "Nombre", nullable = false)
    private String nombre;


    @Column(name = "Fecha Nacimiento")
    private LocalDate fechaNacimiento;

    /*@OneToMany(mappedBy = "usuario")
    private List<Libro> libros ;*/





}
