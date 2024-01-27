public class Lab31Arrays{
    public static void main(String[] args) {
        int[] score = new int[] {0, 10, 20, 30, 40};
        int sum = 0;
        for(int i = 0 ; i < 5 ; i++ )
        {
            sum = sum + score[i];
            System.out.printf("Score[%d] = %d : Sum = %d\n",i,score[i],sum);
        }
        System.out.println("Final sum : " + sum);
    }
}
