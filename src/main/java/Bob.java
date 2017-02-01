class Bob{
	public String hey (String str){
		if(str.toUpperCase().equals(str)&&str.matches(".*[a-zA-Z]+.*"))
			return "Whoa, chill out!";
		else if(str.trim().length()<=0 || str.equals(""))
			return "Fine. Be that way!";
		else if(str.charAt(str.length()-1)=='?')
			return "Sure.";
		else
			return "Whatever.";
	}
}
