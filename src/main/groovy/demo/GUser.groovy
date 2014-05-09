package demo

class GUser {

	Integer id

	String username

	String firstName

	String lastName

	String password

	String email

	boolean enabled

	Date joinedOn

	String getFullName() { firstName  + ' ' + lastName }

	String toString() { username }
}
