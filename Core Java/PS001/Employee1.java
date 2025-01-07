package PS001;

public class Employee1 {
    
        int Id;
        String Firstname;
        String lastname;
        String address;
        public class Main{
          public void getFullname(String Firstname,String lastname){
            System.out.println(Firstname+" " +lastname);
          }
          


        }
        
        public static void main(String[] args) {
            Employee1 employee = new Employee1(); 
            Main obj = employee.new Main();
            obj.getFullname("chukka","karthik");
        }
        }

    
    

