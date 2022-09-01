import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("san.txt")){
            for (char i = 'A'; i <= 'Z'; i++) {
                String a=i + ". " + Character.toLowerCase(i)+" \n";
                fileWriter.append(a);
            }

            for (char i = '0'; i <='9' ; i++) {
                fileWriter.append(i+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader=new FileReader("alphabet.txt")){
            Scanner scanner=new Scanner(fileReader);
            int i=1;
            while (scanner.hasNextLine()){
                System.out.println(i+") "+scanner.nextLine());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }


    }

