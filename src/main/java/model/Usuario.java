package model;

import jakarta.persistence.*;


@Entity
@Table(name = "estudiantes")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String carrera;
    
    @Column(nullable = false, length = 10)
    private double promedioEstudiante;

    
    public Usuario(){}
    public Usuario(String n, String c, double p) {
       this.nombre = n;
       this.carrera = c;
       this.promedioEstudiante = p;
    }

    // Getters públicos

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCarrera() {return carrera;}
    public void setCarrera(String carrera) {this.carrera = carrera;}
    
    public double getPromedioEstudiante() {return promedioEstudiante;}
    public void setPromedioEstudiante(double promedio) {this.promedioEstudiante = promedio;}
    
}