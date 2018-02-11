package org.itstep;

import org.itstep.model.Account;
import org.itstep.service.AccountIO;

public class FileIORunner {
	
	public static void main(String[] args) {
		
		Account acc = new Account("AlexSuperPuper", "1234567", "AlexI", "Ignatenko", System.currentTimeMillis());
		
		AccountIO.writeAccToFile(acc);
		
	}
}
