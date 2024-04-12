package com.jinhogate.lambdaexpression.avanced;

import java.util.Objects;
import java.util.function.Function;

public interface Comparator<T> {

    int compare(T t1, T t2);

    static <T, U extends Comparable<U>> Comparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (t1, t2) -> keyExtractor.apply(t1).compareTo(keyExtractor.apply(t2));
    }

    default <U extends Comparable<U>> Comparator<T> thenComparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return thenComparing(comparing(keyExtractor));
    }

    default Comparator<T> thenComparing(Comparator<T> other) {
        Objects.requireNonNull(other);
        return (t1, t2) -> {
            int firtsComparing = this.compare(t1, t2);
            if (firtsComparing == 0) {
                return other.compare(t1, t2);
            }
            return firtsComparing;
        };
    }
}
