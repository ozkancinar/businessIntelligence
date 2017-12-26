/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.baglanti;

/**
 *
 * @author ozkan
 */
public class veriler {

    private String sehirAd, malzemeAd, musteriAd, aracPlaka;
    private int aracTon, aracHacim, aracId, malzemeAgirlik, malzemeHacim, sehirID, sehirMesafe, malzemeID;
    private float malzemeMaliyet, malzemeFiyat, aracKatsayi;

    PreparedStatement ps;
    ResultSet rs;

    /*
        SQL Veri Eklemeleri - INSERTS
     */
    
    // SQL'e Malzeme Ekle
    public boolean malzemeEkle(veriler veri) throws SQLException {
        baglanti baglan = new baglanti();
        baglan.baglan();

        String sorgu = "insert into malzemeler (m_ad, m_fiyat, m_agirlik, m_hacim, m_maliyet) values (?,?,?,?,?)";
       
        try {
        ps = baglan.con.prepareStatement(sorgu);
        ps.setString(1, veri.getMalzemeAd());
        ps.setFloat(2, veri.getMalzemeFiyat());
        ps.setInt(3, veri.getMalzemeAgirlik());
        ps.setInt(4, veri.getMalzemeHacim());
        ps.setFloat(5, veri.getMalzemeMaliyet());
        ps.executeUpdate();
        baglan.con.close();
        return true;
        } catch (SQLException ex) {
            Logger.getLogger(veriler.class.getName()).log(Level.SEVERE, null, ex);
            baglan.con.close();
            return false;
        }

    }
    
    // SQL'e Araç Ekle
    public boolean aracEkle(veriler a_ekle) throws SQLException{
        baglanti baglan = new baglanti();
        baglan.baglan();

        String sorgu = "insert into araclar (a_plaka, a_tonkapasite, a_hacimkapasite) values (?,?,?)";
        
        try {
            ps = baglan.con.prepareStatement(sorgu);
            ps.setString(1, a_ekle.getAracPlaka());
            ps.setInt(2, a_ekle.getAracTon());
            ps.setInt(3, a_ekle.getAracHacim());
            ps.executeUpdate();
            baglan.con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(veriler.class.getName()).log(Level.SEVERE, null, ex);
            baglan.con.close();
            return false;
        }
        
    }
    
    // SQL'e Musteri Ekle
    public boolean musteriEkle(veriler veri) throws SQLException{
        baglanti baglan = new baglanti();
        baglan.baglan();

        String sorgu = "insert into musteriler (musteri_ad, sehir_id) VALUES (?, (SELECT id FROM sehirler WHERE sehir_ad= ?));";
       
        try {
        ps = baglan.con.prepareStatement(sorgu);
        ps.setString(1, veri.getMusteriAd());
        ps.setString(2, veri.getSehirAd());
        ps.executeUpdate();
        baglan.con.close();
        return true;
        } catch (SQLException ex) {
            Logger.getLogger(veriler.class.getName()).log(Level.SEVERE, null, ex);
            baglan.con.close();
            return false;
        }
    }
    
    
     /*
        SQL Veri Okuma - SELECTS
     */
    
    // Müşteri bilgilerini oku
    public List<veriler> musterileriOku() throws SQLException{
        model.baglanti baglanti = new model.baglanti();
        baglanti.baglan();
        
        List<veriler> liste = new ArrayList<>();
        veriler[] veri = null;
        String sorgu;
        sorgu = "select m.musteri_ad, s.sehir_ad, m.sehir_id, s.sehir_mesafe from musteriler as m INNER JOIN sehirler as s ON m.sehir_id = s.id";
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac = 0;
        while (rs.next()) {
            sayac++;
        }
        veri = new veriler[sayac];
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int i = 0;
        while (rs.next()) {
            veri[i] = new veriler();
            veri[i].setMusteriAd(rs.getString(1));
            veri[i].setSehirAd(rs.getString(2));
            veri[i].setSehirID(rs.getInt(3));
            veri[i].setSehirMesafe(rs.getInt(4));
            liste.add(veri[i]);
            i++;
        }
        baglanti.con.close();
        return liste;
    }
    
    // Malzeme bilgilerini oku
    public List<veriler> malzemeleriOku() throws SQLException{
        model.baglanti baglanti = new model.baglanti();
        baglanti.baglan();
        
        List<veriler> liste = new ArrayList<>();
        veriler[] veri = null;
        String sorgu;
        sorgu = "select * from malzemeler";
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac = 0;
        while (rs.next()) {
            sayac++;
        }
        veri = new veriler[sayac];
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int i = 0;
        while (rs.next()) {
            veri[i] = new veriler();
            veri[i].setMalzemeID(rs.getInt("id"));
            veri[i].setMalzemeAd(rs.getString("m_ad"));
            veri[i].setMalzemeFiyat(rs.getFloat("m_fiyat"));
            veri[i].setMalzemeAgirlik(rs.getInt("m_agirlik"));
            veri[i].setMalzemeHacim(rs.getInt("m_hacim"));
            veri[i].setMalzemeMaliyet(rs.getFloat("m_maliyet"));
            
            liste.add(veri[i]);
            i++;
        }
        baglanti.con.close();
        return liste;
    }
    
    // Malzeme bilgisi al by ID
    public List<veriler> malzemeAl(int id) throws SQLException{
        model.baglanti baglanti = new model.baglanti();
        baglanti.baglan();
        
        List<veriler> liste = new ArrayList<>();
        veriler[] veri = null;
        String sorgu;
        sorgu = "select * from malzemeler where id="+id+"";
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac = 0;
        while (rs.next()) {
            sayac++;
        }
        veri = new veriler[sayac];
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int i = 0;
        while (rs.next()) {
            veri[i] = new veriler();
            veri[i].setMalzemeAd(rs.getString("m_ad"));
            veri[i].setMalzemeFiyat(rs.getFloat("m_fiyat"));
            veri[i].setMalzemeAgirlik(rs.getInt("m_agirlik"));
            veri[i].setMalzemeHacim(rs.getInt("m_hacim"));
            veri[i].setMalzemeMaliyet(rs.getFloat("m_maliyet"));
            
            liste.add(veri[i]);
            i++;
        }
        baglanti.con.close();
        return liste;
    }
    
    // Şehir bilgilerini oku
    public List<veriler> sehirleriOku() throws SQLException {
        model.baglanti baglanti = new model.baglanti();
        baglanti.baglan();

        List<veriler> liste = new ArrayList<>();
        veriler[] veri = null;
        String sorgu;
        sorgu = "SELECT * FROM sehirler";
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac = 0;
        while (rs.next()) {
            sayac++;
        }
        veri = new veriler[sayac];
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int i = 0;
        while (rs.next()) {
            veri[i] = new veriler();
            veri[i].setSehirAd(rs.getString("sehir_ad"));
            veri[i].setSehirID(rs.getInt("id"));
            veri[i].setSehirMesafe(rs.getInt("sehir_mesafe"));
            liste.add(veri[i]);
            i++;
        }
        baglanti.con.close();
        return liste;
    }
    
    public List<veriler> aracUygunGetir(int ton,float hacim) throws SQLException{
        List<veriler> aracList = new ArrayList<>();
        System.out.println("ton:"+ton+"hacim"+hacim);
        model.baglanti baglanti = new model.baglanti();
        baglanti.baglan();
        veriler[] veri = null;
        String sorgu = "SELECT * FROM araclar WHERE a_tonkapasite > "+ton+" AND a_hacimkapasite > "+hacim+" ORDER BY a_katsayi asc limit 5";
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        
        veri = new veriler[5];
        
        int i = 0;
        while (rs.next()) {
            veri[i] = new veriler();
            veri[i].setAracId(rs.getInt("id"));
            veri[i].setAracPlaka(rs.getString("a_plaka"));
            veri[i].setAracTon(rs.getInt("a_tonkapasite"));
            veri[i].setAracHacim(rs.getInt("a_hacimkapasite"));
            veri[i].setAracKatsayi(rs.getFloat("a_katsayi"));
            aracList.add(veri[i]);
            i++;
        }
        baglanti.con.close();
        return aracList;

    }
    
    public veriler aracGetirById(int id) throws SQLException{
        veriler veri = new veriler();
         model.baglanti baglanti = new model.baglanti();
        baglanti.baglan();
         String sorgu = "SELECT * FROM araclar WHERE id="+id+"";
        ps = baglanti.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        while (rs.next()) {
            veri.setAracId(rs.getInt("id"));
            veri.setAracPlaka(rs.getString("a_plaka"));
            veri.setAracTon(rs.getInt("a_tonkapasite"));
            veri.setAracHacim(rs.getInt("a_hacimkapasite"));
            veri.setAracKatsayi(rs.getFloat("a_katsayi"));
        }
        baglanti.con.close();
        return veri;
    }
    
    public String getSehirAd() {
        return sehirAd;
    }

    public void setSehirAd(String sehirAd) {
        this.sehirAd = sehirAd;
    }

    public String getMalzemeAd() {
        return malzemeAd;
    }

    public void setMalzemeAd(String malzemeAd) {
        this.malzemeAd = malzemeAd;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getAracPlaka() {
        return aracPlaka;
    }

    public void setAracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public int getAracId() {
        return aracId;
    }

    public void setAracId(int aracId) {
        this.aracId = aracId;
    }

    public int getMalzemeID() {
        return malzemeID;
    }

    public void setMalzemeID(int malzemeID) {
        this.malzemeID = malzemeID;
    }

    public int getAracTon() {
        return aracTon;
    }

    public void setAracTon(int aracTon) {
        this.aracTon = aracTon;
    }

    public int getAracHacim() {
        return aracHacim;
    }

    public void setAracHacim(int aracHacim) {
        this.aracHacim = aracHacim;
    }

    public int getMalzemeAgirlik() {
        return malzemeAgirlik;
    }

    public void setMalzemeAgirlik(int malzemeAgirlik) {
        this.malzemeAgirlik = malzemeAgirlik;
    }

    public int getMalzemeHacim() {
        return malzemeHacim;
    }

    public void setMalzemeHacim(int malzemeHacim) {
        this.malzemeHacim = malzemeHacim;
    }

    public int getSehirID() {
        return sehirID;
    }

    public void setSehirID(int sehirID) {
        this.sehirID = sehirID;
    }

    public int getSehirMesafe() {
        return sehirMesafe;
    }

    public void setSehirMesafe(int sehirMesafe) {
        this.sehirMesafe = sehirMesafe;
    }

    public float getMalzemeMaliyet() {
        return malzemeMaliyet;
    }

    public void setMalzemeMaliyet(float malzemeMaliyet) {
        this.malzemeMaliyet = malzemeMaliyet;
    }

    public float getMalzemeFiyat() {
        return malzemeFiyat;
    }

    public float getAracKatsayi() {
        return aracKatsayi;
    }

    public void setAracKatsayi(float aracKatsayi) {
        this.aracKatsayi = aracKatsayi;
    }
    
    public void setMalzemeFiyat(float malzemeFiyat) {
        this.malzemeFiyat = malzemeFiyat;
    }

}
