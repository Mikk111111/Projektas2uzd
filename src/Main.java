
public class Main {
    public static void main(String[] args) {
        //==============================================================
        System.out.println("EX1:");
        int[] arr = new int[300];
        int amountOver150 = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int) Math.floor(Math.random()*301);
            if(arr[i]>275) System.out.print("["+arr[i]+"] ");
            else System.out.print(arr[i]+" ");
            if(0==i%30) System.out.println();
            if(arr[i]>150)amountOver150++;
        }
        System.out.println();
        System.out.println("Number biggger then 150: "+amountOver150);
        //==============================================================
        System.out.println("EX2:");
        for (int i = 0;i<3000;i++)
        {
            if(i%77==0)
            {
                System.out.print(i);
                if(i+77<3000) System.out.print(", ");
            }
        }
        System.out.println();
        //==============================================================
        System.out.println("EX3:");
        int size = 10;
        for(int i = 0; i < size ; i++ ){
            for(int j = 0; j < size ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

}