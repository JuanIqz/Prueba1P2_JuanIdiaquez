/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1p2_juanidiaquez;

import java.util.Date;

/**
 *
 * @author juanf
 */
public class VideoGameItem extends BlockBusterItem{
    String NombreConsola;

    public String getNombreConsola() {
        return NombreConsola;
    }

    public void setNombreConsola(String NombreConsola) {
        this.NombreConsola = NombreConsola;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioRenta() {
        return PrecioRenta;
    }

    public void setPrecioRenta(double PrecioRenta) {
        this.PrecioRenta = PrecioRenta;
    }

    public Date getFechaDeAdicion() {
        return FechaDeAdicion;
    }

    public void setFechaDeAdicion(Date FechaDeAdicion) {
        this.FechaDeAdicion = FechaDeAdicion;
    }

    
    
    public VideoGameItem(int codigo, String Nombre, double PrecioRenta, String NombreConsola) {
        super(codigo, Nombre, PrecioRenta);
        this.NombreConsola=NombreConsola;
    }

    @Override
    public String toString() {
        return "BlockBusterItem{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", PrecioRenta=" + PrecioRenta + " - Game" +'}';
    }

    
    
    @Override
    public double pagoRenta(int dias) {
       double pago = PrecioRenta*dias;
       return pago;
    }
    
    
    
    
}
