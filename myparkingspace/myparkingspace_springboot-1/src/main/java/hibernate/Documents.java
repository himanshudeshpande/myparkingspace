package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="user_documents")
@Table(name="user_documents")
public class Documents 
{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(nullable=false)
		private String type;
		
		@Column(nullable=false)
		private String file_path;
		
		@ManyToOne
		private Users user;

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

		public Users getUser() {
			return user;
		}

		public void setUser(Users user) {
			this.user = user;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Documents [id=" + id + ", type=" + type + ", file_path=" + file_path + ", user_documents="
					+ user + "]";
		}

		public DocumentsP toPOJO()
		{
			DocumentsP d = new DocumentsP();
			d.setFile_path(file_path);
			d.setId(id);
			d.setType(type);
			return d;
		}
}
