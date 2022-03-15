public class PromptBank {
	
	String [] questions;
	String [] statements;
	
	public PromptBank(){
		questions = new String [4];
		statements = new String [4];
	
	}
	public String getFirstWord(String group) {
		String firstWord = group.substring(0, group.indexOf(" "));

		return firstWord;
		}
	
	public String getLastWord(String group) {
		String lastWord;
		if(group.endsWith(" ") || group.endsWith("?") || group.endsWith("!") || group.endsWith(".")) {
			lastWord = group.substring(group.lastIndexOf(' ')+1, group.length()-1);
		}
		else { 
		 lastWord = group.substring(group.lastIndexOf(' ')+1, group.length());
		}
		return lastWord;
	}

	

	public void populateStatementsArray(String one, String two){
		String word1 = one;
		String word2 = two;
		
		statements[0] = "Tell me more about "+word1+" and "+word2;
		statements[1] = word1+" seems important to you, so does "+word2+" . Please tell me more.";
		statements[2] = word1+" and "+word2+" seem to be on your mind. Let's talk about it.";
		statements[3] = word1+" and "+word2+" are some big words. Explain what the words mean to you";
		
	}
	public void populateQuestionsArray(String one, String two){
		String word1 = one;
		String word2 = two;
		
		questions[0] = "Is there anything else about "+word1+" and "+word2+"?";
		questions[1] = "Does "+word1+" bother you? How about "+word2+"?";
		questions[2] = "Are "+word1+" and "+word2+" things you think about often?";
		questions[3] = "What does "+word1+" and "+word2+" mean to you?";

	}
	public String getRandomStatementTrunk() {
		int index = 0 + (int)(Math.random() * statements.length);
		return statements[index];
	}
	
	public String getRandomQuestionTrunk() {
		int index = 0 + (int)(Math.random() * questions.length);
		return questions[index];
	}
	
	

}


