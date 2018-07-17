package GLA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connectivity {

    final static String url="jdbc:mysql://localhost:3306/Aliens";
    final static String username="root";
    final static String pass="yoyobmc12";
    static String []name=new String[5];
    public static String []id=new String[5];
    static String []path=new String[5];
    static String []email=new String[5];
    static String []phone=new String[5];
    public static String []password=new String[5];
    public static int index;

    static Connection connection;
    static PreparedStatement statement;
    static ResultSet resultSet;

    public static void fetchDetails()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection(url,username,pass);
        String query="select * from student";
        statement=connection.prepareStatement(query);
        resultSet=statement.executeQuery();
        int i=0;
        while(resultSet.next()){
            name[i]=resultSet.getString("name");
            id[i]=resultSet.getString("id");
            phone[i]=resultSet.getString("phone");
            email[i]=resultSet.getString("email");
            path[i]=resultSet.getString("path");
            password[i]=resultSet.getString("password");
            i++;
        }
        connection.close();
        statement.close();
    }
}

