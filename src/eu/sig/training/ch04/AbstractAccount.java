package eu.sig.training.ch04;

/**
 * Created by atarsa on 22.11.16.
 */
public class AbstractAccount {

    protected void isValid(String counterAccount) throws BusinessException {
        int sum = ChecksumUtils.createSum(counterAccount);
        if (sum % 11 != 0) {
            throw new BusinessException("Invalid account number!");
        }
    }
}
