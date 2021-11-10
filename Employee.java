import java.io.Serializable;

public class Employee implements Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public Employee(String name2, String address2, int sSN2, int number2) {
}

public void mailCheck()
   {
      System.out.println("Mail de verification de " + name + " " + address);
   }
}



