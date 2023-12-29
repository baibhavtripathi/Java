import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
            new FileInputStream("C:\\Users\\vaibh\\Downloads\\application.properties"));
        BufferedReader bufferedReader = new BufferedReader(isr);
        try {
            String readLines;
            while ((readLines = bufferedReader.readLine()) != null)
                System.out.println(readLines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
    }
}
