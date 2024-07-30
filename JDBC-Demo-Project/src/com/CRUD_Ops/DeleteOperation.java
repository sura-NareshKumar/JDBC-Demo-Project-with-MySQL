package com.CRUD_Ops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {
	public static void deleteUser(int id) {
		String query = "DELETE FROM users WHERE id = ?";

		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, id);
			statement.executeUpdate();
			System.out.println("User deleted successfully.");

		} catch (SQLException e) {
			System.out.println("something went wront");
			System.out.println(e.getMessage());
		}
	}
}
