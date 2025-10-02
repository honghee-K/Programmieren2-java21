package SS25_Test;

import SS25.AK.WS22_23.A2.Person;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CopyPersonTest {

    @Test
    public void testCopyPerson(){
        Person p = new Person("Luis", 24);
        System.out.println(p.gibKopie(p));


    }

    @Test
    public void testCopyPersonWithStream() throws IOException, ClassNotFoundException {
        Person p = new Person("Luis", 24);
        Person copiedPerson = null;

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);){
            oos.writeObject(p);
            oos.flush();

            byte[] bytes = baos.toByteArray();

            try(ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais)){

                copiedPerson = (Person) ois.readObject();


            }
            assertEquals("Luis", copiedPerson.name);
            assertEquals(24,copiedPerson.age);
            assertNotNull(copiedPerson);

        }




    }
}
