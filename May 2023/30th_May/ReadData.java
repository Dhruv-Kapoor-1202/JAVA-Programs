// import java.sql.*;

// public class ReadData {

//     Connection con;
//     PreparedStatement ps;
//     ResultSet rs;

//     ReadData() {
//         try {
//             Class.forName("com.mysql.jdbc.Driver");
//             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruv", "User1", "Scootergangboi456!");
//             System.out.println("Connection Established.");
//             ps = con.prepareStatement("select * from noMe");
//             rs = ps.executeQuery();
//             // update / delete - executeUpdate();

//             System.out.println("Read the table : noMe");
//             System.out.println("\n\nUsername\tPassword");
//             System.out.println("======================");

//             while (rs.next()) {
//                 System.out.print(rs.getString(1));
//                 System.out.println("\t\t" + rs.getString(2));
//             }

//         } catch (Exception e) {
//             System.out.println(e);
//         }

//     }

//     public static void main(String args[]) {
//         new ReadData();
//     }
// }

import java.sql.*;

class ReadData {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    ReadData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruv", "root", "<thePassword>");
            System.out.println("Connection Established.");

            ps = con.prepareStatement("select * from login");
            rs = ps.executeQuery();
            // update/delete - executeUpdate();

            System.out.println("Read the table : login");
            System.out.println("\n\nUsername\tPassword");
            System.out.println("-----------------------------------");

            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.println("\t\t" + rs.getString(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new ReadData();
    }
}
