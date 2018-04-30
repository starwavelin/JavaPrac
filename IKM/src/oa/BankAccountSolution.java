package oa;

import java.text.MessageFormat;
import java.util.*;

public class BankAccountSolution {	
	
	private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";

    public static void main(String args[] ) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new SavingsAccount("USD",3));//Savings
        accounts.add(new SavingsAccount("EUR",2));//Savings
        accounts.add(new CheckingAccount("HUF",100));//Checking
        accounts.add(new CheckingAccount("COP",10000));//Checking
        accounts.add(new BrokerageAccount("GBP",2));//Brokerage
        accounts.add(new BrokerageAccount("INR",600));//Brokerage
        
        accounts.stream().forEach(
                                    account -> System.out.println(
                                        MessageFormat.format(TEXT,
                                            new Object[]{
                                            account.getAccountType().getName(),//make this work
                                            account.getUnits(),//make this work
                                            account.getCurrency()//make this work
                                                           })));
    }
}

enum AccountType {
	SAVINGS("Savings"),
	CHECKING("Checking"),
	BROKERAGE("Brokerage");
	
	String name;
	
	AccountType(String name) {
		this.name = name;
	}
	
	public String getName() { return name; }
}

class BankAccount {
	String currency;
	int units;
	AccountType accountType;
	
	public BankAccount(String currency, int units) {
		this.currency = currency;
		this.units = units;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public int getUnits() {
		return units;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
}

class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String currency, int units) {
		super(currency, units);
		accountType = AccountType.SAVINGS;
	}
}

class CheckingAccount extends BankAccount {
	public CheckingAccount(String currency, int units) {
		super(currency, units);
		accountType = AccountType.CHECKING;
		// TODO Auto-generated constructor stub
	}
}

class BrokerageAccount extends BankAccount {
	public BrokerageAccount(String currency, int units) {
		super(currency, units);
		accountType = AccountType.BROKERAGE;
		// TODO Auto-generated constructor stub
	}
}
