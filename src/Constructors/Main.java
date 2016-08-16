package Constructors;

// https://docs.oracle.com/javase/tutorial/java/index.html - The Java™ Tutorials


public class Main {
    public static void main(String[] args){
        //
        //
//
//        Account myAccount = new Account(); //"0437889",0.00d, "John Doe",
//                //"johndoe@gmail.com","(087)456-7890");
//        System.out.println(myAccount.getNumber());
//        System.out.println(myAccount.getBalance());
//
//
//        myAccount.withdrawal(100.0);
//
//        myAccount.deposit(50.0);
//        myAccount.withdrawal(100.0);
//
//        myAccount.deposit(51);
//        myAccount.withdrawal(100.0);
//
//        Account yourAccount = new Account("User", "user@gmail.com", "0000021");
//        System.out.println(yourAccount.getNumber()+ " name " + yourAccount.getCustomerName());

        //
        //

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("John", 30000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Smith", 100.00, "smith@email.com");
        System.out.println(person3.getName());

    }
}
