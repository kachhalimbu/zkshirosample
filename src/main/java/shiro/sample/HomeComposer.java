/**
 * 
 */
package shiro.sample;

import org.apache.shiro.SecurityUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;

/**
 * @author ashish
 *
 */
public class HomeComposer extends GenericForwardComposer {

	Label user;
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		if(SecurityUtils.getSubject().isAuthenticated()) {
			user.setValue("Welcome: " + SecurityUtils.getSubject().getPrincipal());
		} else {
			user.setValue("");
		}
	}
}
