package PS001;

public class Employee {
    
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
            Employee employee = new Employee(); 
            Main obj = employee.new Main();
            obj.getFullname("chukka","karthik");
        }
        }

    
    

