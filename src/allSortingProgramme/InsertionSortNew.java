package allSortingProgramme;

abstract class bike
{
	abstract void run();
}
public class InsertionSortNew extends bike{
void run()
{
	System.out.print("hello");
}
	public static void main(String[] args) {
		bike obj = new InsertionSortNew();
		InsertionSortNew n= new InsertionSortNew();
		n.run();
		System.out.println();
		
		obj.run();
	}

}
