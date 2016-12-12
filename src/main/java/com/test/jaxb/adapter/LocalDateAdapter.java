package com.test.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalDate;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public String marshal(LocalDate v) throws Exception {
		return v.toString();
	}

	@Override
	public LocalDate unmarshal(String v) throws Exception {
		if(!v.isEmpty())
			return LocalDate.parse(v);
		else 
			return null;
	}

}
