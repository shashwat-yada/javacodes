class studenti
{
void study()
{
system.out.println("yes student is very big.....");
}}

class otherstudent extends student;
void display()
{
system.out.println("yes student is not interested...");
}
}
class teacher
{
public static void main(string args[])
{

otherstudent obj= new otherstudent();
obj.study();
obj.display();
}
}






