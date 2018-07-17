package GLA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetResults {
    final static String url="jdbc:mysql://localhost:3306/Aliens";
    final static String username="root";
    final static String pass="yoyobmc12";
    static String []id=new String[2];
    static String []sem1=new String[2];
    static String []sem2=new String[2];
    static String []sem3=new String[2];
    static String []sem4=new String[2];
    public static String[] attendance=new String[2];
    public static int index;

    static Connection connection;
    static PreparedStatement statement;
    static ResultSet resultSet;

    public static void fetchDetails()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection(url,username,pass);
        String query="select * from result";
        statement=connection.prepareStatement(query);
        resultSet=statement.executeQuery();
        int i=0;
        while(resultSet.next()){
            id[i]=resultSet.getString("ID");
            sem1[i]=resultSet.getString("Sem1");
            sem2[i]=resultSet.getString("Sem2");
            sem3[i]=resultSet.getString("Sem3");
            sem4[i]=resultSet.getString("Sem4");
            attendance[i]=resultSet.getString("Attendance");
            i++;
        }
        connection.close();
        statement.close();
    }
}
