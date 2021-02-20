import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	public int insert(Bean obj) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("insert into Servelet values(?,?,?,?,?)");

		ps.setInt(1, obj.getId());
		ps.setString(2, obj.getName());
		ps.setString(3, obj.getPassword());
		ps.setInt(4, obj.getSection());
		ps.setInt(5, obj.getYear());

		int i = ps.executeUpdate();
		con.close();
		return i;

	}

	public int delete(int id) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("delete from  Servelet where idno=" + id);

		int i = ps.executeUpdate();
		return i;

	}

	public int update(int id) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("update Student set id='?' where idno=?");

		int i = ps.executeUpdate();
		return i;

	}

	public boolean validate(int id, String password) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("select * from Servelet");
		ResultSet rst = ps.executeQuery();
		while (rst.next()) {
			if (rst.getInt(1) == (id) && rst.getString(3).equals(password)) {
				return true;
			}
		}
		return false;
	}

	public int sendfeedback(feedbackBean fb) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("insert into feedback values(?,?,?)");
		ps.setInt(1, fb.getId());
		ps.setString(2, fb.getFeedback());
		ps.setString(3, fb.getSuggestions());
		int i = ps.executeUpdate();
		return i;
	}

}