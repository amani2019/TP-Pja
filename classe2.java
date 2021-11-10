import java.io.*;
public class classe2 {
   public static void main(String [] args) throws FileNotFoundException, IOException
   {
      Employee[] emp = null;
      try
      { 
         FileInputStream fis = new FileInputStream("emp.dat");
         ObjectInputStream ois = new ObjectInputStream(fis);
         emp =   (Employee[]) ois.readObject();
         ois.close();
         fis.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("classe Employee non trouvee");
         c.printStackTrace();
         return;
      }
      System.out.println("Employee deserialise...");
      for(int i=0;i<emp.length;i++){  
            System.out.println();
            System.out.println("Nom: " + emp[i].name);
            System.out.println("Adresse: " + emp[i].address);
            System.out.println("SSN: " + emp[i].SSN);
            System.out.println("Number: " + emp[i].number);     
      }
      
      RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
      for (int i = 0; i < emp.length; i++) {
        raf.writeBytes(emp[i].name+" "+ emp[i].address+" "+emp[i].SSN+" "+ emp[i].number+" ");
      }
      
    }
}
