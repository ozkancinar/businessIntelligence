/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author ozkan
 */
public class siparis {
    float toplamFiyat, toplamMaliyet, iskonto, mesafeKatsayisi;
    int toplamAgirlik, toplamHacim, mesafe;
    float beklenenSatisFiyati;
    
    public siparis() {
        //this.mesafeKatsayisi = 5;
        
    }
    
    
    
    public float getMesafeKatsayisi() {
        return mesafeKatsayisi;
    }

    public void setMesafeKatsayisi(float mesafeKatsayisi) {
        this.mesafeKatsayisi = mesafeKatsayisi;
    }

    public float getBeklenenSatisFiyati() {
        return beklenenSatisFiyati;
    }

    public void setBeklenenSatisFiyati(float beklenenSatisFiyati) {
        this.beklenenSatisFiyati = beklenenSatisFiyati;
    }

    public int getMesafe() {
        return mesafe;
    }

    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    public float getIskonto() {
        return iskonto;
    }

    public void setIskonto(float iskonto) {
        this.iskonto = iskonto;
    }
    
    
   

    public float getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(float toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }

    public float getToplamMaliyet() {
        return toplamMaliyet;
    }

    public void setToplamMaliyet(float toplamMaliyet) {
        this.toplamMaliyet = toplamMaliyet;
    }

    public int getToplamAgirlik() {
        return toplamAgirlik;
    }

    public void setToplamAgirlik(int toplamAgirlik) {
        this.toplamAgirlik = toplamAgirlik;
    }

    public int getToplamHacim() {
        return toplamHacim;
    }

    public void setToplamHacim(int toplamHacim) {
        this.toplamHacim = toplamHacim;
    }
    
    
}
