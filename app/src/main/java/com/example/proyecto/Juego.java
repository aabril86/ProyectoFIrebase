package com.example.proyecto;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Juego {
    @PrimaryKey(autoGenerate = true)
            int id;

    String titulo;
    String year;
    String desarrollador;
    String descripcion;
    String imagen;
    String plataforma;
    String banner;

    public Juego(String titulo, String year, String desarrollador, String descripcion, String plataforma, String imagen, String banner) {
        this.titulo = titulo;
        this.year = year;
        this.desarrollador = desarrollador;
        this.descripcion = descripcion;
        this.plataforma = plataforma;
        this.imagen = imagen;
        this.banner = banner;
    }

    public Juego(String titulo, String anyo, String plataforma, String imagen) {
    }
}
