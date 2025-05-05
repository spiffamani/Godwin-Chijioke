import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String phonemenu = """ 
            Menu Functions
            1: Phone Book 
            2: Message
            3: Chat
            4: Call Register
            5: Tones
            6: Settings
            7: Call Diverts
            8: Games
            9: Calculator
            10: Remainder
            11: Clock
            12: Profile
            13: Sim Services 
        """;
        System.out.println(phonemenu);

        // Menu function entry
        System.out.println("1: Phone Book");
        int phonebook = input.nextInt();

        // Case 1: Phone book entry
        switch (phonebook) {
            case 1:
                System.out.println("search");
		
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b' card");
                break;
            case 8:
                System.out.println("Option");
                System.out.println("1: Type of view");
                System.out.println("2: Memory status");
                // Case 8 option
                int pick = input.nextInt();
                switch (pick) {
                    case 1:
                        System.out.println("Type of view");
                        break;
                    case 2:
                        System.out.println("Memory status");
                        break;
                    default:
                        break;
                }
                break;
            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tag");
                break;
		
            default:
                break;
        }

        // Entry for case 2 (messages)
        String message = """
            Messages
            1: Write message
            2: Inbox
            3: Outbox
            4: Picture messages
            5: Templates
            6: Smileys
            7: Message settings
            8: Info service
            9: Voice mailbox number
            10: Service command editor
        """;
        System.out.println(message);

        System.out.println("2: messages");
        int messages = input.nextInt();

        switch (messages) {
            case 1:
                System.out.println("Write message");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smiley");
                break;
            case 7:
                System.out.println("Message settings");
                System.out.println("1: Set 1");
                System.out.println("2: Common");
                // Sub part of message setting
                int settings = input.nextInt();
                switch (settings) {
                    case 1:
                        System.out.println("Set 1");
                        int messagecentre = input.nextInt();
                        switch (messagecentre) {
                            case 1:
                                System.out.println("Message centre number");
                                break;
                            case 2:
                                System.out.println("Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Common");
                        System.out.println("1: Delivery reports");
                        System.out.println("2: Reply via same centre");
                        System.out.println("3: Character support");
                        int common = input.nextInt();
                        switch (common) {
                            case 1:
                                System.out.println("Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via same centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            default:
                break;
        }

        // Entry for case 3 (chat)
        String chat = """

	  3: Chat

           1: Chat

        """;
        System.out.println("1:Chat");
        int Chat = input.nextInt();
        switch (Chat) {
            case 1:
                System.out.println("1.Chat");
                break;
            default:
                break;
        }

        // Entry for case 4 (call register)
        String Callregister = """
         4: Call register
	 1:Missed calls
	 2:Received calls
	 3:Dialled numbers
	 4:Erase recent call lists
	 5:Show call duration
	 6:Show call costs
	 7:call cost settings
	 8:Prepaid credit
        """;
        System.out.println(Callregister);




	System.out.print("4.Call register");
        int callregister = input.nextInt();
        switch (callregister) {
            case 1:
                System.out.println("Call register");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                System.out.println("5.Show call duration");
                System.out.println("1. Last call duration");
                System.out.println("2. All calls' duration");
                System.out.println("3. Received calls' duration");
                System.out.println("4. Dialled calls' duration");
                System.out.println("5. Clear timers");
                int callduration = input.nextInt();
                switch (callduration) {
                    case 1:
                        System.out.println("Last call duration");
                        break;
                    case 2:
                        System.out.println("All calls' duration");
                        break;
                    case 3:
                        System.out.println("Received calls' duration");
                        break;
                    case 4:
                        System.out.println("Dialled calls' duration");
                        break;
                    case 5:
                        System.out.println("Clear timers");
                        break;
                    default:
                        break;
                }
                break;
            case 6:
	
                System.out.println("6.Show call costs");
                System.out.println ("1:Last call cost");
                System.out.println ("2:All calls' cost");
                System.out.println ("3:Clear counters");

		

                int cost = input.nextInt();
		switch (cost) {
                    case 1:
                        System.out.println("Last call cost");
                        break;
                    case 2:
                        System.out.println("All calls' cost");
                        break;
                    case 3:
                        System.out.println("Clear counters");
                        break;
                    default:
                        break;
                }
                
        
 
       
    


	
	case 7:
		System.out.println("7.call cost settings");
		System.out.println("1:call cost limit");
		System.out.println("2:Show costs in");

		int calls = input.nextInt();
		switch(calls) {
		    case 1:
			System.out.println("call cost");
		    	break;
		    case 2:
			System.out.println("show costs in");
			break;
		    default:
			break;
		}
		
	    
	
	

		case 8: 
			System.out.println("Prepaid credit");
			int credit =input.nextInt();
			switch(credit){
			  case 1:System.out.println("prepaid credit");
			   break;
			default:
			break;
		}
     




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
		System.out.print("5. Tone");
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











   
			
	
