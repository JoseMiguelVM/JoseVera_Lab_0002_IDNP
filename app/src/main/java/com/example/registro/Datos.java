package com.example.registro;
import java.io.Serializable;

// Creando clase Datos con atributos privados del registro
public class Datos implements Serializable{
    private String DatoApellidoPaterno, DatoApellidoMaterno, DatoNombres, DatosFechaNacimiento, DatosColegio, DatosCarrera;
    Datos(){
        DatoApellidoPaterno = DatoApellidoMaterno = DatoNombres = DatosFechaNacimiento = DatosColegio = DatosCarrera = "";
    }
    // Creacion de un constructor
    Datos(String DatoApellidoPaterno, String DatoApellidoMaterno,String DatoNombres,String DatosFechaNacimiento,String DatosColegio,String DatosCarrera){
        this.DatoApellidoPaterno = DatoApellidoPaterno;
        this.DatoApellidoMaterno = DatoApellidoMaterno;
        this.DatoNombres = DatoNombres;
        this.DatosFechaNacimiento = DatosFechaNacimiento;
        this.DatosColegio = DatosColegio;
        this.DatosCarrera = DatosCarrera;
    }

    // Metodos get de todos los atributos
    public String getDatoApellidoPaterno() {
        return DatoApellidoPaterno;
    }

    public String getDatoApellidoMaterno() {
        return DatoApellidoMaterno;
    }

    public String getDatoNombres() {
        return DatoNombres;
    }

    public String getDatosFechaNacimiento() {
        return DatosFechaNacimiento;
    }

    public String getDatosColegio() {
        return DatosColegio;
    }

    public String getDatosCarrera() {
        return DatosCarrera;
    }

    // Creando toString para vista de datos de los objetos de forma clara
    @Override
    public String toString() {
        return "Apellido Paterno: '" + DatoApellidoPaterno + '\'' +
                ", Apellido Materno: '" + DatoApellidoMaterno + '\'' +
                ", Nombres: '" + DatoNombres + '\'' +
                ", Fecha de Nacimiento: '" + DatosFechaNacimiento + '\'' +
                ", Colegio: '" + DatosColegio + '\'' +
                ", Carrera: '" + DatosCarrera + '\'';
    }
}
