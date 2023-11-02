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
abstract class BlockBusterItem {
    
    int codigo;
    String Nombre;
    double PrecioRenta;
    Date FechaDeAdicion;

    public BlockBusterItem(int codigo, String Nombre, double PrecioRenta) {
        this.codigo = 0;
        this.Nombre = "";
        this.PrecioRenta = 0;
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

    @Override
    public String toString() {
        return "BlockBusterItem{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", PrecioRenta=" + PrecioRenta + '}';
    }
    
    public abstract double pagoRenta(int dias);
        
    
}
