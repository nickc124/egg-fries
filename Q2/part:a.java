public class SignedText{
  private String first;
  private String last;
  public SignedText(String first,String last){
    this.first=first;
    this.last=last;
  }
  public String getSignature(){
    if(first.length()==0){
      return last;
    }else{
      return first.substring(0,1)+"-"+last;
    }
  }
  public String addSignature(String str){
    String sign = getSignature();
    int index = str.index(sign);
    if(index==0){
      return str.substring(sign.length())+sign;
    }else if(index==-1){
      return str + sign;
    }else{
      return str;
    }
  }
}
