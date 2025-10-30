package WS25.Tutorium.Getraenkevoerrakte;

public class Main {
    public static void main(String[] args) {
        Getraenk[] getraenk = new Getraenk[] {
                new Bier("Eichhofen", "Helles", 5.0),
                new WeissWein("Rheinhessen", "Silvaner", 12.5, 2022),
                new RotWein("Bordeaux", "Merlot", 13.0, 2021)};


        for (Getraenk g : getraenk) {
            System.out.println(g);
            System.out.println("------------");
        }
    }
}
