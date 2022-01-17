public class Main {
    public static void main(String[] args) {

   Figura figura=new Figura();
   Prostokat prostokat=new Prostokat(1,2);
   Punkt punkt=new Punkt();
   Trojkat trojkat= new Trojkat(1,1);

  prostokat.przesun(3,5);
  Kwadrat kwadrat=new Kwadrat(5,5);

  System.out.println( punkt.toString());
  System.out.println(figura.toString());
  System.out.println( prostokat.toString());
  System.out.println( trojkat.toString());
  System.out.println( kwadrat.toString());

    }
}
