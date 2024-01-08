import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static List<Student> readFile(String fileName){
        List<Student> list = new ArrayList<>();
        File f = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            list = (List<Student>) ois.readObject();
            return list;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(String filename, List<Student> list){
        File f = new File(filename);
        try {
            OutputStream outputStream = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            oos.writeObject(list);
            oos.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
