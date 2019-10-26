/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joel
 */
public class Usuario {
    public int idUsuario;
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String calle;
    public String colonia;
    public int codigoPostal;
    public String lugar;
    public String estado;
    public String pais;
    public String telefonoFijo;
    public String teleonoMovil;
    public String correoElectronico;
    public String rfc;
    public String tipoUsuario;
    public String nombreUsuario;
    public String contrasena;

    public Usuario(int idUsuario, String nombre, String apellidoPaterno, String apellidoMaterno, String calle, String colonia, int codigoPostal, String lugar, String estado, String pais, String telefonoFijo, String teleonoMovil, String correoElectronico, String rfc, String tipoUsuario, String nombreUsuario, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.lugar = lugar;
        this.estado = estado;
        this.pais = pais;
        this.telefonoFijo = telefonoFijo;
        this.teleonoMovil = teleonoMovil;
        this.correoElectronico = correoElectronico;
        this.rfc = rfc;
        this.tipoUsuario = tipoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public Usuario(String tipoUsuario, String nombreUsuario, String contrasena) {
        this.tipoUsuario = tipoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    
}
