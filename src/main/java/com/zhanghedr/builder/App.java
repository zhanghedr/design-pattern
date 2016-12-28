package com.zhanghedr.builder;

public class App {

	public static void main(String[] args) {
		User softwareEngineer = new User.UserBuilder("Howard",
				"howard@gmail.com").withPhone("2131231234")
				.withLocation("Los Angeles").withBio("Computer Software")
				.withAge(25).build();
		System.out.println(softwareEngineer.toString());

		User writer = new User.UserBuilder("Travis", "travis@gmail.com")
				.withLocation("New York").build();
		System.out.println(writer.toString());

		User teacher = new User.UserBuilder("Chris", "chris@gmail.com")
				.withPhone("532423422").withBio("Education").withAge(41)
				.build();
		System.out.println(teacher.toString());
	}
}
