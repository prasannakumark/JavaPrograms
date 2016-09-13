public class DefaultConstructor2{

 int id;
 String name;

public void display(){
System.out.println(id+" "+name);
}

public static void main(String args[]){
DefaultConstructor2 d= new DefaultConstructor2();
DefaultConstructor2 dd = new DefaultConstructor2();
 

d.display();
dd.display();
}

}
