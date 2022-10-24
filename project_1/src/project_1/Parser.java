package project_1;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//this must take a parser 
public class Parser{
	String json; 
	Logger logger;

	/**
	 * Constructor for the parser class. 
	 * 
	 * @param file The JSON file that you're trying to parse
	 * @param logger a logger that will log the errors
	 */
	public Parser(String json, Logger logger) {
		this.json = json;
		this.logger = logger;
	} 
	/**
	 * This functions goes through the json file and returns a list of the article, it only returns the articles that have 
	 * the attributes that we need. 
	 * @return ArrayList of Article Objects that are in the file.
	 */
	public ArrayList<Article> parse(){
	    ArrayList<Article> articles = new ArrayList<>();
	    FileHandler fh; 
    	logger.setUseParentHandlers(false);

	    try {
	    	fh = new FileHandler("error.log");
	    	logger.addHandler(fh);
	    	SimpleFormatter formatter = new SimpleFormatter();
	    	fh.setFormatter(formatter);
	    	logger.info("parser ran and logger initialized.");
	    	ObjectMapper mapper = new ObjectMapper(); 
	    	JsonNode nodes = mapper.readValue(new File(json), JsonNode.class).get("articles");
	    	for (JsonNode node : nodes) {
	    		if(node.get("title") != null && node.get("description") != null && node.get("url") != null
	        		&& node.get("publishedAt") != null) {
	        	
	    			Article art = new Article(node.get("title").asText(), node.get("description").asText(), 
	        				node.get("url").asText(), node.get("publishedAt").asText());
	    			articles.add(art);
	    		}else {logger.warning("article had an error and so was skipped");}
	      }
	      return articles;
	    } catch (Exception e) {
	      logger.warning(e.getMessage());
	      return articles;
	    }
	  }
	
}
