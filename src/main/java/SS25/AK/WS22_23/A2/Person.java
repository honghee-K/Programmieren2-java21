package SS25.AK.WS22_23.A2;

import java.io.*;

public class Person implements Serializable {
    public String name;
    public int age;

    public Person(String name, int alt){
        this.name = name;
        this.age = alt;
    }

    public Person gibKopie (Person p){
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos)){
                oos.writeObject(p);
                oos.flush();

                byte[] bytes = baos.toByteArray();

            try(ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais)){

                Person copiePerson = (Person) ois.readObject();
                return copiePerson;

            } catch(IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
    @Override
    public String toString(){
        return "Person{" + "name: " + name + ", age: " + age + "}";
    }

}
