package com.CRUD_Ops;

public class Main {
	public static void main(String[] args) {
		// Create
		CreateOperation.createUser("Naresh", 23);

		// Read
		ReadOperation.readUsers();

		// Update
		UpdateOperation.updateUser(1, "Naresh Sura", 25);

		// Read
		ReadOperation.readUsers();

		// Delete
		DeleteOperation.deleteUser(1);

		// Read
		ReadOperation.readUsers();
	}
}
