import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class classe1 {
   public static void main(String args[]){
        Scanner inp = new Scanner(System.in);       
        try{
            System.out.print("indiquer le nombre d’objets à sérialiser:");
            int nb = inp.nextInt();
            Employee [] emp = new Employee[nb];
            for(int i=0;i<nb;i++){
            System.out.printf("employe %d:\n",i+1);
            System.out.println("enter le nom:");
            String name = inp.next();
            System.out.println("enter l'address:");
            String address = inp.next();
            System.out.println("enter le SSN:");
            int SSN = inp.nextInt();
            System.out.println("enter le numero:");
            int number = inp.nextInt();
            emp[i]= new Employee(name,address,SSN,number);
            FileOutputStream fos = new FileOutputStream("emp.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.flush();
            fos.close();
            }
            System.out.printf("donnees serialisees sauvegardees dans emp.dat"); 
        }
        catch(IOException ex){
            System.out.print("There is an exception");
        }
        
    }
}
