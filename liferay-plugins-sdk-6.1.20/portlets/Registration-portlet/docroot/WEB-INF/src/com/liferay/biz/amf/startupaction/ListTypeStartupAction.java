package com.liferay.biz.amf.startupaction;

import com.liferay.biz.amf.service.service.ListTypeLocalServiceUtil;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.model.ListTypeConstants;
import com.liferay.portal.model.Contact;

public class ListTypeStartupAction extends SimpleAction {
	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.SimpleAction#SimpleAction()
	 */
	public ListTypeStartupAction() {
		super();
	}

	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.SimpleAction#run(String[] arg0)
	 */
	public void run(String[] ids) throws ActionException {
		try {
			int homePhoneTypeCount = 
				ListTypeLocalServiceUtil.countListTypeByN_T(
					"home", Contact.class.getName() + ListTypeConstants.PHONE);
			if (homePhoneTypeCount == 0) {
				ListTypeLocalServiceUtil.addListType(
					"home", Contact.class.getName() + ListTypeConstants.PHONE);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}