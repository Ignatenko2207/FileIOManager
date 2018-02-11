package org.itstep.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.itstep.model.Account;

public class AccountIO {
	

	private static final String SEP = System.getProperty("file.separator");
	
	private static final String FILE_PATH = System.getProperty("user.dir")+SEP+"outFile"+SEP+"myFile.csv"; //-> /outFile/myFile.csv;

	public static void writeAccToFile(Account acc) {
		
		FileWriter writer = null;
		try {
			writer = new FileWriter(FILE_PATH, true);
			String textToFile = acc.getLogin() + ", " + 
					acc.getPass() + ", " + 
					acc.getFirstName() + ", " + 
					acc.getSecondName() + ", " + 
					acc.getBirthDay() + ";\n" ;
			writer.write(textToFile);
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Account> readAccountsFromFile(){
		ArrayList<Account> accounts = new ArrayList<>();
		
		
		return accounts;
	}
}
