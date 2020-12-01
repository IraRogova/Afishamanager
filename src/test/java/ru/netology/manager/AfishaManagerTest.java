package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {


    private Afisha first = new Afisha(1,  "Bloodshot", "action");
    private Afisha second = new Afisha(2, "Move_on", "cartoon");
    private Afisha third = new Afisha(3, "Hotel_Belgrad", "comedy");
    private Afisha fourth = new Afisha(4, "Gentlemen", "action");
    private Afisha fifth = new Afisha(5, "Invisible_Man", "horror");
    private Afisha sixth = new Afisha(6,  "Trolls.World_Tour", "cartoon");
    private Afisha seventh = new Afisha(7,  "Number_one", "comedy");
    private Afisha eight = new Afisha(8,  "Avengers", "fantasy");
    private Afisha ninth = new Afisha(9,  "Love_Actually", "drama");
    private Afisha tenth = new Afisha(10, "Harry Potter","fantasy");
    private Afisha eleventh = new Afisha(11,  "Hobbit", "fantasy");
    private Afisha twelve = new Afisha(12,  "Enola_Holmes", "detective");
    private Afisha thirteen = new Afisha(13,  "Holmes", "detective");

    @Test
    public void shouldGet10LastFilms() {
        AfishaManager manager = new AfishaManager();
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{twelve, eleventh, tenth, ninth, eight, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGet5LastFilms() {
        AfishaManager manager = new AfishaManager();

        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{twelve, eleventh, tenth, ninth, eight};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetMore10Films() {
        AfishaManager manager = new AfishaManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{twelve, eleventh, tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowMovies() {
        AfishaManager manager = new AfishaManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAdd() {
        AfishaManager manager = new AfishaManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowEmpty() {
        AfishaManager manager = new AfishaManager();
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{};

        assertArrayEquals(expected, actual);
    }

}