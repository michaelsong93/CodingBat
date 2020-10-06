/*
Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged. 
Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */

 //version 1
 
public String notString(String str) {
    String test = "not";
    String delimeter = " ";
    String[]words = str.split(delimeter);
    if(words[0].equals(test)){
        return str;
    }
    return test + " "+ str;
  }

  //version 2

  public String notString(String str){
      if(str.length() >= 3 && str.substring(0,3).equals("not")){
          return str;
      }
      return "not " + str; 
  }
  