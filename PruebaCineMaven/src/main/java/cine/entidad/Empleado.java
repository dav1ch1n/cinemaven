package cine.entidad;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_empleado;
    private String nombre;
    private String puesto;
    private String tipo_jornada;
    private String email;
    private String telefono;
    private LocalDate fecha_contratacion;
    private double salario_hora;
    private boolean activo;

    public Empleado() {}
    public Empleado(Long id_empleado, boolean activo, LocalDate fecha_contratacion, String tipo_jornada, String puesto, String nombre, String telefono, String email, double salario_hora) {
        this.id_empleado = id_empleado;
        this.activo = activo;
        this.fecha_contratacion = fecha_contratacion;
        this.tipo_jornada = tipo_jornada;
        this.puesto = puesto;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.salario_hora = salario_hora;
    }

    public Long getId_empleado() {
        return id_empleado;
    }
    public void setId_empleado(Long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_jornada() {
        return tipo_jornada;
    }
    public void setTipo_jornada(String tipo_jornada) {
        this.tipo_jornada = tipo_jornada;
    }

    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha_contratacion() {
        return fecha_contratacion;
    }
    public void setFecha_contratacion(LocalDate fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public double getSalario_hora() {
        return salario_hora;
    }
    public void setSalario_hora(double salario_hora) {
        this.salario_hora = salario_hora;
    }

    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
