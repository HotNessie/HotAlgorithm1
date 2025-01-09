import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        long b = scanner.nextLong();

        long sipJinSu = 0;
        long jariNumInt = 0;

        for(int i = 0; i < num.length(); i++) {
            char jariNumChar = num.charAt(i);//주어진 num을 자릿수마다 잘랐음
            if(jariNumChar >= '0' && jariNumChar <= '9') {  //자른 수가 ABCD....이면...
                 jariNumInt = jariNumChar - '0';
//                System.out.println(jariNumInt);
            }else {
                jariNumInt = jariNumChar - 55;
//                System.out.println(jariNumInt);
            }
            sipJinSu += (long) ((jariNumInt*Math.pow(b, num.length() - (i+1)))); // 1자리 지수가 무조건 0이 되니까 1자리는 0인 상태임
        }
        System.out.println(sipJinSu);
}
}

