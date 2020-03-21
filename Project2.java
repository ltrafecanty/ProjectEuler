public class Project2{

  public static void main(String[] args){
        int[] seq = new int[100];
        seq[0] = 1;
        seq[1] = 1;
        seq[2] = 2;
        int sum = 2;
        int curr=0;
        int i = 3;
        while(curr <= 4000000){
          curr = seq[i-1] + seq[i-2];
          seq[i] = curr;
          if(curr%2 == 0){
            sum+= curr;
          }
          i++;
        }
          System.out.println(sum);
  }
}
