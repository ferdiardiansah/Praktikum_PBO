/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07079main;

/**
 *
 * @author ferdi-07079
 */
public class Manusia {
    
    private String nama;
    private String noHp;
    
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    protected String getNama()
    {
        return nama;
    }
    public void setNoHp(String noHp)
    {
        this.noHp=noHp;
    }
    protected String getNoHp()
    {
        return noHp;
    }
    public void print()
    {
        System.out.println(" Nama  : "+this.getNama());
        System.out.println(" No HP : "+this.getNoHp());
    }
    
}
