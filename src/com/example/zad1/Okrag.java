package com.example.zad1;

import com.example.Figura;
import com.example.Punkt;

public class Okrag extends Figura {

Punkt srodek;
int promien;

public double getPowierzchnia(){
 return 3.14*promien*promien;
}
public double setSrednica(){
    return 2*promien;

}
    public double getPromien(){
        return promien;

    }
    public boolean wSrodku(Punkt punkt){
    double lStrona=Math.pow((punkt.getX() - srodek.getX()),2)+Math.pow((punkt.getY() - srodek.getY()),2);
    double pStrona= Math.pow(promien,2);
    if(lStrona== pStrona) return true;
    return false;
    }
    public Okrag(){
    this.srodek=srodek;
    this.promien=promien;
    }

    public Okrag(Punkt srodek, int promien){
        this.srodek=srodek;
        this.promien=promien;
    }
    // to bedzie taki sam konstruktor, te same typy parametrow
//    public Okrag(Punkt srodek, int srednica){
//        this.srodek=srodek;
//        this.promien=srednica/2;
//    }

    @Override
    public String toString() {
        return "Okrag{" +
                "srodek=" + srodek +
                ", promien=" + promien +
                '}';
    }
}
