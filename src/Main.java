
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
        //==============================================================
        System.out.println("EX4:");
        int sizes = 1;
        int symbolP = 0;
        int symbolN = sizes-1;
        for(int i = 0; i < sizes ; i++ ){
            for(int j = 0; j < sizes ; j++){
                if(j==symbolN) System.out.print(" + ");
                else if(j==symbolP) System.out.print(" + ");
                else System.out.print(" * ");
            }
            symbolN--;
            symbolP++;
            System.out.println();
        }
        //==============================================================
        System.out.println("EX5:");
        int rrr;
        int timer = 100;
        System.out.println("A: ");
        for(int i=0;i<timer;i++)
        {
            rrr = (int) Math.round(Math.random());
            if(rrr==1) {
                System.out.print("S ");
            }
            else{
                System.out.print("H ");
                break;
            }
        }
        System.out.println();
        System.out.println("B: ");
        int howmanyH=0;
        for(int i=0;i<timer;i++)
        {
            rrr = (int) Math.round(Math.random());
            if(rrr==1) {
                System.out.print("S ");
            }
            else{
                System.out.print("H ");
                howmanyH++;
                if(howmanyH==3)break;
            }
        }
        System.out.println();
        System.out.println("C: ");
        howmanyH=0;
        int straightH=0;
        boolean isContinuos=false;
        for(int i=0;i<timer;i++)
        {
            rrr = (int) Math.round(Math.random());
            if(rrr==1) {
                System.out.print("S ");
                isContinuos=false;
                howmanyH=0;
            }
            else{
                System.out.print("H ");
                isContinuos=true;
                howmanyH++;
                if(isContinuos&&howmanyH==3)break;
            }
        }
        System.out.println();
        //==============================================================
        System.out.println("EX6:");
        int kazys = 0;
        int petras = 0;
        boolean isWinner=true;
        while(isWinner)
        {
            kazys += (int)Math.round(Math.random()*20+5);
            petras += (int)Math.round(Math.random()*10+10);
            System.out.print("Match "+kazys+":"+petras+" ");
            if(petras>=222||kazys>=222)isWinner=false;
        }
        System.out.println();
        if(petras>kazys)
        {
            System.out.println("Match Won  by: Petras, with Score of: "+petras);
            System.out.println("Match Lost by: Kazys,  with Score of: "+kazys);
        }
        else if (petras<kazys)
        {
            System.out.println("Match Won  by: Kazys,  with Score of: "+kazys);
            System.out.println("Match Lost by: Petras, with Score of: "+petras);
        }
        else
        {
            System.out.println("Draw");
            System.out.println("Kazys  Score: "+kazys);
            System.out.println("Petras Score: "+petras);
        }
        //==============================================================
        System.out.println("EX7:");
        int RombaSizes = 21;
        int RombaMiddle = (int) Math.floor(RombaSizes/2);
        int RombaSymbolP = RombaMiddle;
        int RombaSymbolN = RombaMiddle;
        boolean isRombaMiddle = false;
        for(int i = 0; i < RombaSizes ; i++ ){
            for(int j = 0; j < RombaSizes ; j++){
                if(j>RombaSymbolP||j<RombaSymbolN) System.out.print(" ");
                else System.out.print("*");


            }
            if(RombaMiddle==i) isRombaMiddle=true;
            if(!isRombaMiddle)
            {
                RombaSymbolN--;
                RombaSymbolP++;
            }
            else
            {
                RombaSymbolN++;
                RombaSymbolP--;
            }

            System.out.println();
        }
        //==============================================================
        System.out.println("EX8:");
        int vinis = 85;
        boolean isVinisFinished = true;
        int hits = 0;
        int vinys = vinis*5;
        while(isVinisFinished)
        {
            vinys-= (int) Math.round(Math.random()*15+5);
            hits++;
            if(vinys<=0)isVinisFinished=false;
        }
        System.out.println("1rst Nails were hammered in: " + hits + " hits.");
        isVinisFinished=true;
        hits=0;
        vinys=vinis*5;
        int chance50;
        while(isVinisFinished)
        {
            chance50 = (int) Math.round(Math.random());
            if(chance50==1)
            {
                vinys-= (int) Math.round(Math.random()*20+10);
                hits++;
            }
            else hits++;

            if(vinys<=0)isVinisFinished=false;
        }
        System.out.println("2nd  Nails were hammered in: " + hits + " hits.");
        //==============================================================
        System.out.println("EX9:");
        int arrSize = 50;
        int[] arr50 = new int[arrSize];
        boolean isDone = true;
        for(int i = 0;i<50;)
        {
            isDone=true;
            while(isDone)
            {
                for(int j=0;j<i;j++)
                {
                    if(arr50[j]==arr50[i])
                    {
                        isDone=false;
                    }
                }
                arr50[i]=(int) Math.round(Math.random()*199+1);

            }

            i++;
        }


    }

}