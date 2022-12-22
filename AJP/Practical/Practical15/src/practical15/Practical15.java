package practical15;

import java.sql.*;
import java.util.Scanner;

class Practical15 {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practical15", "root", "root")) {
                try ( Statement stmt = con.createStatement()) {
                    System.out.print("Enter the name : ");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine();

                    String query1 = "INSERT INTO practical " + "VALUES ('" + name + "')";
                    stmt.executeUpdate(query1);
                    System.out.println("Record Inserted");
                }

                //                For to get data from Database
                try ( Statement stmt1 = con.createStatement()) {
                    ResultSet rs = stmt1.executeQuery("select * from practical");
                    String name;
                    while (rs.next()) {
                        name = rs.getString("Name");
                        System.out.println("Name : " + name);
                    }
                }

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
