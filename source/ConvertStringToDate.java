package com.riteshgaur.StringtoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {
	public static Date convertStringToDate(String dateString) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		
		return sdf.parse(dateString);

}
}
