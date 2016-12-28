package com.zhanghedr.builder;

public final class User {

	private final String name; // required
	private final String email; // required
	private final String phone; // optional
	private final String location; // optional
	private final String bio; // optional
	private final int age; // optional

	private User(UserBuilder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.phone = builder.phone;
		this.location = builder.location;
		this.bio = builder.bio;
		this.age = builder.age;
	}

	@Override
	public String toString() {
		return String
				.format("name: %s, email: %s, phone: %s, location: %s, bio: %s, age: %s",
						name, email, phone, location, bio, age);
	}

	public static class UserBuilder {

		private final String name;
		private final String email;
		private String phone;
		private String location;
		private String bio;
		private int age;

		public UserBuilder(String name, String email) {
			if (name == null || email == null)
				throw new IllegalArgumentException("name or email is null");
			this.name = name;
			this.email = email;
		}

		public UserBuilder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder withLocation(String location) {
			this.location = location;
			return this;
		}

		public UserBuilder withBio(String bio) {
			this.bio = bio;
			return this;
		}

		public UserBuilder withAge(int age) {
			this.age = age;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

}
