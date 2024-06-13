package if_statement;

public class If_else_if_statement {

	public static void main(String[] args) {
		String name = "megha";
		if (name != "megha") {
            System.out.println("the name is megha");
			} else if (name == "anjali") {
				System.out.println("the name is anjali");
			} else if (name == "monali") {
				System.out.println("the name is monali");
			} else {
				System.out.println("the name is not mention above");
			}

      char student = 'p';
       if (student == 'o') {
       System.out.println("name of student start with o");

	} else if (student == 'p') {
		System.out.println("name of student start with p");

	} else if (student == 'u') {
		System.out.println("name of student start with u");

	} else {
		System.out.println("name of student start with none of the above");

	}
       int i = 9;
      if (i == 0) {
    	  System.out.println("i is equal to 0");
      }else if (i >10) {
    	  System.out.println("i is equal to 10");
      }else if (i>=9) {
    	  System.out.println("i is 9");
      }else {
    	  System.out.println("false all condition");
      }
	
	}

}
