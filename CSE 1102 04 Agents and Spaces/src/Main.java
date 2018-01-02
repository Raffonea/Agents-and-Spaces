//CSE 1102 03 Calculator
//Alex Raffone
//Jagriti Das
//section 2L-1153
//February 15, 2015

public class Main {
	public static void main(String[] args){
		 Space classroom = new Space();
		 classroom.setName("classroom:");
		 classroom.setDescription("a large lecture hall");
		 Space sidewalk = new Space();
		 sidewalk.setName("sidewalk");
		 sidewalk.setDescription("a plain concrete sidewalk with weeds growing through the cracks");
		 Portal door = new Portal();
		 door.setName("door");
		 door.setDirection("outside");
		 door.setDestination(sidewalk);
		 classroom.setPortal(door);
		 Agent student = new Agent();
		 student.setName("Harry Potter");
		 student.setLocation(classroom);
		 System.out.println(student.toStringLong());
		 door.transport(student);
		 System.out.println(student.toStringLong());
	}
}
