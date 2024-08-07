package javaConfig;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import pojobeans.AccountRepository;
import pojobeans.AccountRepositoryImpl;
import pojobeans.AccountService;
import pojobeans.AccountServiceImpl;

@Configurable
public class BeanConfig {
    @Bean
     public AccountService accountService() {
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountRepository(accountDao());
           return  bean;
    }

@Bean
public AccountRepository accountDao(){
    AccountRepositoryImpl bean = new AccountRepositoryImpl();
    return  bean;
}
}