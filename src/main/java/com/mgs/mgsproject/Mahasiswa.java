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
public class Mahasiswa {
    private int nim;
    private String nama;
    private String alamat;

    @Override
    public String toString(){
        return "Mahasiswa [nim=" + getNim() +",nama=" + getNama() + ",alamat=" + getAlamat() + "]";        
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

  
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
