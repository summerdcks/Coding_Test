import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int num = Integer.parseInt(bf.readLine());
            for(int i = 0; i < num; i++) {
                String str = bf.readLine();
                String[] arr = str.split(" ");
                bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
            }
            bw.flush();
            bw.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}