import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {

       String s =getTemp();
       System.out.println(s);
       Integer temp = Integer.valueOf(s.replaceAll("[C]*", "")); // clear а string and convert a string to an integer

        if(temp>=-50&temp<=-1)
        {
            System.out.println("“It’s super cold today. Be sure you dressed well!”");
        }
        if(temp>=0&temp<=10)
        {
            System.out.println("“It’s windy outside, but we are sure you will enjoy your day!”");
        }
        if(temp>=11&temp<=30)
        {
            System.out.println("“It’s time for the outdoor walking!”");
        }
        if(temp<-50|temp>31)
        {
            System.out.println("“Please re-check results in 5 mins.”");
        }

    }

    public static String getTemp() //  get from range max min temp on Earth (-91С<>+57С)
    {
        String temp;
        int a = (int) (Math.random() * 147 -90);
        if (a>0)
        {
            temp = "+"+a+"C";
        }
        else temp = a+"C";
        return temp;

    }
}
