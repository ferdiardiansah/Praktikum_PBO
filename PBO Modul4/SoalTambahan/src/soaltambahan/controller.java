/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaltambahan;

import java.util.ArrayList;

public class controller implements biaya{
    ArrayList<kendaraan> list;
    int ongkosh=0;
    final int harga=5000;
    controller(){
        list = new ArrayList<>();
    }
    
//    final void setHarga(){
//        int harga = 5000;
//    }
   
    
    public void tambahParkir(int c,int waktuKeluar){
        String plat=list.get(c).getPlat();
        String tanggal=list.get(c).getTanggal();
        int waktuMasuk=list.get(c).getWaktuMasuk();
        int by=0;
        list.set(c, new kendaraan(plat,tanggal,waktuMasuk,waktuKeluar,by));
    }
    public void tambahParkir(String plat,String tanggal,int waktuMasuk,int waktuKeluar,int by){
        kendaraan motor=new kendaraan(plat,tanggal,waktuMasuk,waktuKeluar,by);
        list.add(motor);
    }
    
    public void ongkos(char karcis,int c,char stnk,int waktuKeluar){

        ongkosh=(list.get(c).getWaktuKeluar()-list.get(c).getWaktuMasuk())*harga;
        checkKeluar(karcis,stnk);
      //  tanpaStnk(stnk);
     //   karcisNoStnk(k_nostnk);
        
        int by=ongkosh;
         System.out.println("Bayar      = "+ongkosh+"\nHarap bayar dengan uang pas..!!!");
         String plat=list.get(c).getPlat();
        String tanggal=list.get(c).getTanggal();
        int waktuMasuk=list.get(c).getWaktuMasuk();
         list.set(c,new kendaraan(plat,tanggal,waktuMasuk,waktuKeluar,by));
    }
    
    public ArrayList<kendaraan>getALL(){
        return list;
    }

    
    public void checkKeluar(char karcis, char stnk) {
        if((karcis=='Y' || karcis == 'y') && (stnk=='Y' || stnk=='y')){
            ongkosh=(harga);
        } 
        else if((karcis=='T' || karcis == 't') && (stnk=='T' || stnk=='t')){
            ongkosh=(harga+((harga*25)/100)) + 100000;
        } 
         else if ((karcis=='Y' || karcis == 'y') && (stnk=='T' || stnk=='t')){
             ongkosh=(harga + 100000);
         }
         else if ((karcis=='T' || karcis == 't') && (stnk=='Y' || stnk=='y')){
             ongkosh= (harga+((harga*25)/100));
         }
         
        else{
            ongkosh=harga;
        }
    }
   
}