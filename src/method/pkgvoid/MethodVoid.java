/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.pkgvoid;

/**
 *
 * @author FAIZ
 */
public class MethodVoid {
    
    String nama, makanan;
    
    public static void main(String[] args){
        //membuat Objek dari Class MethodVoid
        MethodVoid Hewan = new MethodVoid();
        System.out.println("------------- ANJING -------------");
        Hewan.Anjing();
        System.out.println("------------- KUCING -------------");
        Hewan.Kucing();
        
    }
   void Anjing(){
       nama = "Sultan";
       makanan = "Daging";
       System.out.println("Nama Anjing Saya Adalah "+nama);
       System.out.println("Anjing Saya Suka Makan "+makanan);
   }
   void Kucing(){
       nama = "Diarga";
       makanan = "Whiskas";
       System.out.println("Nama Kucing Saya Adalah "+nama);
       System.out.println("Kucing Saya Suka Makan "+makanan);
   }


    }
    

