package inheritanceOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.courseName = "JAVA";
		
		Course course2 = new Course();
		course2.courseName =" C#";
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.courseName);	
		}
		
		System.out.println(courses.length);
		
		Category category1 = new Category();
		category1.name = "Kodlama IO";
		
		CourseManager courseManager = new CourseManager();
		courseManager.course(course2);
	}
}
