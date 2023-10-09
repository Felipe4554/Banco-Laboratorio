package Account;

public class AccountSinpe {

    private Account account;

    public AccountSinpe(Account account) {
        this.account = account;
    }

    public boolean hacerPago(double monto) {
        if (monto > 0 && account.getBalance() >= monto) {
            return account.withdraw(monto);
        } else {
            return false;
        }
    }

    public boolean recibirPago(double monto) {
        if (monto > 0) {
            return account.deposit(monto);
        } else {
            return false;
        }
    }
}
