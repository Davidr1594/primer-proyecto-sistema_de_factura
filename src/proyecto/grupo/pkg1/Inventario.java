/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.grupo.pkg1;

/**
 *
 * @author david
 */
public class Inventario {
    
    public void lista(){
        String lista[][]={{"[1]Teclado RGB L. 250.00","[2]Mouse Wireless L. 120.00","[3]Cable red 3ft L. 80.00"},
                          {"[4]Memoria Ram 8gb L.400.00","[5]HDD-1TB L.800.00","[6]Proc. I5 12th L. 9,500.00"},
                          {"[7]Cooler L.950.00","[8]CASE ATX L.2,200.00","[9]Promo-Escritorio/silla Gaming L.6,500.00"},
                          {"[10]Gaming Headset L.3,500.00","[11]Proc. RYZEN 9 L.13,800","[0]Listo(Imprimir factura)"}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <3; j++) {
                System.out.format("%-32s",lista[i][j]+" ");
                }
            System.out.println("");
            
        }      
    }

    
}
