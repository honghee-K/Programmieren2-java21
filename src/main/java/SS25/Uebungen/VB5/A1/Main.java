package SS25.Uebungen.VB5.A1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Lebewesen> lebewesenList = new ArrayList<>();

        lebewesenList.add(new Mensch("Anna", "Lehrerin"));
        lebewesenList.add(new Tier("Monki", "Katze"));

        // input, output스트림 같이 써야해?
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lebewesen.dat"))) {
            oos.writeObject(lebewesenList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lebewesen.dat"))) {
            List<Lebewesen> gelesen = (List<Lebewesen>) ois.readObject();

            for (Lebewesen lw : gelesen) {
                lw.beschreibe();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 같이 쓴거
        /* try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lebewesen.dat"));
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lebewesen.dat"))){
                    List<Lebewesen> lebewesenList = new ArrayList<>();
                    lebewesenList.add(new Mensch("Anna", "Lerherin"));
                    lebewesenList.add(new Tier("Monki", "Katze"));
                    oos.writeObject(lebewesenList);
                    ArrayList<Lebewesen> gelesen = (ArrayList<Lebewesen>) ois.readObject();
                    for(Lebewesen lw : gelesen) {
                        lw.beschreibe();
                    }
                } catch(IOException | ClassNotFoundException e){
                    throw new RuntimeException(e); // 이건 왜 던지는겨
                }
        */
    }
}
