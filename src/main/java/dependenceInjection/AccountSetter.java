package dependenceInjection;

import pojobeans.Account;
import pojobeans.AccountRepository;
import pojobeans.AccountService;

public  class AccountSetter implements AccountService{
    private AccountRepository accountRepository;

    public  void  setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {

    }

    public  void  depositMoney(long accountId, double amount) throws  Exception{
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance()+amount);
        accountRepository.update(account);
    }

    public Account getAccount(long accountId){
        return  accountRepository.find(accountId);
    }
}