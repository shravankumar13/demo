import java.sql.*;
import java.util.ArrayList;


public class EmpJB {
	
	public EmpJB(){
	System.out.println("EmpJB Object is created");
	}
	public ArrayList getRecords(String eno){
	
		try{
		ArrayList list=new ArrayList();
		System.out.println("ur given value :"+eno);
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","oracle");
		Statement pstmt=con.createStatement();
		System.out.println("pstmt is got");
		String query="select * from emp where eno='"+eno+"'";
		System.out.println(query);
		ResultSet rs=pstmt.executeQuery(query);
		System.out.println("result object is available");
		while(rs.next()){
			Emp e=new Emp();
			e.setEno(rs.getInt("eno"));
			e.setName(rs.getString("name"));
			e.setSalary(rs.getDouble("salary"));
			list.add(e);
		}
		return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
