package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends AbstractAccount {
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        isValid(counterAccount);
        // 3. Look up counter account and make transfer object:
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount);
        return result;
    }
}
// end::CheckingAccount[]
