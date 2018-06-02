package com.yazici.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Original implements Cloneable {

	List<Object> list;

	{
		list = new ArrayList<>();
	}

	public Original() {

	}

	public void longProcess2LoadList() {

		// get data from a service
		// some memory consume operations

		list.add(new String("object"));
	}

	public void anotherLongProcess2LoadList() {

		// get data from a service
		// some memory consume operations

		list.add(new String("object 2"));
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Original clon = new Original();
		clon.list = this.list;

		return clon;
	}

}
