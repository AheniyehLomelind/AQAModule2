package testingisgood;

import java.util.ArrayList;

public class TNumber
{
    String num;

    public TNumber(String num) {
        this.num = num;
    }

    public static void main(String[] args)
    {
        ArrayList<TNumber> TNumbers = new ArrayList<>(10);


        TNumbers.add(new TNumber("1"));
        TNumbers.add(new TNumber("2"));
        TNumbers.add(new TNumber("3"));
        TNumbers.add(new TNumber("4"));
        TNumbers.add(new TNumber("5"));
        TNumbers.add(new TNumber("6"));
        TNumbers.add(new TNumber("7"));
        TNumbers.add(new TNumber("8"));
        TNumbers.add(new TNumber("9"));
        TNumbers.add(new TNumber("10"));


        TNumbers.forEach(TNumber -> System.out.println("Текущее число = " + TNumber.num));
        }
    }
