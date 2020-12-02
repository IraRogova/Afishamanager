package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
  private Afisha[] items = new Afisha[0];
    private int movie = 10;

    public AfishaManager() {
    }

    public AfishaManager(int movie) {
        this.movie = movie;
    }


  public void add(Afisha item) {

    int length = items.length + 1;
    Afisha[] tmp = new Afisha[length];
    System.arraycopy(items, 0, tmp, 0, items.length);

    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

    public Afisha[] getAll() {

      Afisha[] result = new Afisha[items.length];
      for (int i = 0; i < result.length; i++) {
        int index = items.length - i - 1;
        result[i] = items[index];
      }
      return result;
    }


    public Afisha[] getLastMovie() {
        int length = movie;
        if (length > items.length) {
            length = items.length;
        }

        Afisha[] result = new Afisha[length];

        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}