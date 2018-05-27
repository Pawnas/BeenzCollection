package CollectingBeenz;

import xml.XMLOutput;

public class Topics {

	private String eName;

	private String text;

	public Topics(String eName, String text) {
		this.eName = eName;
		this.text = text;
	}

	public String getEName() {
		return eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void xml(XMLOutput out) {
		out.openElement("Articles");
		out.addAttribute("<Employee Name", getEName());
		out.addAttribute("Article", getText());
		out.closeElement();
	}

}
