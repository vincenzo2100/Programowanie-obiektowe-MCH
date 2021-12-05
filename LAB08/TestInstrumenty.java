import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
        public static void main(String[] args)
        {
            ArrayList<String> orkiestra = new ArrayList<String>();
            Instrument[] instrumenty = new Instrument[5];
            instrumenty[0] = new Flet("Dell",LocalDate.of(2000,12,12)){};
            instrumenty[1] = new Fortepian("Dell",LocalDate.of(2000,12,12)){};
            instrumenty[2] = new Skrzypce("Dell",LocalDate.of(2000,12,12)){};
            instrumenty[3] = new Flet("Dell",LocalDate.of(2000,12,12)){};
            instrumenty[4] = new Fortepian("Dell",LocalDate.of(2000,12,12)){};
            for(int i=0;i<5;i++)
            orkiestra.add(instrumenty[i].dzwiek());

            for(int i = 0; i < orkiestra.size(); i++)   
                System.out.print(orkiestra.get(i));
        }      
}
