package switch_statement;

public class Switch_simple_example {

	public static void main(String[] args) {
		int a = 5;
		String b = "just_ex.";
		
		switch(b){
		case "first" :
			System.out.println("excecute if statement is true");
			break;
		case "just_ex" :
			System.out.println("execute if statement is true");
			break ; 
		case "just_ex.":
			System.out.println("execute if statement is just for example");
			break;
			default :
				System.out.println("execute if all are not valid");
				break;
		}
		
	}

}
