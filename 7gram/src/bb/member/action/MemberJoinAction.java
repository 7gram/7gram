package bb.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bb.command.CommandHendler;
import bb.member.model.*;

public class MemberJoinAction implements CommandHendler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		String email=req.getParameter("email");
		String addr=req.getParameter("addr");
		MemberDTO dto=new MemberDTO(0, id, name, pwd, email, addr);
		MemberDAO dao=new MemberDAO();
		int result=dao.memberJoin(dto);
		
		String msg=result > 0 ? "회원가입성공!" : "회원가입실패!";
		req.setAttribute("msg", msg);
		return "/member/memberMsg.jsp";
		
	}

}
