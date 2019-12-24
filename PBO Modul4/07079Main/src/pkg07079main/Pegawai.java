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
public class Pegawai extends Manusia {
    
    private int id;
    private String kataSandi;
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    
    public void setKataSandi(String kataSandi)
    {
        this.kataSandi=kataSandi;
    }
    public String getKataSandi()
    {
        return kataSandi;
    }
    @Override
    public void print()
    {
        System.out.println(" Id Pegawai : "+this.getId());
        System.out.println(" Nama       : "+this.getNama());
        System.out.println(" No Hp      : "+this.getNoHp());
    }
    
}
