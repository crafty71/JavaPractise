import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCDemo {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    String url =
        "jdbc:mysql://127.0.0.1:3306/practise03?useSSL=false";
    String username = "root";
    String password = "Yy336699";

    Connection conn = DriverManager.getConnection(url, username, password);

    String sql = "select * from job";

    Statement stmt = conn.createStatement();

    ResultSet count = stmt.executeQuery(sql);//受影响的行数

    ArrayList<Job> jobs = new ArrayList<>();

    while (count.next()) {
      int id = count.getInt("id");
      String name = count.getString("jname");
      String des = count.getString("description");

      Job job = new Job(id, name, des);
      jobs.add(job);

      System.out.println(id);
      System.out.println(name);
      System.out.println(des);
    }

    for (Job j : jobs) {
      System.out.println(j);
    }

    //7. 释放资源
    stmt.close();
    conn.close();

  }

}
