/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4tempatparkir;

public class kendaraan {
    String plat;
    String tanggal;
    int waktuMasuk;
    int waktuKeluar;
    int by;
    
    kendaraan(String plat,String tanggal,int waktuMasuk,int waktuKeluar,int by){
        this.plat=plat;
        this.tanggal=tanggal;
        this.waktuKeluar=waktuKeluar;
        this.waktuMasuk=waktuMasuk;
        this.by=by;
    }

//    public void setWaktuKeluar(int waktuKeluar) {
//        this.waktuKeluar = waktuKeluar;
//    }

    public int getBy() {
        return by;
    }
    

    public String getPlat() {
        return plat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getWaktuMasuk() {
        return waktuMasuk;
    }

    public int getWaktuKeluar() {
        return waktuKeluar;
    }
    
    
}

