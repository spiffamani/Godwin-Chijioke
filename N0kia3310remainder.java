// Entry for Tones case 5 	

		String tones = """
			5. Tones
			1.Ringing tone
			2.Ringing volume
			3.Income call alert
			4.Composer
			5.Message alert tone
			6.Keypad tones
			7.Warning and game tones
			8.Vibrating alert
			9.Score saver
		""";
		int Tones = input.nextInt();
		switch(Tones){
		case 1:
			System.out.println("Ringing tone");
			break;
		case 2:
			System.out.println("Ringing tone");
			break;
		case 3:
			System.out.println("Income call alert");
			break;
		case 4:
			System.out.println("Composer");
			break;
		case 5:
			System.out.println("Message alert tones");
			break;
		case 6:
			System.out.println("Keypads tones");
			 break;
		case 7:
			System.out.println("Warning and game tones");
			break;
		case 8:
			System.out.println("Vibrating alert");
			break;
		case 9:
			System.out.println("Score saver");
			break;

		default:
		break;
}




// Entry for settings case 6

			String settings = """
				6: Settings
				1:Call settings
				2:phone setting
				3:Security setting
				4:Restore factory setting
			""";

          int Setting = input.nextInt();
		switch(Setting) {
		case 1:System.out.println("call settings");
			System.out.println("1.Automatic redial");
			System.out.println("2.Speed dialling");
			System.out.println("3.Calling waiting options");
			System.out.println("4.Own number sending");
			System.out.println("5.Phone line in use ");
			System.out.println("6:Automatic answer");


int automatic = input.nextInt();
		switch(automatic) {
		case 1:
		System.out.println("Automatic redial");
		break;
		case 2:
		System.out.println("Speed dialing");
		break;
		case 3:
		System.out.println("Calling waiting options ");
		break;
		case 4:
		System.out.println("Own number sending");
		break;
		case 5: 
		System.out.println("Phone line in use ");
		break;
		case 6:
		System.out.println("Automatic answer");
		break;
	default:
	break;
}
	break;



		

 			case 2:
				System.out.println("Phone setting");
				System.out.println("1.language");
				System.out.println("2.Cell info display");
				System.out.println("3.Welcome note");
				System.out.println("4.Network selection");
				System.out.println("5.Lights");
				System.out.println("6.Confirm sim service actions ");

			int phonesetting = input.nextInt();
				switch(phonesetting) {
				case 1:
				System.out.println("language ");
				break;
				case 2:
				System.out.println("Cell info display");
				break;
				case 3:
				System.out.println("Welcome note ");
				break;
				case 4:
				System.out.println("Network selection");
				break;
				case 5:
				System.out.println("Lights");
				break;
				case 6:
				System.out.println("Confirm sim servive actions ");
				break;
			default:
			break;
			}
			break;

		
		
		

			case 3:
				System.out.println("Security settings");
				System.out.println("1.Pin code request");
				System.out.println("2.Call barring service");
				System.out.println("3.Fixed dialing");
				System.out.println("4.Closed user group");
				System.out.println("5.Phone seurity");
				System.out.println("6.Change access codes ");
			int Security = input.nextInt();
				switch(Security) {
				case 1:
				System.out.println("Pin code request ");
				break;
				case 2:
				System.out.println("Call barring service");
				break;
				case 3:
				System.out.println("Fixed dialling ");
				break;
				case 4:
				System.out.println("Closed user group");
				break;
				case 5:
				System.out.println("Phone security");
				break;
				case 6:
				System.out.println("Change access codes ");
				break;
			default:
			break;
			}
			break;
		
		

		case 4 :
			System.out.println("Restore factory settings");
			break;
		default:
		break;
		
		}
	
		
	
	
	// Entry for call Divert case 7
				
	String Divert =   """

	7: Call divert
			
        """;


	int divert = input.nextInt();

	switch(divert) {
		case 7:
			System.out.println("call divert");
			break;
		default:
		break;
		
		}
		
	

// Entry for Games case 8
				
	String Games =   """

	8: Games
			
        """;


	int games = input.nextInt();

	switch(games) {
		case 8:
			System.out.println("Games");
			break;
		default:
		break;
		
		}
		




// Entry for Calculator case 4
				
	String Calculator =   """

	9: Calculator
			
        """;


	int calculator = input.nextInt();

	switch(calculator) {
		case 9:
			System.out.println("call divert");
			break;
		default:
		break;
		
		}
		

// Entry for call Divert case 10
				
	String remainder =   """

	10: Remainder
			
        """;


	int Remainder = input.nextInt();

	switch(Remainder) {
		case 10:
			System.out.println("call divert");
			break;
		default:
		break;
		
		}
		


// Entry for call Divert case 11
				
	String Clock =   """

	11: Clock
	
			
        """;


	int clock= input.nextInt();

	switch(clock) {
		case 11:
			System.out.println("Clock");
			case 1:
				System.out.println("1.Alarm clock ");
				System.out.println("2.Clock settings");
				System.out.println("3.Date setting");
				System.out.println("4.Stopwatch");
		 		System.out.println("5.Countdown timer");
				System.out.println("6.Auto update of date and time ");
				
			int printclock = input.nextInt();
			switch(printclock){
				case 1:
				System.out.println("Alarm clock ");
				break;
				case 2:
				System.out.println("Clock setting");
				break;
				case 3:
				System.out.println("Date setting");
				break;
				case 4:
				System.out.println("Stopwatch");
				break;
				case 5:
				System.out.println("Countdown timer");
				break;
				case 6:
				System.out.println("Auto update of date and time ");
				break;
			
			default:
			break;
		
			}
			
// Entry of profile case 12
				
	String profile =   """

	12: profile
			
        """;


	int Profile = input.nextInt();

	switch(Profile) {
		case 12:
			System.out.println("Profile");
			break;
		default:
		break;
		
		}



//Entry for Sim services 13
				
	String simservices =   """

	13: services
			
        """;


	int Simservices = input.nextInt();

	switch(Simservices) {
		case 13:
			System.out.println("Sim services");
			break;
		default:
		break;
		
		}

		


}
}
}

}











