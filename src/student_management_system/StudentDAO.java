package student_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {
	
	public static void viewAllStudents() {
		String sql = "Select *from students";
		try(Connection con = DBConnection.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			System.out.printf("%-5s | %-15s | %-10s | %-5s%n", "ID", "Name", "Course", "Age");
			System.out.println("-----------------------------------------------------");
			while(rs.next()){
			        System.out.printf("%-5d | %-15s | %-10s | %-5d%n",
			        		rs.getInt("id"),
			        		rs.getString("name"),
			        		rs.getString("course"),
			        		rs.getInt("age"));
		     }
			System.out.println("\n\n");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void studentbyID(int id) {
		String sql = "select *from students where id = ?";
		try(Connection con = DBConnection.getConnection();){
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
				if (rs.next()){
					 System.out.printf("%-5s | %-15s | %-10s | %-5s%n", "ID", "Name", "Course", "Age");
				        System.out.println("-----------------------------------------------------");
				        System.out.printf("%-5d | %-15s | %-10s | %-5d%n",
				        		rs.getInt("id"),
				        		rs.getString("name"),
				        		rs.getString("course"),
				        		rs.getInt("age"));
				System.out.println("\n\n");
			     }
				else {
					System.out.println("Student not found! 🙅‍♂✖ \n\n");
				}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void addStudent(Student student) {
		String sql = "Insert into students(name,course,age) values (?,?,?)";
		try(Connection con = DBConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, student.getName());
			stmt.setString(2, student.getCourse());
			stmt.setInt(3, student.getAge());
			stmt.executeUpdate();
			System.out.println("Student addded sussfully! 🤹‍♂✅\n\n");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void updateStudent(Student student) {
		String sql = "Update students set name = ?, course = ?, age = ? where id = ?";
		try(Connection con = DBConnection.getConnection();
			  PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1,student.getName());
			stmt.setString(2,student.getCourse());
			stmt.setInt(3, student.getAge());
			stmt.setInt(4,student.getId());
			int rowsUpdated = stmt.executeUpdate();
			if(rowsUpdated > 0) {
			System.out.println("Student details updated successfylly! ✅ \n\n");
			}
			else {
				System.out.println("Student not found. 🙅‍♂❎\n\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void removeStudent(int id) {
		String sql = "Delete from students where id = ? ";
		try(Connection con = DBConnection.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Student with id "+id +" removed successfully! ✅\n\n");			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
