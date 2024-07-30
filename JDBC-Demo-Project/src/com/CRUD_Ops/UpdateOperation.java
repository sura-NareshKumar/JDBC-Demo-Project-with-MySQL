package com.CRUD_Ops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {
	public static void updateUser(int id, String name, int age) {
		String query = "UPDATE users SET name = ?, age = ? WHERE id = ?";

		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, name);
			statement.setInt(2, age);
			statement.setInt(3, id);
			statement.executeUpdate();
			System.out.println("User updated successfully.");

		} catch (SQLException e) {
			System.out.println("something went wront");
			System.out.println(e.getMessage());
		}
	}
}
