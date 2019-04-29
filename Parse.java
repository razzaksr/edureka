/*
Type conversion:
parsing:
between String to Other classes(wrapper) using respective wrapper class method
WrapperClass.parseType(String);eg: Integer.parseInt(String); Double.parseDouble(String);
*/
class Parse
{
public static void main(String[]  kitkat)
{
String mobNo="9876567887", password="ashwathi";
long mob=Long.parseLong(mobNo);
if(mob==9876567887L&&password=="ashwathi")
{
System.out.println("You Are In");
}
else
{
System.out.println("You suppose to check your details");
}
}
}