package com.CRUD_Ops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateOperation {
	public static void createUser(String name, int age) {
		String query = "INSERT INTO users (name, age) VALUES (?, ?)";

		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, name);
			statement.setInt(2, age);
			statement.executeUpdate();
			System.out.println("User created successfully.");

		} catch (SQLException e) {
			System.out.println("something went wront");
			System.out.println(e.getMessage());
		}
	}
}
