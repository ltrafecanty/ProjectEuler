public class Project5{
    public static void main(String[] args){
      boolean check = true;
      int k = 2520;
      int r = 0;
      while(check){
          for(int i = 1; i <= 20; i++){
              r+= k%i;
              if(r > 0){
                break;
              }
          }
          System.out.println(r);
          if(r == 0){
            check = false;
          }
          r = 0;
          k++;
      }
      System.out.println(k);
    }
}
