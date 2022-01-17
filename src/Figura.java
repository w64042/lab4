class Figura {
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	String desc= "opis";
	
	public Figura(){
		punkt = new Punkt(0,0);
	}

	public Figura(String kolor){
		this.kolor=kolor;
		punkt= new Punkt(0,0);
	}

	public Figura(Punkt punkt){
		this.punkt=punkt;
	}
	public String getKolor(){
		return kolor;
	}

	void przesun(int x, int y){
		punkt.x+=x;
		punkt.y+=y;

	}

	public String opis(String desc){return this.desc;}

	@Override
	public String toString() {
		return "Figura{" +
				"punkt=" + punkt +
				", kolor='" + kolor + '\'' +
				'}';
	}
}
