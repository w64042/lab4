public class Kwadrat extends Prostokat {

    public Kwadrat(int wys,int szer){
        super(wys,szer);

    }
    public String opis(String desc){return this.desc;}

    @Override
    public String toString() {
        return "Kwadrat{" +
                "punkt=" + punkt +
                ", kolor='" + kolor + '\'' +
                ", wys=" + wys +
                ", szer=" + szer +
                '}';
    }
}
