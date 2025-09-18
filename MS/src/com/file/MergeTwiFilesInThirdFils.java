package com.file;

import java.io.*;

public class MergeTwiFilesInThirdFils {
    public static void main(String[] args) throws IOException {
        String file1 = "D:\\AInterviewDoc\\Files\\file1.txt";
        String file2 = "D:\\AInterviewDoc\\Files\\file2.txt";
        String mergedFile = "D:\\AInterviewDoc\\Files\\merged.txt";
        try(
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))
                ){
                String line;
                while((line = br1.readLine()) != null){
                    bw.write(line);
                    bw.newLine();
                }

                while((line = br2.readLine()) != null){
                    bw.write(line);
                    bw.newLine();
                }
            System.out.println(mergedFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
