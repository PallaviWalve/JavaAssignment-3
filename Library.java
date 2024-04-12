package assignment3;
class Book
{
	private String name;
	private int number;
	
	public Book(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void add()
	{
		setName(getName());
		setNumber(getNumber());
	}
	
	@Override
	public String toString() {
		return"\nBook name :" + name 
		    + "\nnumber    :" + number;
	} 
}

public class Library {


	public static void main(String[] args) 
	{
		Book book[] =new Book[3];
		book[0]=new Book("java", 10);
		book[1]=new Book ("sql",2);
		book[2]=new Book ("DATABASE",4);
		for (int i = 0; i < book.length; i++) 
		{
			System.out.println(book[i]);
		}

	}


}
