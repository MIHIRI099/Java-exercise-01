import java.io.IOException;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = 
                new BufferedReader(new FileReader("test.txt"));
            outputStream = 
                new BufferedWriter(new FileWriter("output.txt"));

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}