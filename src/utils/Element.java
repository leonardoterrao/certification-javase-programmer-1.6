package utils;

public enum Element {

	EARTH, WIND,
	FIRE { public String info() {return "Hot";}
	};
	public String info() {return "element";}
}
