package annotationConfig;

import org.springframework.stereotype.Repository;
import pojobeans.Account;
import pojobeans.AccountRepository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Repository
public  class AccountRepository2Impl implements AccountRepository {
    private Map<Long, Account> accountMap;

    @PostConstruct
    public  void initData(){
        accountMap = new HashMap<>();

        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("John");
        account1.setBalance(10.0);

        Account account2 =new Account();
        account2.setId(2L);
        account2.setOwnerName("Mary");
        account2.setBalance(20.0);

        accountMap.put(account1.getId(),account1);
        accountMap.put(account2.getId(),account2);
    }

    @Override
    public void insert(Account account) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public Account find(long accountId) {
        return accountMap.get(accountId);
    }
}
