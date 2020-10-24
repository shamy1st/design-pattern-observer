# Observer Design Pattern (Java)

**Observer** object notify observers when its state changes.
![](https://github.com/shamy1st/design-pattern-observer/blob/main/uml.png)
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
![](https://github.com/shamy1st/design-pattern-observer/blob/main/uml-solution.png)
