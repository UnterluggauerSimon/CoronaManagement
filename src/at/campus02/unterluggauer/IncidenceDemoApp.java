package at.campus02.unterluggauer;

import java.util.ArrayList;

public class IncidenceDemoApp
{
    public static void main(String[] args)
    {
        Incidence stmk20211111 = new Incidence("Steiermark", "2021-11-11", 1300);
        Incidence stmk20211011 = new Incidence("Steiermark", "2021-10-11", 1000);
        Incidence wien20211111 = new Incidence("Wien", "2021-11-11", 1000);
        Incidence wien20211011 = new Incidence("Wien", "2021-10-11", 1200);
        Incidence tirol20211011 = new Incidence("Tirol", "2021-10-11", 900);
        Incidence tirol20211111 = new Incidence("Tirol", "2021-11-11", 950);

        ArrayList<Incidence> recordValues = new ArrayList<>();
        recordValues.add(stmk20211011);
        recordValues.add(stmk20211111);
        recordValues.add(wien20211111);
        recordValues.add(wien20211011);
        recordValues.add(tirol20211011);
        recordValues.add(tirol20211111);
        recordValues.add(new Incidence("Salzburg", "2021-10-11", 800));

        System.out.println("Count of recorded Record: " + recordValues.size());

        int countTotalIncidences = 0;
        for (int i = 0; i < recordValues.size(); i++)
        {
            Incidence oneValue = recordValues.get(i);
            countTotalIncidences += oneValue.getNumber();
        }
        System.out.println("countTotalIncidences = " + countTotalIncidences);

        countTotalIncidences = 0;
        for (Incidence Incidence: recordValues)
        {
            countTotalIncidences += Incidence.getNumber();
        }
        System.out.println("countTotalIncidences = " + countTotalIncidences);
    }
}
