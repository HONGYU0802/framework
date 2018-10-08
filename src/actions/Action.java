package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	String perform(HttpServletRequest req, HttpServletResponse res);
}
