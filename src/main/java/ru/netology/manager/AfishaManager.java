package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
  private Afisha[] items = new Afisha[0];

  public AfishaManager() {
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


}