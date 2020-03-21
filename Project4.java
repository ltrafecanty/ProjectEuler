public class Project4{
      public static void main(String[] args){
            int pot;
            int max = 0;
            for(int i = 100; i < 1000;i++){
                  for(int j = 100; j < 1000; j++){
                    pot = i*j;
                        if(checkPalindrome(Integer.toString(pot)) && pot > max){
                          max = pot;
                        }
                  }
            }
            System.out.println(max);
      }

      private static boolean checkPalindrome(String pal){
          int k = pal.length()-1;
          for(int i = 0; i< pal.length()/2; i++){
              if(pal.charAt(i)!= pal.charAt(k)){
                return false;
              }
              k--;
          }
          return true;
      }
}
