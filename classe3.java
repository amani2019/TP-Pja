
import java.io.RandomAccessFile;
import java.util.Scanner;
public class classe3 {
    public static void main(String[] args) throws Exception {
        try {          
            Scanner inp = new Scanner(System.in);
            System.out.print("enter employee number:");
            int nb = inp.nextInt();
            RandomAccessFile raf = new RandomAccessFile("empdirect.dat", "rw");
            raf.seek(0);
            String txt = null; 
            while (raf.getFilePointer() < raf.length()) {
                txt=raf.readLine();    
            }
            String[] arr= txt.split(" ");
            
            String m = null;
            for(int i=3;i<arr.length;i=i+4){
                if(Integer.parseInt(arr[i]) == nb){
                    System.out.println("Nom: " + arr[i-3]);
                    System.out.println("Adresse: " + arr[i-2]);
                    System.out.println("SSN: " + arr[i-1]);
                    System.out.println("Number: " + arr[i]);   
                    m = String.valueOf(nb);
                }
            }
            if(m == null){
                throw new Exception("number not availaible");
            }
  
          
        } catch(Exception e){
            System.out.print(e);
        }
 
    }

}
