package Problem3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentdaoImpl implements StudentDao{

	@Override
	public String insertStudentDetails(Student student) {
		
		String result="Not Inserted";
		
		
		try(Connection conn=Dbutil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, student.getRollno());
			ps.setString(2, student.getStudentName());
			ps.setString(3, student.getStandard());
			ps.setDate(4, (Date) student.getDate_of_birth());
			
			int x=ps.executeUpdate();
			if(x>0) {
				result="Inserted Successfully";
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Student findStudentById(int id) throws StudentException {
		  Student student=null;
		try(Connection conn=Dbutil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from student where roll=?");
			ps.setInt(1,student.getRollno());
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				int r=rs.getInt("roll");
				String name=rs.getString("name");
				String s=rs.getString("standard");
				Date d=rs.getDate("DOB");
				int f=rs.getInt("Fees");
				student =new Student();
				student.getRollno();
				student.getStudentName();
				student.getStandard();
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public Student getStudentDetailsByNameAndId(String name, int id) throws StudentException {
		Student student=null;
try(Connection conn=Dbutil.provideConnection()){
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
     

	
		
		


	@Override
	public String updateStudentById(int id,String name) throws StudentException {
		String result="Not updated";
try(Connection conn=Dbutil.provideConnection()){
	
	 PreparedStatement ps=conn.prepareStatement("update student set name=? where id=?");
	    ps.setInt(2, id);
	    ps.setString(1, name);
	    int x= ps.executeUpdate();
	    if(x>0) {
	    	result="Updated Sucessfully";
	    }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteStudentById(int id) throws StudentException {
		String result="Deleted not happed";
try(Connection conn=Dbutil.provideConnection()){
         
	 PreparedStatement ps=conn.prepareStatement("delete  from student where id=?");
	    ps.setInt(1, id);
	    int x= ps.executeUpdate();
	    if(x>0) {
	    	result="Delete Sucessfully";
	    }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	

}
