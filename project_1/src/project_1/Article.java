package project_1;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Article {
	private String title;
	private String description; 
	private String pubTime; 
	private String url;
	private String author;
   private String content;
   private String uti;
	
	/**
	 * Constructs the Article Object from the JSON
	 * 
	 * @param title Title of the Article
	 * @param description description of the Article  
	 * @param pubTime time published in LocalDateTime format
	 * @param url a String with the URL
	 */
	@JsonCreator 
	public Article(@JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("url") String url,
            @JsonProperty("publishedAt") String pubTime) {
		this.title = title;
		this.description = description;
		this.pubTime = pubTime;
		this.url = url;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the uti
	 */
	public String getUti() {
		return uti;
	}
	/**
	 * @param uti the uti to set
	 */
	public void setUti(String uti) {
		this.uti = uti;
	}
	/**
	 * Returns a string with the information in the class
	 * 
	 * @return A string with the information in the class
	 */
	@Override
	public String toString() {
		return title + "\n" + description + "\n" + pubTime + "\n" + url + "\n\n";
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the pubTime
	 */
	public String getPubTime() {
		return pubTime;
	}
	/**
	 * @param pubTime the pubTime to set
	 */
	public void setPubTime(String pubTime) {
		this.pubTime = pubTime;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
