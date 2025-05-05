import java.util.Scanner;

public class NokiaPhone3310  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int control;
	String phoneBook;
	String options;
	String message;
	String messegesetting;


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
    	
        control = input.nextInt();
	switch(control){
		case 1:phoneBook ="""
		1.Search
		2.Search Nos
		3.Add name
		4.Erase
		5.Edit
		6.Assign tone
		7.Send b' card
		8.Option
		9.Speed dials
		10.Voice tags

""";
System.out.println(phoneBook);
control = input.nextInt();
		 switch(control){
			case 1: System.out.println("Search");break;
			case 2:System.out.println("Service Nos"); break;
			case 3:System.out.println("Add name"); break;
			case 4:System.out.println("Erase"); break;
			case 5:System.out.println("Edit"); break;
			case 6:System.out.println("Assign tone"); break;
			case 7:System.out.println("Send b' card"); break;
			case 8: options = """
			1.Type of view
			2.Memory status


""";
System.out.println(options);
control = input.nextInt();
			switch(control){
				case 1:System.out.println("Type of view"); break;
				case 2:System.out.println("Memory status");  break;


}


break;   
			case 9: System.out.println("Speed dial");break;
			case 10: System.out.println("Voice tags");break;
						 

}

break;
// Entery for messages
control = input.nextInt();
switch(control){
		case 2: messages = """
		1.Write messages
		2.Inbox
		3.outbox
		4.Picture  messages
		5.Template
		6.Smileys
		7.Message settings
		8.info service
		9.Voice mailbox number
		10. Service command editor


""";
}
System.out.println(messages);
control = input.nextInt();
			switch(control){
			case 1:System.out.println("Write messages"); break;
			case 2:System.out.println("Inbox"); break;
			case 3:System.out.println("Outbox"); break;
			case 4:System.out.println("Picture message"); break;
			case 5:System.out.println("Template"); break;
			case 6:System.out.println("Smileys"); break;
			case 7: message setting = """
				1.set
				2.common

""";
System.out.println(messagesetting);
control = input.nextInt();
			switch(control){
			





}


			case 8:System.out.println("Write messages"); break;
			case 9: System.out.println("Write messages");break;
			case 10:System.out.println("Write messages"); break;	



}
			
break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: break;
		case 7: break;
		case 8: break;
		case 9: break;
		case 10: break;
		case 11: break;
		case 12: break;
		case 13: break;











		
		


}
}
}