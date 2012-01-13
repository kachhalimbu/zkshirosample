package shiro.sample;

import org.apache.shiro.SecurityUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;

public class MarketingComposer extends GenericForwardComposer {

	public void onClick$home() {
		execution.sendRedirect("/home.zul");
	}

	public void onClick$logout() {
		SecurityUtils.getSubject().logout();
		execution.sendRedirect("/home.zul");
	}

}
