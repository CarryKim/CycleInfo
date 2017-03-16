package design.pattern.example;

public class StackExample {

	public static void main(String args[]){
		
		System.out.println("Start Stack\n-------------------\n");
		Stack example = new Stack();
		
		example.displayStack();
		
		String one = new String("1");
		System.out.println("push: ");
		
		if(example.push(one))
			System.out.println(one);
		else
			System.out.println("Insert Failed");
		example.displayStack();
		
		String two = new String("2");
		System.out.println("push: ");
		if(example.push(two))
			System.out.println(two);
		else
			System.out.println("Insert Failed");
		example.displayStack();
		
		
		Object result;
		
		System.out.println("pop: ");
		result = example.pop();
		if(result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.displayStack();
		
		System.out.println("pop: ");
		result = example.pop();
		if(result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.displayStack();
		
		System.out.println("pop: ");
		result = example.pop();
		if(result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.displayStack();
		
				
	}

}
