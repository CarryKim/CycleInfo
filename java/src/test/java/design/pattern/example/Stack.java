package design.pattern.example;

public class Stack {

	static final int MAX_STACK = 10;
	private Object[] items;
	private int top;
	
	public Stack(){
		top = -1;
		items = new Object[MAX_STACK];
	}
	
	public boolean stackIsEmpty(){
		return (top < 0);
	}
	
	public boolean stackIsFull(){
		return (top >= MAX_STACK);	
	}
	
	public boolean push(Object newItem){
		if(stackIsFull())
			return false;
		else
		{
			top++;
			items[top] = newItem;
			return true;
		}
	}
	
	public Object pop(){
		if(stackIsEmpty())
			return null;
		else
			return items[top--];
	}
	
	public Object getStackTop(){
		if(stackIsEmpty())
			return null;
		else
			return items[top];
	}
	
	public void displayStack(){
		if(stackIsEmpty())
			System.out.println("Empty Stack\n");
		else{
			System.out.println("Stack\n----------");
			for(int i= top; i>=0; i--){
				System.out.println(items[i]);
				System.out.println(" ");
			}
				
		}
	}
	
}
