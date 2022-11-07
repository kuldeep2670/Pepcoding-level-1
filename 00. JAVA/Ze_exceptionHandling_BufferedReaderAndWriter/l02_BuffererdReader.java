package Ze_exceptionHandling_BufferedReaderAndWriter;

import java.io.*;
public class l02_BuffererdReader {
    public static void main(String[] args) throws IOException {
        
        // Buffered reader
        // FileReader fr = new FileReader("E://Pepcoding//Pepcoding level 1//00. JAVA//Ze_exceptionHandling_BufferedReaderAndWriter//test.txt");
        // BufferedReader br = new BufferedReader(fr);
        // String line = br.readLine();
        // while(line != null){
        //     System.out.println(line);
        //     line = br.readLine();
        // }
        // br.close();

        //buffered writer
        FileWriter fw = new FileWriter("writer.txt");
        BufferedWriter bw = new BufferedWriter(fw);
            //you can write integer but can use binary values
        bw.write(1000);   //1000 == 8
        bw.newLine();
        bw.write("kudleep");
        bw.flush();
        bw.close();
    }
}
