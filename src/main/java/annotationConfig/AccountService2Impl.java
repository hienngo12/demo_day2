package annotationConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pojobeans.Account;
import pojobeans.AccountRepository;
import pojobeans.AccountService;

@Service("accountService")
public class AccountService2Impl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {

    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {

    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}

