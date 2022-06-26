package momento;

public class Pages {
	
	int pageNumber;
	
	String content;
	
	public Pages(int pageNumber, String content) {
		this.pageNumber = pageNumber;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Pages [pageNumber=" + pageNumber + 
				", content=" + content + "]";
	}	
}
