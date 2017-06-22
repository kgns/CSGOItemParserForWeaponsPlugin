package weapons;

import java.util.ArrayList;
import java.util.List;

public class Skin {
	private String name;
	private List<String> weapons = new ArrayList<String>();
	private int id;
	private String tag;
	private String lang;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getWeapons() {
		return weapons;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public String getLang() {
		if (name.contains("phase1"))
		{
			return lang + " (Phase 1)";
		}
		else if (name.contains("phase2"))
		{
			return lang + " (Phase 2)";
		}
		else if (name.contains("phase3"))
		{
			return lang + " (Phase 3)";
		}
		else if (name.contains("phase4"))
		{
			return lang + " (Phase 4)";
		}
		else if (name.contains("emerald_marbleized"))
		{
			return lang + " (Emerald)";
		}
		else if (name.contains("ruby_marbleized"))
		{
			return lang + " (Ruby)";
		}
		else if (name.contains("sapphire_marbleized"))
		{
			return lang + " (Sapphire)";
		}
		else if (name.contains("blackpearl_marbleized"))
		{
			return lang + " (Black Pearl)";
		}
		return lang;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public String weapons() {
		StringBuilder sb = new StringBuilder();
		for (String weapon : weapons) {
			sb.append(weapon + ";");
		}
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		Skin skin = (Skin) obj;
		return name.equals(skin.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
