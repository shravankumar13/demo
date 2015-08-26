import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class ActionOne extends Action{

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest
			 request,HttpServletResponse response){
		System.out.println("hello shravan");
		String yes=request.getParameter("b1");
		String no=request.getParameter("b2");
		System.out.println(yes);
		System.out.println(no);
		System.out.println("what happend something is going to wrong how the hell is this happeing");
		if(yes=="yes"&& no=="")
		return mapping.findForward("success");
		else
		return mapping.findForward("failure");
	}
}
