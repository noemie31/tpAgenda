package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    List<Event> agenda= new ArrayList<Event>();
    public void addEvent(Event e) {
        agenda.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        List<Event>  nouveauxev= new ArrayList<Event>();
        int compteur=0;
        for (Event e : agenda) {
            if (e.isInDay(day)){
                nouveauxev.add(e);
                compteur=compteur+1;
            }
        }
        return nouveauxev;

    }
}
