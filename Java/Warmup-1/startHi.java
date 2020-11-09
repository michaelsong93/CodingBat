// Given a string, return true if the string starts with "hi" and false otherwise.

// startHi("hi there") → true
// startHi("hi") → true
// startHi("hello hi") → false

public boolean startHi(String str) {
    if(str.length()>=2){
      if((str.charAt(0) == 'h') && (str.charAt(1) == 'i')){
        return true;
      } 
    }
    return false;
  }
  