package Exercise.Uebungen.Iterator;

import java.util.Iterator;
import java.util.Random;

public class HongIterator implements Iterator<String> {

    int count;
    int counter;
    Random random = new Random();

    public HongIterator(){
        this.count = random.nextInt(1,10);
        this.counter = 1;
    }

    @Override
    public boolean hasNext(){
        if(count != counter){
            counter++;
        return true;
        }

        return false;
    }


    @Override
    public String next(){
        String str = "Hallo Hong";
        return str;
    }

    public static void main(String[] args) {
        Iterator <String> it = new HongIterator () ;
        while ( it . hasNext () ) {
            String name = it . next () ;
            System . out . println ( name ) ;
        }
    }

}

