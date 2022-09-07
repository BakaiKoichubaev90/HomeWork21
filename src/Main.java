
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {


        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i<50; i++){
            int a = random.nextInt(1,100);
            arrayList.add(a);

            if(a%2==0){
                arrayList1.add(a);

            }else {
                arrayList2.add(a);
            }
        }
        System.out.println("Baardyk sandar" + arrayList);
        System.out.println("Jup sandar" + arrayList1);
        System.out.println("Tak sandar" + arrayList2);





    }}



