package com.revature.pixott.Model;

public class Top5 {
	private String name;
	private int rid;
	
	public Top5() {
		
	}
	public Top5(String name, int rid) {
		super();
		this.name = name;
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Top5 other = (Top5) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rid != other.rid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%-40s [ID=%d]",name,rid);
	}
	
	

}
