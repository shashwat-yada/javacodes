class student
{
int roll_number;//instance variable//data member                   
string name;//instance variable//data member
private:
void display()//member function 
{
System.out.println("roll number:"+rollnumber);
System.out.println("name:"+name);
}
public static void main(String args[])
{
student s1 = new student();// implicit call
s1.rollnumber=23;
s1.name="shan";
s1.display();//expilicilty call 

}

}















