
public class test {

    public static void  saleBoxes(int apples, int oranges)
    {
        int big =0;
        int smallapplesbox =0;
        int smallOrangebox =0;

        while((apples/100) !=0 && (oranges/100) != 0)
        {
            apples =apples -100;
            oranges = oranges -100;
            big++;
        }

        System.out.print("Combination boxes =   " + big +"\n" );
        //System.out.print(oranges);

        while(apples!=0)
        {
            if(apples !=0 )
            {
                apples=apples-50;
                smallapplesbox++;
            }
        }
        System.out.print("Small Apple Boxes  " +smallapplesbox+"\n" );

        while (oranges !=0)
        {
            if(oranges !=0 )
            {
                oranges =oranges-50;
                smallOrangebox++;
            }
        }
        System.out.print("Small orange Boxes  "+smallOrangebox+"\n" );
    }


    public static void main(String[] args)
    {
        // Scenario 1
        System.out.print("Scenario 1"+"\n");
        saleBoxes(350,400);
        System.out.print("\n");
        // Scenario 2
        System.out.print("Scenario 2"+"\n");
        saleBoxes(50,50);
        System.out.print("\n");
        // Scenario 3
        System.out.print("Scenario 3"+"\n");
        saleBoxes(0,100);


    }

}
