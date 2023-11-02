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
public class MovieItem extends BlockBusterItem{

    String Estado;

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
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
    
    
    
    
    
    public MovieItem(int codigo, String Nombre, double PrecioRenta, String Estado) {
        super(codigo, Nombre, PrecioRenta);
        this.Estado=Estado;
    }

    
    
    
 

    @Override
    public String toString() {
        return "MovieItem{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", PrecioRenta=" + PrecioRenta + ", Estado="+ Estado + "- Movie" + '}';
    }

 
    @Override
    public double pagoRenta(int dias) {
       double pago=this.PrecioRenta;
        double recargo;
        String estado= this.Estado;
        String estado2= estado.toLowerCase();
        if (estado2.contains("estreno")&& dias>2) {
            recargo=50*dias;
            pago= pago+recargo;
        }else if (estado2.contains("normal")&& dias>5) {
            recargo=30*dias;
            pago= pago+recargo;
        }
        return pago;

    }
    

    
    
    
}
