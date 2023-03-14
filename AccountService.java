package edu.jsp.service;

import java.util.Scanner;


import edu.jsp.dao.AccountDao;
import edu.jsp.dto.Account;

public class AccountService {

	public static void main(String[] args) {
		System.out.println("Hi Welcome to AccountService");
		Scanner read = new Scanner(System.in);
		AccountDao dao = new AccountDao();
		while (true) {
			System.out.println("Select Your Option:");
			System.out.println("1:Save\n2:Read\3:Exist");
			int ch = read.nextInt();
			switch (ch) {
			case 1:
      Account account = new Account ();
      account.setName("tindi");
      account.setEmail("tinga@abc.in");
      account.setAddress("tingapur");
//      AccountDao dao = new AccountDao();
      dao.saveAccount(account);
      break;
      
			case 2:
				System.out.println("Enter the Account Id:");
				int id = read.nextInt();
				Account account1 = dao.findAccountById(id);
				System.out.println(account1.getId()+"\t"+account1.getName()+"\t"+account1.getCreatedDateTime());
                 
				default:
					break;
	}

}
	}
}
