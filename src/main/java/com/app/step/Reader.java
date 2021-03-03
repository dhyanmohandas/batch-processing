package com.app.step;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String>{

	private String[] messages = { "Pursuant to Regulation 34(1)(a) and clause 12 of Part A of Schedule III read with regulation 3\r\n" + 
			"of the SEBI (Listing Obligations and Disclosure Requirements) Regulations, 2015, we are\r\n" + 
			"submitting herewith the Annual Report including the Business Responsibility Report of the\r\n" + 
			"Company for the financial year 2019-20 and Notice of the 28th Annual General Meeting of the\r\n" + 
			"Company, scheduled to be held on Thursday, August 27, 2020 at 03.30 p.m. IST (Indian\r\n" + 
			"Standard Time) through Video Conferencing (“VC”) / Other Audio-Visual Means\r\n" + 
			"(“OAVM”), (a copy of which is being emailed to all the shareholders of the Company whose\r\n" + 
			"e-mail id are available with us. The remote e-voting period shall commence on Monday,\r\n" + 
			"August 24, 2020 at 09:00 a.m. and shall end on Wednesday, August 26, 2020 at 05:00 p.m." };

	private int count = 0;

	
	public String read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {

		if (count < messages.length) {
			return messages[count++];
		} else {
			count = 0;
		}
		return null;
	}

}