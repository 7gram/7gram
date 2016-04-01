package bb.member.model;

import java.sql.*;
import java.util.*;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class MemberDAO {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDAO() {
		System.out.println("DAO 생성자 호출됨!");
	}
	
	/*회원가입 관련 기능*/
	public int memberJoin(MemberDTO dto){
		try{
			conn=bb.db.BbDB.getConn();
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getPwd());
			ps.setString(4, dto.getEmail());
			
			int count=ps.executeUpdate();
			return count;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}finally{
			try{
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
	/*중복검사 관련 메서드*/
	public boolean idCheck(String id){
		try{
			conn=bb.db.BbDB.getConn();
			String sql = "select id from bb_member where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			return rs.next();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			try{
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
}
