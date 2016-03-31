package bb.member;

import java.sql.PreparedStatement;
import java.util.*;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class memberDAO {

	private Connection conn;
	private PreparedStatement ps;
	private Result rs;
	
	public memberDAO() {
		System.out.println("DAO 생성자 호출됨!");
	}
	
	/*회원가입 관련 기능*/
	public int memberJoin(MemberDTO dto){
		
	}
}
