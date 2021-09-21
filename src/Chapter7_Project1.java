public class Chapter7_Project1 {
    public static void main(String[] args) {
    BankAccount bankAccount=new BankAccount("John",100);
    BankAccount myaccount=new BankAccount("shubham",411);

    bankAccount.deposit(7000);
        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(4000);
        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

        System.out.println();
        myaccount.deposit(4000);
        System.out.println(myaccount.getOwner());
        System.out.println(myaccount.getBalance());
    }
}
