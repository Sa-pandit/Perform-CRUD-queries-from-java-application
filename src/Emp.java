import javax.print.attribute.standard.Chromaticity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Emp {
    public static void main(String[] args) {

        try {
            String MySqlDriver = "com.mysql.cj.jdbc.Driver";
            String MySqlUrl = "jdbc:mysql://localhost:3306/test";
            System.out.println("Sakshi pandit");
            System.out.println("Connecting to database...");


            Class.forName(MySqlDriver);
            Connection con = DriverManager.getConnection(MySqlUrl, "root", "root");
            Scanner sc = new Scanner(System.in);

            PreparedStatement ps = con.prepareStatement("create table if not exists employee (Id int ,Name varchar(50), Email varchar(50),City varchar (100),Contact int)");
            int count = ps.executeUpdate();

            int choice;
            do {
                System.out.println("1. Insert data");
                System.out.println("2. Update data");
                System.out.println("3. Delete data");
                  choice = sc.nextInt();
                switch (choice) {

                    case 1:
                        PreparedStatement ps2 = con.prepareStatement("insert into employee (Id,Name,Email,City,Contact)values (?,?,?,?,?)");



                        System.out.println(" Enter the Id");
                        int id = sc.nextInt();
                        System.out.println(" Enter the Name");
                        String name = sc.next();
                        System.out.println(" Enter the Email ");
                        String email = sc.next();
                        System.out.println(" Enter the City");
                        String city = sc.next();
                        System.out.println(" Enter the Contact");
                        int contact = sc.nextInt();

                        ps2.setInt(1, id);
                        ps2.setString(2, name);
                        ps2.setString(3,email);
                        ps2.setString(4,city);
                        ps2.setInt(5,contact);
                        int count2 = ps2.executeUpdate();
                        System.out.println("Data insert successfully");
                        break;
                    case 2:
                        PreparedStatement ps3 = con.prepareStatement("UPDATE employee SET Name='sakshi' WHERE Id=2");

                        int count3 = ps3.executeUpdate();
                        System.out.println("data insert successfully");
                        break;
                        case 3:
                            PreparedStatement ps4 = con.prepareStatement(
                                    "DELETE FROM employee WHERE ID = 4"
                            );
                            int count4 = ps4.executeUpdate();

                            System.out.println("data insert successfully");

                }
            }
            while (choice !=3);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}


