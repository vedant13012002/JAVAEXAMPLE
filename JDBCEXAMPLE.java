import java.sql.*;
import java.util.Scanner;

public class JDBCEXAMPLE{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedant_i","root","");
       
        PreparedStatement s= con.prepareStatement("insert into information values(?)");

        Scanner sc=new Scanner(System.in);
        String[] s3=new String[3];
        int z=0;
        for(int x=0;x<3;x++)
        {
            String str=sc.nextLine();
            if(str.matches("[a-zA-Z0-9]+(@gmail.com|@rediff.com|@outlook.com)"))
                s3[z++]=str;
        }

        for(int x=0;x<z;x++)
        {
            s.setString(1,s3[x]);
            s.execute();
        }

    }
}
