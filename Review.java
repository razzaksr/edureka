/*
Command Line Argument:
basic input option
pros:
1. user inputs to the var/obj
Cons:
1. Its static , because every inputs should be given while enter the run command
2. There is possibility of ArrayIndexOutOfBoundsException
3. Possibility of NumberFormatException
4. Every inputs you gonna give accepts as String

eg:
java Review Aswathi better 3
*/
class Review
{
public static void main(String[] cupcake)
{
String name, view;int rating;
name=cupcake[0];
view=cupcake[1];
rating=Integer.parseInt(cupcake[2]);
System.out.println("Your name: "+name);
System.out.println("Your view over the product: "+view);
System.out.println("Your rating out of 5 is: "+rating);
}
}

/*
Customer Card for Reliance market:
name, mobileNumber, address, email
*/