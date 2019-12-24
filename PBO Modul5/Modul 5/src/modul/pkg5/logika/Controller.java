/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5.logika;
import modul.pkg5.Surat;
import java.util.ArrayList;
/**
 *
 * @author ferdi-07079
 */
public class Controller {
    static ArrayList<Surat> list=new ArrayList<>();
   Surat surat=new Surat();
    
   public void tambahSurat(String judul,String engirim,String penerima,String perihal,int noSurat,int jmlLamp,String keterangan){
       surat.setEngirim(engirim);
       surat.setJmlLamp(jmlLamp);
       surat.setJudulSurat(judul);
       surat.setKeterangan(keterangan);
       surat.setNoSurat(noSurat);
       surat.setPenerima(penerima);
       surat.setPrihal(perihal);
       
       list.add(surat);
   }
   
    public void tambahSurat(String judul,String engirim,String penerima,String perihal,int noSurat,int jmlLamp){
        surat.setEngirim(engirim);
        surat.setJmlLamp(jmlLamp);
        surat.setJudulSurat(judul);
        surat.setNoSurat(noSurat);
        surat.setPrihal(perihal);
        surat.setPenerima(penerima);
        surat.setKeterangan("masuk");
        
        list.add(surat);
    }
    
    public ArrayList<Surat>getAll(){
        return list;
    }
    
}