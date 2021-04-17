package Source;

public class Card {

    enum Color {
        ORANGE, BLUE, PINK, GREEN, PRIZE;
        private static final Color[] colors = Color.values();

        public static Color getColor(int i) {
            return Color.colors[i];
        }
    }

    enum Value {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, THIRTEEN, FOURTEEN, FIFTEEN;
        private static final Value[] values = Value.values();

        public static Value getValue(int i) {
            return Value.values[i - 1];
        }
    }

    private final Color color;
    private final Value value;

    public Card() {
        this.color = Color.ORANGE;
        this.value = Value.ONE;
    }

    public Card(final Color clr, final Value val) {
        this.color = clr;
        this.value = val;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card { color = " + color + ", value = " + value + '}';
    }

}
