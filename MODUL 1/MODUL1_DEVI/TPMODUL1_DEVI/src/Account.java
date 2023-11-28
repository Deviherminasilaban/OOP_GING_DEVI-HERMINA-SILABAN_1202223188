public class Account {
    private double balance;
    private String name;
    private String accountNumber;

    public Account(String name, String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double saldo) {
        if (saldo > 0) {
            this.balance += saldo;
            System.out.println("Saldo Disetor Oleh " + this.name + " " + this.accountNumber);
        } else {
            System.out.print("Saldo Anda Harus Lebih Dari 0");
        }
    }
    public boolean withdraw(double saldo) {
        if (saldo > 0 && saldo <= this.balance) {
            this.balance -= saldo;
            return true;
        } else {
            System.out.println("Saldo Anda Tidak Mencukupi");
            return false;
        }
    }
}