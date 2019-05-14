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
           System.out.println("������ �������� �ʽ��ϴ�.");
       }
       catch (IOException ioe) {
           System.out.println("������ ���� �� �����ϴ�.");
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
