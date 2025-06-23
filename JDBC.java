import java.sql.*;


public class JDBC {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";

    private static final String username= "root";

    private static final String password ="root123";


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());

        }

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id  = resultSet.getInt("id");
                String name = resultSet.getString("Name");
                String marks = resultSet.getString("Marks");
                System.out.println("ID"+ id);
                System.out.println("NAME"+ name);
                System.out.println("Marks"+ marks);
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
// Command run in sql shell
/*
copy the the instance path from workbench by pressing right click onit
 then type the following command :-
 1.\connect root@localhost:3306 to connect the datbase
 2.\sql show databases ; to show the database present in it
 3.\sql use mydb ; to use the database in my case its mydb
 4.\sql create table student (id int Primary Key , name varchar (55), marks varchar(40)); to create a table of information n database
 5.  \sql insert into student(id,name,marks) values(1,"Prathmesh","73"); to insertt the data into the table
  by running above command it will display the table in sqlshell
  */


