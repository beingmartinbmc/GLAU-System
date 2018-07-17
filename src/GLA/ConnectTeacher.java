package GLA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectTeacher {
    final static String url="jdbc:mysql://localhost:3306/Aliens";
    final static String username="root";
    final static String pass="yoyobmc12";
    public static String []id=new String[2];
    public static String []name1=new String[2];
    public static String []name2=new String[2];
    public static String []name3=new String[2];
    public static String []name4=new String[2];
    public static String []name5=new String[2];
    public static String []name6=new String[2];
    public static int index;

    static Connection connection;
    static PreparedStatement statement;
    static ResultSet resultSet;

    public static void fetchDetails()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection(url,username,pass);
        String query="select * from faculty";
        statement=connection.prepareStatement(query);
        resultSet=statement.executeQuery();
        int i=0;
        while(resultSet.next()){
            id[i]=resultSet.getString("StudentID");
            name1[i]=resultSet.getString("teacher1");
            name2[i]=resultSet.getString("teacher2");
            name3[i]=resultSet.getString("teacher3");
            name4[i]=resultSet.getString("teacher4");
            name5[i]=resultSet.getString("teacher5");
            name6[i]=resultSet.getString("teacher6");
            i++;
        }
        connection.close();
        statement.close();
    }
}