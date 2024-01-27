
public class Solution {
    public static void main(String[] args) {
        int x = 1234567899;
        char ch;
        if(x < 0){
            System.out.println("f");
        }else{
            String str = Integer.toString(x);
            System.out.println(str);
            String reverse = "";
            for(int i = 0;i<str.length();i++){
                ch = str.charAt(i);
                reverse = ch+reverse;
            }
            if(str.equals(reverse)){
                System.out.println("t");
            }else{
                System.out.println("f");
            }

        }

    }
}
