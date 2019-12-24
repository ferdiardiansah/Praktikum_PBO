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
public class Pelanggan extends Manusia {
    
    private int id;
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    @Override
    public void print()
    {
        System.out.println(" Id Pelanggan : "+this.getId());
        System.out.println(" Nama         : "+this.getNama());
        System.out.println(" No Hp        : "+this.getNoHp());
    }
}
