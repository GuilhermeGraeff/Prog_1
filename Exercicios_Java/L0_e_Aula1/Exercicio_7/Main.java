public class Main {
    public static void main(String args[]){
      // double a = 9;
      // double b = 3;
      // System.out.println("aaa,"+(a%b));
      int func = 1;
      int contador = 0;
      double x = 0;
      while(func == 1){
        int flag = 0;


        for (double i = 1; i <=x; i++){
          if (x%i ==0){
            flag ++;
          }
        }





        if (flag == 2){
            System.out.println(x);
        }
        if (contador >= 100000){
          func = 0;
        }
        x++;
        contador++;
      }
    }
}
