/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4tempatparkir;

/**
 *
 * @author ferdi-07079
 */
abstract class biaya {
    int harga;
    
   
   
    
    abstract void karcisHilang(char karcis);
    
//    final int karcisHilang(char karcis){
//        if(karcis == 't'|| karcis=='T'){
//            harga=harga+((harga*25)/100);
//        }
//        else{
//            
//        }
//        return harga;
//    }
    
//    public int getHarga(){
//        return harga;
//    }
    
    abstract void TAstnk(char stnk);
    
//    final int TAstnk(char stnk){
//        if(stnk == 't'||stnk=='T'){
//            harga=harga+100000;
//        }
//        else{
//            
//        }
//        return harga;
//    }
}