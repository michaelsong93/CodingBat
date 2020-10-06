public String frontBack(String str) {
    if(str.length() < 2){
      return str;
    }
    else{
      String constant = str.substring(1, str.length()-1);
      return str.charAt(str.length()-1) + constant + str.charAt(0);
      }
    }
  
  