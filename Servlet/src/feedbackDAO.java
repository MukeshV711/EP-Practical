import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class feedbackDAO {

	public int insert(feedbackBean obj) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		PreparedStatement ps = con.prepareStatement("insert into feedback values(?,?,?)");

		ps.setInt(1, obj.getId());

		ps.setString(2, obj.getFeedback());
		ps.setString(3, obj.getSuggestions());

		int i = ps.executeUpdate();
		con.close();
		return i;
	}

}