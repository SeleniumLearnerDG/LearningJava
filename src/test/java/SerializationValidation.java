import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class SerializationValidation {

   @Test(expected = NotSerializableException.class)
    public void whenSerializing_ThenThrowsError() throws IOException {
        Address address = new Address();
        address.setHouseNumber(10);
        FileOutputStream fileOutputStream = new FileOutputStream("yofile.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(address);
        }
    }

    @Test
    public void  whenSerializing() throws IOException, ClassNotFoundException {
        Person p = new Person();
        p.setAge(20);
        p.setName("Joe");
        FileOutputStream fileOutputStream = new FileOutputStream("yofile.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(p);
        }

        FileInputStream fileInputStream = new FileInputStream("yofile.txt");
        try ( ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Person p2 = (Person) objectInputStream.readObject();
            assertEquals(p2.getAge(), p.getAge());
            assertEquals(p2.getName(), p.getName());;
        }
    }
}
