package com.ka.loader;

import java.io.IOException;

public interface DataLoader<T> {
    T load(String filePath) throws IOException, RuntimeException;
}
