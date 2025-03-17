package ir.expr;

import ir.Type;

public class Byte extends Expression
{
    final private byte value;

    @Override
    public Type getType() {
        return Type.BYTE;
    }

    public int getValue() {
        return value;
    }

    public Byte(byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
