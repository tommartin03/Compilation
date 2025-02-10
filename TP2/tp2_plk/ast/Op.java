package ast;

public enum Op {
    MOINS{
        @Override
        public String toString() {
            return "-";
        }
    },
    NOT{
        @Override
        public String toString() {
            return "not";
        }
    },
    ABS{
        @Override
        public String toString() {
            return "abs";
        }
    },
}
