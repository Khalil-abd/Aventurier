package com.ka;

import java.io.IOException;

public interface Loader<T> {
    T load(String filePath) throws IOException, RuntimeException;
}
