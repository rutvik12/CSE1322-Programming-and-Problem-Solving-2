class PalindromeString
{
   public boolean checkPalindromeString(String str)
   {
      str=str.toLowerCase();
      boolean a=false;
      
      if(str.length()<1)
      {
          a=false;
      }
      else if(str.length()==1)
      {
          a=true;
      }
      else if(str.charAt(0)==str.charAt(str.length()-1))
      {
          a=checkPalindromeString(str.substring(1,str.length()-1));//Recurssive call
      }
      else
      {
          a=false;
      }
      
      return a;
   }
}