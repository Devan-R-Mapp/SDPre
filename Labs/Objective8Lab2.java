 public class Objective8Lab2{
   public static void main(String[] args) {
     int su = 0;
     for(int i=1; i<=20; i+=1){
       su = i + su;
       if(su == 210){
        System.out.println(su);
      }
    }
  }
}
