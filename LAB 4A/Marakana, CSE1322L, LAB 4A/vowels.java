class vowels
{
      int total=0;
      public int Vowel(char c)
      {
       
         char ch=Character.toLowerCase(c);
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
         {
             return 1;//Return 1 if and only if the character is a vowel
         }
         else
         {
            return 0;//Return 0 if character is not a vowel
         }
      }  
      
      public int Vowel(String s)
      {  
        if(s.length()!=0)
        { 
          if(s.length()==1)
          {
              total=total+Vowel(s.charAt(s.length()-1));//Calls method Vowel recursively
          }
          else
          {
              total=total+Vowel(s.charAt(0));
              Vowel(s.substring(1));//Calls method recursively
          }
        }
        return total;
      }   
}
      