package project;

import static project.Utils.*;

public class Main {
	public static void main(String[] args) {
		Service ss = new Service();
		
		boolean run = true;
		
		while (run) {
			logInRegistBar();
			ss.logInRegist(nextInt());
			
			menuBar();
			switch(nextInt()) {
			case 1:
				ss.tourList();
			case 2:
				ss.searchByRegion();
			case 3:
				ss.favLists();
			case 4:
				break;
			case 5:
				return;
			}
		}
	}
}
