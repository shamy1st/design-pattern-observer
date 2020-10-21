# Java Implementation of Observer Design Pattern

**Observer** design pattern an object **subject** notify list of **observers** automatically by any state changes.
![](https://github.com/shamy1st/design-pattern-observer-java/blob/main/observer-uml.png)
### Problem: 
You have **DataSource** and when its value change you should notify **Chart** to redraw and **SpreadSheet** to recalculate.

    public class DataSource {
        private int value;  //when this value changes the other objects must be notified

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public class Chart {

    }

    public class SpreadSheet {

    }
### Solution:
![](https://github.com/shamy1st/design-pattern-observer-java/blob/main/observer-solution-uml.png)
