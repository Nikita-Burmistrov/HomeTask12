import java.io.*;

public class HmTask {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader (new FileReader("E:\\source.txt"));
        String c;
        while ((c = buffer.readLine())!=null) {
            String[] words = c.split(",");
            for (String word : words){
                word = word.replace("Ivan","");
                word = word.replace("Melentii","");
                word = word.replace("Grigorii","");
                word = word.replace("Cazacu","");
                word = word.replace("Alexei","");
                word = word.replace("Voronin","");
                word = word.replace("John","");
                word = word.replace("Green","");

                System.out.println(word);
            }
        }
    }
}