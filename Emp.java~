class Address {
String city,state,country;

public Address(String city, String state, String country) {
	this.city = city;
	this.state = state;
	this.country = country;
}

}

public class Emp{

int id;
String name;
Address address;

public Emp(int id, String name, Address address){
this.id= id;
this.name= name;
this.address = address;
}
public void display(){

System.out.println(id+" "+name);
System.out.println(address.city+" " + address.state + " "+ address.country);
}
public static void main(String args[]){
Address address1 = new Address("hhh", "bvv", "nbh");
Address address2 = new Address("bvb", "jj","hvg");

Emp e = new Emp(111,"bbb", address1);
Emp e1 = new Emp (222, "ggg", address2);

e.display();
e1.display();
}
}
