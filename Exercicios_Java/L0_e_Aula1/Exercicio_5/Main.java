public class Main {
    public static void main(String args[]){
      for(int i = 1; i <= 100; i++){
        System.out.print(i+ " java ");
        if(i != 1){
          for(int d = 1; d <= i; d++ ){
            System.out.print("atrapalham ");
          }
          System.out.println("muita gente.");
        }else{
          System.out.println("atrapalha muita gente.");
        }
      }
    }
}
