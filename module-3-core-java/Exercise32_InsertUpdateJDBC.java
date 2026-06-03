import java.sql.*;

public class Exercise32_InsertUpdateJDBC {

    private static final String URL =
            "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void insertStudent(int id, String name, int age) {

        String sql =
                "INSERT INTO students(id,name,age) VALUES(?,?,?)";

        try (Connection con =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();

            System.out.println("Student inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name) {

        String sql =
                "UPDATE students SET name=? WHERE id=?";

        try (Connection con =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Exercise32_InsertUpdateJDBC dao =
                new Exercise32_InsertUpdateJDBC();

        dao.insertStudent(101, "Lavanya", 20);

        dao.updateStudent(101, "Lavanya M");
    }
}