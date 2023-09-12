public class Reduce {

    public static void main(String[] args) {
        System.out.println(reduce(100));
    }
    public static int reduce(int n){
        int cou = 0;
        int num = n;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num -= 1;
            }
            cou ++;
        }
        return cou;
    }

}
