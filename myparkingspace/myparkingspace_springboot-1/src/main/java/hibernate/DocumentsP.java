package hibernate;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class DocumentsP 
{
	private int id;
	
	private String type;
	
	private String file_path;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	
}	
