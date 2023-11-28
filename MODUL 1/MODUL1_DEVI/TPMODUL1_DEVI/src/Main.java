public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Devi_SI4601", "1202223188", 300000); 
        Account account2 = new Account("Kamal", "1202226992", 200000); 
        Account account3 = new Account("Inri", "1202228337", 100000); 

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        for (Account account : bank.getAllAccounts()) {
            System.out.println("Saldo akun " + account.getName() + " : " + account.getBalance());
        }

        account2.deposit(50000); 
        account3.deposit(50000); 

        for (Account account : bank.getAllAccounts()) {
            System.out.println("Saldo Akun " + account.getName() + " Saldo Setelah Menyetor : " + account.getBalance());
        }

            bank.removeAccount("1202228337");
            System.out.println("Akun Inri Berhasil Dihapus!");

        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
    }
}