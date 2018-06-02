package com.yazici.creational.builder;

public class Software {
	
	//mandatory field
	private Object obj1;
	
	
	//optional fields
	private Object obj2;
	private Object obj3;
	private Object obj4;
	
	
	
	
	private Software(SoftwareBuilder builder) {
		this.obj1=builder.obj1;
		this.obj2=builder.obj2;
		this.obj3=builder.obj3;
		this.obj4=builder.obj4;
	}
	
	
	public Object getObj1() {
		return obj1;
	}

	public Object getObj2() {
		return obj2;
	}


	public Object getObj3() {
		return obj3;
	}

	public Object getObj4() {
		return obj4;
	}


	//inner static class for setting optional parameter 
	public static class SoftwareBuilder{
		
		private Object obj1;
		private Object obj2;
		private Object obj3;
		private Object obj4;
		
		public SoftwareBuilder(Object obj1) {
			this.obj1=obj1;
		}

		public SoftwareBuilder setObj2(Object obj2) {
			this.obj2 = obj2;
			return this;
		}

		public SoftwareBuilder setObj3(Object obj3) {
			this.obj3 = obj3;
			return this;
		}

		public SoftwareBuilder setObj4(Object obj4) {
			this.obj4 = obj4;
			return this;
		}
		
		public Software build() {
			return new Software(this);
		}
		
		
	}

}
