package zad1;

public class Okrag {

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
    double lStrona=Math.pow((punkt.x-srodek.x),2)+Math.pow((punkt.y-srodek.y),2);
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
    public Okrag(Punkt srodek, int srednica){
        this.srodek=srodek;
        this.promien=srednica/2;
    }
}
