package com.student.management.system.opps;

public class CollectionRunner1 {

	public static void main(String[] args) {
		
		Student s1 = new SportStudent.SportStudentBuilder("Rajesh", 19, "Akola", "9090903434").withSportsScore(88)
				.withMarksObtainedInEnglish(93).withMarksObtainedInMath(94).withMarksObtainedInScience(91)
				.withRollNumber(25).build();
		
		Student s2 = new RegularStudent.RegularStudentBuilder("Krishna", 18,"Akola", "9898344493")
				.withMarksObtainedInEnglish(87).withMarksObtainedInMath(69).withMarksObtainedInScience(78)
				.withRollNumber(26).build();

	}

}
