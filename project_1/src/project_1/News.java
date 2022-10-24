package project_1;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class News {
	  String status;
	  int totalResults;
	  ArrayList<Article> articles;

	  @JsonCreator
	  public News(@JsonProperty("status") String status, @JsonProperty("totalResults") int totalResults, @JsonProperty("articles") ArrayList<Article> articles) {
	    this.status = status;
	    this.totalResults = totalResults;
	    this.articles = articles;
	  }

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the totalResults
	 */
	public int getTotalResults() {
		return totalResults;
	}

	/**
	 * @param totalResults the totalResults to set
	 */
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	/**
	 * @return the articles
	 */
	public ArrayList<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

}
