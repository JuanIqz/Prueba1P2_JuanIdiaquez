/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1p2_juanidiaquez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juanf
 */
public class BlockBuster {
    
    
    ArrayList <BlockBusterItem> Catalogo= new ArrayList();
    
    
    public BlockBusterItem BuscarItem(int codigo, String Tipo){
        BlockBusterItem Item = null;
        for (int i = 0; i < Catalogo.size(); i++) {
            if (Catalogo.get(i).codigo==codigo && Catalogo.get(i).toString().contains(Tipo) ) {
                 Item= Catalogo.get(i);
            }
        }
        return Item;
        
    }
    
    public void AgregarItem(int codigo, String Nombre, Double precio, Date Fecha, int tipo){
        if (tipo==1) {
            MovieItem Item= new MovieItem(codigo, Nombre, 0, Nombre);
            Catalogo.add(Item);
        }else{
            VideoGameItem Item= new VideoGameItem(codigo, Nombre, 0, "");
            Catalogo.add(Item);
        }
    }
    
    public void Rentar(int codigo,String tipoItem, int dias){
        BlockBusterItem Item = null;
        boolean bandera=true;
        for (int i = 0; i < Catalogo.size(); i++) {
            
           if (Catalogo.get(i).codigo==codigo && Catalogo.get(i).toString().contains(tipoItem) ) {
               System.out.println(Catalogo.get(i).toString());
               Item=Catalogo.get(i);
               Double precio=Item.pagoRenta(dias);
               System.out.println("Precio");
               bandera=false;
        } 
           
           
        }
        if (bandera=false) {
            System.out.println("Item no Existe");
        }
        
    }
    
}
