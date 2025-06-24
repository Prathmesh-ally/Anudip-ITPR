import java.sql.*;  // importing all necessary classes for JDBC operations

public class JDBC_CRUDoperation {

    // Database connection details
    private static final String url = "jdbc:mysql://localhost:3306/mydb"; // Replace 'mydb' with your database name
    private static final String username = "root"; // MySQL username
    private static final String password = "root123"; // MySQL password

    public static void main(String[] args) {
        try {
            // Loading MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        }

        try {
            // Establishing connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // ----------------- INSERT BLOCK (Commented Out) -------------------
            /*
            // INSERT Operation
            // Constructing the SQL insert query
            String insertQuery = String.format("INSERT INTO student(id, name, marks) VALUES (%d, '%s', '%s')", 3, "Aditya", "75");

            // ✅ executeUpdate() is correct for INSERT
            int insertRowAffected = statement.executeUpdate(insertQuery);

            if (insertRowAffected > 0) {
                System.out.println("DATA INSERTED SUCCESSFULLY");
            } else {
                System.out.println("DATA NOT INSERTED");
            }
            */
            // -------------------------------------------------------------------

            // ----------------- UPDATE BLOCK (Commented Out) -------------------
            /*
            // UPDATE Operation
            // Example: Updating marks for student where id = 3
            String updateQuery = String.format("UPDATE student SET marks = '%s' WHERE id = %d", "85", 3);

            int updateRowAffected = statement.executeUpdate(updateQuery);

            if (updateRowAffected > 0) {
                System.out.println("DATA UPDATED SUCCESSFULLY");
            } else {
                System.out.println("DATA NOT UPDATED");
            }
            */
            // -------------------------------------------------------------------

            // ✅ DELETE Operation (Active Code)
            // Delete student with ID = 3
            String deleteQuery = "DELETE FROM student WHERE id = 3";

            int deleteRowAffected = statement.executeUpdate(deleteQuery);

            if (deleteRowAffected > 0) {
                System.out.println("DATA DELETED SUCCESSFULLY");
            } else {
                System.out.println("DATA NOT FOUND OR NOT DELETED");
            }

            // Uncomment below section for data retrieval (SELECT)
            /*
            String selectQuery = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(selectQuery); // This is correct for SELECT queries

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String marks = resultSet.getString("marks");

                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
                System.out.println("MARKS: " + marks);
                System.out.println("---------------------------");
            }
            */

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }

    }
}

// Command run in SQL Shell:
/*
copy the instance path from Workbench by right-clicking on it
then type the following commands in MySQL Shell:

1. \connect root@localhost:3306          --> to connect to the MySQL server
2. \sql show databases;                  --> to show all databases
3. \sql use mydb;                        --> to select your database (replace 'mydb' accordingly)
4. \sql create table student (
       id int Primary Key,
       name varchar(55),
       marks varchar(40)
   );                                     --> to create the 'student' table

Alternatively:
\sql show tables;                        --> to list tables
\sql select * from student;             --> to view existing records

5. \sql insert into student(id, name, marks) values(1, "Prathmesh", "73"); --> to insert manually in SQL Shell
   Running the Java program will perform DELETE if the ID exists.
*/
