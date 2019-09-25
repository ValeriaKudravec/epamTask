package task1.DoubleStreamActionClass;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public abstract class Actions implements DoubleStream {

    @Override
    public DoubleStream sorted() {
        return null;
    }

    @Override
    public double sum() {
        return 0;
    }

    @Override
    public OptionalDouble min() {
        return null;
    }
}
