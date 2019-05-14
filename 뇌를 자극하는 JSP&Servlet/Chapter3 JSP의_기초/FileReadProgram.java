import java.io.*;
class FileReadProgram {
    public static void main(String args[]) {
       BufferedReader reader = null;
       try {
           reader = new BufferedReader(new FileReader("input.txt"));
           while (true) {
               String str = reader.readLine();
               if (str == null)
                   break;
               System.out.println(str);
           }
       }
       catch (FileNotFoundException fnfe) {
           System.out.println("파일이 존재하지 않습니다.");
       }
       catch (IOException ioe) {
           System.out.println("파일을 읽을 수 없습니다.");
       }
       finally {
          try {
               reader.close();
          }          
          catch (Exception e) {
          }
       }
    }
}
