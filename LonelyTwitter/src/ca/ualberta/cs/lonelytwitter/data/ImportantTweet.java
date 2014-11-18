package ca.ualberta.cs.lonelytwitter.data;

import java.util.Date;

public class ImportantTweet extends LonelyTweet {

	public ImportantTweet() {
	}

	public ImportantTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}	
	
	
	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String importantString = "IMPORTANT " + getTweetDate() + " | " + getTweetBody();
		return importantString;
	}

	public String getTweetBody() {
		return "IMPORTANT " + tweetBody;
	}
}