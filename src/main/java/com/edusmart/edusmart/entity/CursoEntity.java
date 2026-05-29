package com.edusmart.edusmart.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cursos_base")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;

    @Column(length = 120, unique = true, nullable = false)
    private String nombre_curso;

    private BigDecimal precio_usd;
    private Integer horas_duracion;


    public CursoEntity() {}


    public Long getId_curso() { return id_curso; }
    public void setId_curso(Long id_curso) { this.id_curso = id_curso; }

    public String getNombre_curso() { return nombre_curso; }
    public void setNombre_curso(String nombre_curso) { this.nombre_curso = nombre_curso; }

    public BigDecimal getPrecio_usd() { return precio_usd; }
    public void setPrecio_usd(BigDecimal precio_usd) { this.precio_usd = precio_usd; }

    public Integer getHoras_duracion() { return horas_duracion; }
    public void setHoras_duracion(Integer horas_duracion) { this.horas_duracion = horas_duracion; }
}