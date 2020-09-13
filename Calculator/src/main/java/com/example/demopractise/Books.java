package com.example.demopractise;

public class Books {
	
	long id;
	String name;
	String desc;
	/**
	 * @param id
	 * @param name
	 * @param desc
	 */
	public Books(long id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	

}
