package practice.exams.java.chapter4.question6.a;

import java.util.Comparator;

public class Items implements Comparable<Items> {

	private String name;
	private int value;
	
	public Items() {
	}
	
	public Items(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", value=" + value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + value;
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
		Items other = (Items) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public int compareTo(Items o) {
		if (this.getValue() < o.getValue()) {
			return -1;
		}
		
		if (this.getValue() > o.getValue()) {
			return 1;
		}
		
		return 0;
	}
	
}
