package project;

import static project.Utils.*;

public class Service {
	static void logInRegist(int choice) {
		switch(choice) {
		case 1:
			boolean logInSuccess = false;
			do {
				logInSuccess = login();
			} while (!logInSuccess);
			break;
		case 2:
			register();
			boolean logInSuccess2 = false;
			
			do {
				logInSuccess2 = login();
			} while (!logInSuccess2);
			break;
		default :
			break;
		}
	}
	
	static void tourList() {
		
	}
	static void searchByRegion() {
		
	}
	static void favLists() {
		
	}
}
