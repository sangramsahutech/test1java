public class Hello1{
	public static void main(String args[]){
		Attendee[] arr = new Attendee[10];
		Attendee obj1 = new Attendee();
		obj1.name = "Sangram";
		obj1.progExp = 2.3;
		obj1.city="Kuala lumpur";
		arr[0]=obj1;
		System.out.println(arr[0].display());
		arr[1].name = "Amit";
		arr[1].progExp = 5.2;
		arr[1].city="Kolkata";
		System.out.println(arr[1].display());
	}
}
class Attendee{
	String name;
	double progExp;
	String city;
	String display(){
		return "Attendee name is: "+name+" having programming experience: "+progExp+" from city: "+city;
	}
}