package com.dhruv.tostringbuilder;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringStyle;

public class CustomStyle extends ToStringStyle
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7729112357662411282L;

	@Override
	protected void appendDetail(StringBuffer buffer, String fieldName, Object value) 
	{
		if (value instanceof Date) 
        {
            value = new SimpleDateFormat("yyyy-MM-dd").format(value);
        }
        buffer.append(value);
	}

}
