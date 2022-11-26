package ME_project;

import java.sql.Connection;
import java.sql.DriverManager;
public class Connect3 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "";
		String id = "";
		String pwd = "";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url+dbname, id, pwd);
			System.out.println("데이터 베이스 연결 성공!!");
		} catch (Exception e) {
			System.out.println("데이터 베이스 연결실패!!");
			e.printStackTrace();
		}finally {
			try {
				if(con != null)
					con.close();
					System.out.println("데이터 베이스 연결 해제!");
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}