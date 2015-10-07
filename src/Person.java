
public class Person {
	//PRIVATE INSTANCE VARIABLES
	private int _age;
	private boolean _isValid = false;

	// get/access method
	public int getAge() {
		return _age;
	}
	public boolean getIsValid() {
		return _isValid;
	}

	// set/mutator method
	public void setAge(int age) 
	{
		try
		{
			if(age < 0)
			{
				System.out.print("Please enter a positive number");
			}
			else
			{	
				this._age = age;
				this._isValid = true;
			}
		}
		catch(Exception e)
		{
			System.out.print("Please enter an integer value");
		}
	}
	
	Person(){
		
	}
	
	public String toString()
	{
		return "\nYou entered " + this._age;
	}
}
