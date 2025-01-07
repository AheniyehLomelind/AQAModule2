package testingisgood;

import java.util.ArrayList;

public class TNumbers
{
    private final int number;

    public TNumbers(int number) {
        this.number = number;
    }

    public static void main(String[] args)
    {
        ArrayList<TNumbers> numbers = new ArrayList<>(10);

        TNumbers one = new TNumbers(1);
        TNumbers two = new TNumbers(2);
        TNumbers three = new TNumbers(3);
        numbers.add(one);

        for (testingisgood.TNumbers TNumbers : numbers)
        {
            System.out.println(numbers.get(numbers.indexOf(one)));
        }
    }
}

//public class Cat
//{
//
   //  private String name;

    //public Cat(String name) {
     //   this.name = name;
    //}

//public static void main(String[] args) {

  //  ArrayList<Cat> cats = new ArrayList<>();
    //Cat thomas = new Cat("Томас");
    //Cat behemoth = new Cat("Бегемот");
    //Cat philipp = new Cat("Филипп Маркович");
    //Cat pushok = new Cat("Пушок");

    //cats.add(thomas);
    //cats.add(behemoth);
    //cats.add(philipp);
    //cats.add(pushok);

    //int thomasIndex = cats.indexOf(thomas);
    //System.out.println(thomasIndex);
//}
//}