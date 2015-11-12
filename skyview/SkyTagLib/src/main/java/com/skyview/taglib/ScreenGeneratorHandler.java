/**
 * 
 */
package com.skyview.taglib;

import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author AVANTHIKA
 *
 */
public class ScreenGeneratorHandler extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		return super.doAfterBody();
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();// returns the instance of
												// JspWriter
		try {
			out.print(Calendar.getInstance().getTime());// printing date and
														// time using JspWriter
		} catch (Exception e) {
			System.out.println(e);
		}
		return SKIP_BODY;// will not evaluate the body content of the tag
	}

}
