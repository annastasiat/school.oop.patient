import java.sql.*;

/**
 * Created by work on 01.02.2017.
 */
public class DBConnect {

        public Connection con;
        public Statement st;
        public ResultSet rs;

        public DBConnect() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientsdb", "root", "");
                st = con.createStatement();
            }
                   catch(Exception ex){
                System.out.println("Error:"+ex);
            }
        }
}
