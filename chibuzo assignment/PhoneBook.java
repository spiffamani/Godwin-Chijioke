import java.util.Scanner;

public class PhoneBook {

public static void main(String[]args){

Scanner input = new Scanner(System.in);

String phonemenu = """ 
	Menu Functions
	1: Phone Book 
	2: Message
	3: Chat
	4: Call Register
	5: Tones
	6: Settings
	7:Call Diverts
	8:Games
	9:Calculator
	10:Remainder
	11:Clock
	12:Profile
	13:Sim Services 
""";
System.out.println(phonemenu);

//  menu function entry

System.out.println("1:Phone Book");
int phonebook = input.nextInt();

//  case1 phone book entry

switch(phonebook) { 
	case 1 : System.out.println("search") ;
	break;
	case 2 :System.out.println("Service Nos");
	break;
	case 3: System.out.print("Add name");
	break;
	case 4: System.out.println("Erase");
	break;
	case 5: System.out.println("Edit");
	break;
	case 6:System.out.println("Assign tone");
	break;
	case 7:System.out.println("Send b' card");
	break;
	case 8:System.out.println("Option");
	System.out.println("1:Type of view ");     
	 System.out.println("2:Memory status ");
	
//case 8 option
int  pick = input.nextInt();
	switch(pick) {
	case 1: System.out.println("Type of view");
	break;
	case 2: System.out.println("Memory status");
	break;
	default:
	break;
	
	break;	
        
	case 9: System.out.print("Speed dials") ;
	break;
	
  	case 10:System.out.println("Voice tag");
	break;
	
	default:
	break;
	
	
// Entry for case 2 (messages)

String message = """

	Messages
	1:Write message
	2:Inbox
	3:Outbox
	4:Picture messages
	5:Templates
	6:Smileys
	7:Message settings
	8:Info service
	9:Voice mailbox number
	10:Service command editor
""";
System.out.print(message);

System.out.println("2:messages");
int messages = input.nextInt();

switch (messages) {
	case 1:System.out.println("Write message");
	break;
	case 2:System.out.println("Inbox");
	break;
	case 3:System.out.println("Outbox");
	break;
	case 4:System.out.println("Picture messages");
	break;
	case 5:System.out.println("Templates");
	break;
	case 6:System.out.println("Smiley");
	break;
	case 7:System.out.println("Message settings");
	System.out.println("1:Set 1");
	System.out.println("2:Common");


// the sub part of message setting 
	
int settings = input.nextInt();
	switch (settings) {
	case 1:System.out.println("Set 1");

int messagecentre = input.nextInt();
	switch(messagecentre) {

	case 1:System.out.println("Message centre number");
	break;
 	case 2:System.out.println("Message sent as ");
	break;
	case 3:System.out.println("Message validity");
	break;
	default:
	break;
     

// sub part in between set 1 and common

int common = input.nextInt();
	
	case 2:System.out.println("Common");
	System.out.println("1.Delivery reports");
	System.out.println("2.Reply via same centre");
	System.out.println("3.Character support");
	break;
        
int common = input.nextInt();
	switch(common){
	case 1:System.out.println("Delivery reports");
	break;
	case 2:System.out.println("Reply via same centre");
	break;
	case 3:System.out.print("Character support");
	break;
	default:
	break;
	
	

// sub part between common and case 8

int infoservice = input.nextInt();
	
	case 8:System.out.println("Info service");
	break;
	case 9:System.out.println("Voice mailbox number");
	break;
	case 10:System.out.println("Service command editor");
	break;
	default:
	break;
     
  
// Entry of case 3 (chat)

String chat = """


	 
""";
	
	
System.out.println("3:Chat");
int Chat = input.nextInt();
	switch( Chat) {
	case 1:System.out.println("Chat");
	break;

   
// Entry of case 4 (call register)
String Callregister = """


	1 : Call register
""";

System.out.println("4:Call register");
int callregister = input.nextInt();
	switch(callregister){ 
	case 1:System.out.println(" Call register");
	break;
	case 2:System.out.println("Received calls ");
	break;
	case 3: System.out.println("Dialled numbers");
	break;
	case 4:System.out.print("Erase recent call lists");
	break;
	case 5: System.out.print("---Show call duration");
	System.out.println("1. Last call duration");
	System.out.println("2. All calls' duration");
	System.out.println("3.Received calls'duration");
	System.out.println("4.Dialled calls' duration");
	System.out.println("5.Clear timers");
    
// Entry of case 5 sub request

int callduration = input.nextInt();
	switch(callduration) {
	case 1:System.out.println("Last call duration");
	break;
	case 2:System.out.println("All calls' duration");
	break;
	case 3:System.out.println("Received calls' duration");
	break;
	case 4:System.out.println("Dialled calls' duration");
	break;
	case 5:System.out.println("clear timers");
	break;
	default:
	break;
	
	
    
     
int cost = input.nextInt();
	case 6: System.out.println("Show call costs");
	System.out.println("1:Last call cost");
	System.out.println("2:All calls' duration");
	System.out.println("3:Clear counters");
       int cost = input.nextInt();
	
	case 1:System.out.println("Last calls cost");
	break;
	case 2:System.out.println("All calls' duration");
	break;
	case 3:System.out.println("Clear counters");
	break;
	default:
        break;
    
   } 
        	                                       