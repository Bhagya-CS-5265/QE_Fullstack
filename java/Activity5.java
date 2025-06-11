package Activities;

abstract class Book {
	String title;
	
	
	public abstract void setTitle(String title);
	
	public String getTitle()
	{
		return this.title;
	}
}


class MyBook extends Book{
	public void setTitle(String title)
	{
		if(title != null && !title.isEmpty())
		{
			this.title=title;
		}
	}
}
public class Activity5 {
	public static void main(String[] args) {
		Book someBook = new MyBook();
		someBook.setTitle("percy jackson and the titan's curse");
		System.out.println("book added is:" + someBook.getTitle());
	}


}
