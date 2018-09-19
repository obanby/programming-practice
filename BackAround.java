/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
http://codingbat.com/prob/p161642
*/

public String backAround(String str) {
  if (str.length() > 1) {
    return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
  }
  return str + str + str;
}
