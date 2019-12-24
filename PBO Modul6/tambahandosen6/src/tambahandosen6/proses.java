/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambahandosen6;

/**
 *
 * @author ferdi-07079
 */
public class proses extends soal implements pertanyaan1,pertanyaan2{
    
    
    private String pbo = "PBO";
    private String so = "SO";
    private String pertanyaan1;
    private String pertanyaan2;
 

    @Override
    public String pertanyaan1() {
            String pertanyaan1 = "Apa kepanjangan dari OOP ?";
            return pertanyaan1;           
    }

    @Override
    public String pertanyaan2() {
        String pertanyaan2 = "Manakah perintah untuk masuk ke root di Linux ?";
        return pertanyaan2; 
    }

    @Override
    public String ujian1() {
        return pbo;   
    }

    @Override
    public String ujian2() {
        return so;       
    }
    
    private String setujian1(){
        pertanyaan1 = "Apa kepanjangan dari OOP ?";
        return  pertanyaan1;
    }
    
    private String setujian2(){
        pertanyaan2 = "Manakah perintah untuk masuk ke root di Linux ?";
        return  pertanyaan1;
    }



}