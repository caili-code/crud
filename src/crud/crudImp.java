package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import tool.Jdbc;

public class crudImp implements crud {

	@Override
	public Boolean insert(String name,String age,String sex) {
		// TODO Auto-generated method stub
		Connection conn=Jdbc.getConnection();
		Boolean bl = null;
		try {
			PreparedStatement ps= conn.prepareStatement("insert into student(Sname,Sage,Ssex) "
					+ "values('"+name+"','"+age+"','"+sex+"') ");
			bl=ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Jdbc.closeConn(conn);
		}
		return bl;
	}


	@Override
	public int delete(String SId) {
		// TODO Auto-generated method stub
		Connection conn=Jdbc.getConnection();
		Boolean bl = null;
		String a="delete from student where SId='"+SId+"'";
		try {
			PreparedStatement ps= conn.prepareStatement(a);
		
			bl=ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Jdbc.closeConn(conn);
		}
		return 0;
	}

	@Override
	public List select() {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();
		Connection conn=Jdbc.getConnection();
		try {
			Statement s = conn.createStatement();
			ResultSet rs=s.executeQuery("select * from student ");
			while(rs.next()) {
				Student stu= new Student();
				stu.setSId(rs.getString("SId"));
				stu.setSname(rs.getString("Sname"));
				stu.setSage(rs.getString("Sage"));
				stu.setSsex(rs.getString("Ssex"));
				list.add(stu);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Jdbc.closeConn(conn);
		}
		return list;
	}

	@Override
	public int update(String SId,String name, String age, String sex) {
		// TODO Auto-generated method stub
		Connection conn=Jdbc.getConnection();
		Boolean bl = null;
		String a="update student set Sname='"+name+"',Sage='"+age+"',Ssex='"+sex+"' where SId='"+SId+"'";
		try {
			PreparedStatement ps= conn.prepareStatement(a);
		
			bl=ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Jdbc.closeConn(conn);
		}
		return 0;
	}



}
