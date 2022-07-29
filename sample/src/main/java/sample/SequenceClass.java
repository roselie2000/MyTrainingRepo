package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SequenceClass {

	public void sequence() {
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			String query = "create sequence idno start with 1 increment by 1 minvalue 1 maxvalue 1000 cycle";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Sequence created!");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dropSequence() {
		
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			String query = "drop sequence auto_id";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Sequence dropped!");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
