package com.company;

import java.time.LocalDateTime;

public class Coupon {
    private int aantalStempels;
    private int inleverMaand;
    private int inleverJaar;
    private String locatie;
    final int StoptVanAfMaand = 7;
    final int StoptVanAfJaar = 2021;

    public Coupon(int aantalStempels, int inleverMaand, int inleverJaar, String locatie) {
        this.aantalStempels = aantalStempels;
        this.inleverMaand = inleverMaand;
        this.inleverJaar = inleverJaar;
        this.locatie = locatie;
    }

    public boolean geldigeCoupon(int aantalStempels, int inleverMaand, int inleverJaar, String locatie){
        if (aantalStempels == 3 && StoptVanAfMaand > inleverMaand && inleverJaar == StoptVanAfJaar && locatie.equals("Alblasserdam")) {
            return true;
        }
        return false;
    }


}
