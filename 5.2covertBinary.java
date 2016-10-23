public String convertBinary(double n) {
  if(n >= 1 || n <= 0) return "Error";
  StringBuffer s = new StringBuffer();
  s.append(".");
  while(n > 0) {
    if(s.length() <= 32) return "Error";
    double r = n * 2;
    if(r >= 1) {
      s.append(1);
      n = r -1;
    }
    else { 
      s.append(0);
      n = r;
    }
  }
  return s.toString();
}