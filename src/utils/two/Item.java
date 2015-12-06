package utils.two;

public class Item {

	private String desc;
	
	public String getDescription() {
		return desc;
	}
	
	public void setDescription(String d) {
		desc = d;
	}
	
	public static void modifyDesc(Item item, String desc) {
		item = new Item();
		item.setDescription(desc);
	}
	
	public static void main(String[] args) {
		Item it = new Item();
		it.setDescription("AAAAAA");
		Item it2 = new Item();
		it2.setDescription("BBBBB");
		
		modifyDesc(it, "MMMMM");
		
		System.out.println(it.getDescription());
		System.out.println(it2.getDescription());
		
	}
	
}
