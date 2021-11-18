package weapons;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@EqualsAndHashCode
public class Skin {
	private String name;
	private List<String> weapons = new ArrayList<String>();
	private int id;
	private String tag;
	private String lang;
	
	private String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	public String getLang() {
		if (name.contains("phase)) {
			return lang + " (" + capitalize(name.substring(0, 1)) + " " + name.charAt(5) + ")";
		} else if (name.contains("marbleized") && !name.contains("blackpearl")) {
			return lang + " (" + capitalize(name.replace("marbleized", "")) + ")";
		} else if (name.contains("blackpearl_marbleized")) {
			return lang + " (Black Pearl)";
		}
		return lang;
	}
	
	public String weapons() {
		StringBuilder sb = new StringBuilder();
		for (String weapon : weapons) {
			sb.append(weapon + ";");
		}
		return sb.toString();
	}
}
