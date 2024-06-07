
package proyecto.grupo.pkg1;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class ProyectoGrupo1 {


    public static void main(String[] args) {
        Inventario Inv = new Inventario();
        
        ArrayList listadoProductos=new ArrayList();
        ArrayList listadoPrecios=new ArrayList();
        ArrayList listadoCantidad=new ArrayList();
        ArrayList listadoPreciounitario=new ArrayList();
        
        LocalDate date = LocalDate.now();
        
        NumberFormat fn = NumberFormat.getInstance();
        fn.setGroupingUsed(true); 
        fn.setMaximumFractionDigits(2); 
        fn.setMinimumFractionDigits(2); 
        
        Scanner tc= new Scanner (System.in);
        
        String nc;
        String rtn;
        
        System.out.println("|             *******Bienvenido al sistema de facturacion*******              |");
        System.out.println("|_____________________________________________________________________________|");
        System.out.print("\n\nIngrese el nombre del cliente: \n");
        nc=tc.nextLine();
        System.out.println("Ingrese el RTN del cliente: ");
        rtn=tc.nextLine();

        System.out.println("");
        int i=1;
        System.out.println("Elige de la siguiente lista los articulos que desea el cliente\nseleccionando el numero que le corresponde.");
        Inv.lista();
        while(i!=0){
            System.out.println("______________________________________________________________");
            if (i==6 || i==11 || i==16 || i==21 || i==26 || i==31){
                System.out.println(""); 
                Inv.lista();
                System.out.println("");
            }
            System.out.println("Articulo #"+i);
            int pro=tc.nextInt();
            if(pro==0){
                i=0;
                break;
            }
            System.out.println("Cuantas cantidades desea: ");
            double preciounitario=0;
            int cant=tc.nextInt();
            double preciototal=0;
            int cont;
            
            if(pro==1){ 
               preciounitario=250; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Teclado RGB 60%");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
            }else if(pro==2){
               preciounitario=120; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Mouse Wireless Logitec");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
            }else if(pro==3){
               preciounitario=80; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Cable red 3ft");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
            }else if(pro==4){
               preciounitario=400; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Memoria Ram 8gb");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
            }else if(pro==5){
               preciounitario=800; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("HDD-1TB");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
            
             }else if(pro==6){
               preciounitario=9500; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Proc. Intel i5 12th gen");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
            
             }else if(pro==7){
               preciounitario=950; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Enfriador Cooler Master");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
             }else if(pro==8){
               preciounitario=2200; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Case ATX GAMDIAS");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
             }else if(pro==9){
               preciounitario=6500; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Escritorio y silla(Combo)");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
             }else if(pro==10){
               preciounitario=3500; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Headset Gaming Astros A50");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
             }else if(pro==11){
               preciounitario=13800; 
               preciototal=preciounitario*cant;
               i++;
               listadoPreciounitario.add(preciounitario);
               listadoProductos.add("Procesador Ryzen 9");
               listadoCantidad.add(cant);
               listadoPrecios.add(preciototal);
            }
        }
        
        System.out.println("****IMPRIMIENDO FACTURA****");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException ex) {
        }
        
        System.out.println("\n\n");
        System.out.println("");
        System.out.println("______________________________________________________________");
        System.out.println("--------------------------------------------------------------");
        System.out.println("                    MUNDO INFORMATICA S.A.                      ");
        System.out.printf("%27s%10s%n","SPS  ","Tel:2556-8003");
        System.out.println("______________________________________________________________");
        System.out.println("--------------------------------------------------------------");
        double rand=Math.random();
        System.out.printf("%16s%5s%1s%17s%11s%n","Factura #:",Math.round(rand*500000),"","Fecha:",date+"\n");
        System.out.printf("%13s%4s%14s%14s%n","Nombre:",nc,"RTN:",rtn);
        System.out.println("______________________________________________________________");
        System.out.printf("%12s||%26s||%8s||%10s||%n","\33[1m #  | Cant", "Descripcion       ","P.Unit.","Total");
        System.out.println("--------------------------------------------------------------");
  
        double subtotal=0;
        for (int j = 0; j <listadoPrecios.size(); j++) {
            subtotal+=Double.parseDouble(listadoPrecios.get(j).toString()); 
        }
        double isv=subtotal*0.15;
        double total=isv+subtotal;
        for (int j = 0; j <listadoPrecios.size(); j++) {
         System.out.format("%2s  |%4s ||%-26s||%8s||%10s||%n",j+1,listadoCantidad.get(j),listadoProductos.get(j),listadoPreciounitario.get(j),listadoPrecios.get(j));  
        }
        
        String subtotal1= fn.format(subtotal);
        String total1= fn.format(total);
        String isv1= fn.format(isv);
        
        System.out.println("______________________________________________________________");
        System.out.printf("%12s%26s||%8s||%10s||%n","","","Subtotal",subtotal1);
        System.out.printf("%3s%2s||%8s||%10s||%n","  La factura es a beneficio de todos","","ISV 15%",isv1);
        System.out.printf("%22s%16s||%8s||%10s||%n","¡Exigela!","","Total",total1);
        System.out.println("______________________________________________________________");
        System.out.printf("%18s%19s%n","","¡Gracias por su compra!");
        System.out.println("\n\n\n");
    }
                
}

            
        


                
     
        
    
        
    
        
        
    
    
