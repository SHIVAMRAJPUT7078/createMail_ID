package Main;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Mail_ID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Customer[] customers = new Customer[n];
        for (int i = 0; i < customers.length; i++) {
            String name = scanner.nextLine().trim();
            String company = scanner.nextLine().trim();
            scanner.nextLine().trim();
            int age = scanner.nextInt();

            customers[i] = new Customer(name,company,age);
        }
        for(Customer customer : customers){
            System.out.println(customer.createEmail());
        }
        scanner.close();

    }
}


class Customer {
    private int age;
    private String name;

    private String company;
    private String email;
//    private String password;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

/*    public String getPassword() {
        return password;
    }
    */

    public void setEmail(String email) {
        this.email = email;
    }

    /*   public void setPassword(String password) {
           this.password = password;
       }


    */
    public String createEmail() {
        return String.format("%s_%s@%d.com",getName(),getCompany(),getAge());
    }

//    public String createPassword() {
//        Random random = new Random();
//        int n = (int) Math.random();
//    }

    public Customer(String name, String company, int age) {
        this.name = name;
        this.age = age;
        this.company = company;
/*        this.email=createEmail();
        this.password=createPassword();

 */
    }


/*
    @Override
    public String toString(){
        return String.format("%s_%d@%s.com", getName(),getAge(),getCompany());
    }

 */

}