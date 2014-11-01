package Main;

import com.example.exception.SingleException;
import com.example.instrument.Instrument;
import com.example.instrument.Pian;
import com.example.instrument.Saxofon;
import com.example.interfaces.IPlay;

/**
 * Created by VoldHouse on 10/29/2014.
 */
public class main {
    public static void main(String[] args) {
        /**
         * testez anumite instrumente, interfata si clasa abstracta
         */

        IPlay playable=new Pian("Marshall","Austria",5);
        Instrument instrument=new Saxofon("Thonman","Romania",10);
        Pian pian=new Pian("Gregorovitch","Elvetia",7);

        String[] ArrayOfStrings={"Subpunctul 1","Subpunctul 2","Subpunctul 3"};
        System.out.println(ArrayOfStrings[0]);
        try {
            playable.play();
            playable.adjust();
        } catch (SingleException e)
        {
            System.out.println("Exception while playing or singing:"+e.getMessage());
        }

        System.out.println(ArrayOfStrings[1]);
        try {
            ((IPlay)instrument).play();
            ((IPlay)instrument).adjust();
        } catch (SingleException e)
        {
            System.out.println("Exception while playing or singing:"+e.getMessage());
        }
        pian.setmTara("Belgia");
        System.out.println(ArrayOfStrings[2]);
        try {
            pian.play();
            pian.adjust();
        } catch (SingleException e)
        {
            System.out.println("Exception while playing or singing:"+e.getMessage());
        }





    }
}
