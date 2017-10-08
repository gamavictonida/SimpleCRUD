/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgs.mgsproject;

/**
 *
 * @author User HP
 */
public class Jurusan {
    
    private int idJurusan;
    private String namaJurusan;
    
    public int getIdJurusan(){
        return idJurusan;
    }
    
    public void setIdJurusan(int idJurusan){
        this.idJurusan = idJurusan;
    }
    
    public String getNamaJurusan(){
        return namaJurusan;
    }
    
    public void setNamaJurusan(String namaJurusan){
        this.namaJurusan = namaJurusan;
    }
   @Override
    public String toString(){
        return "Jurusan [idJurusan=" + idJurusan +",namaJurusan=" + namaJurusan + "]";        
    }
    
}
