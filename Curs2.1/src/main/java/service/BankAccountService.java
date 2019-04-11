package service;

import model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BankAccountRepository;
import repositories.TransactionRepository;

@Service

public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;


    public void addbankAccount(BankAccount bankAccount){
        bankAccountRepository.insertBankAccount(bankAccount);


    }
    public void transferMoney(String fromIban, String toIban,double amount){
        BankAccount fromBankAccount = bankAccountRepository.getBankAccount(fromIban);

        BankAccount toBankAccount = bankAccountRepository.getBankAccount(toIban);

        if(fromBankAccount != null && toBankAccount != null)
        {
            double fromBankAccountBalance = fromBankAccount.getBalance();
            double toBankAccountBalance = toBankAccount.getBalance();

            fromBankAccount.setBalance(fromBankAccountBalance - amount );
            toBankAccount.setBalance(toBankAccountBalance+amount);


        }

    }

}
