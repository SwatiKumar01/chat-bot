package com.bhawna.calories.util;

import java.util.List;
import java.util.Map;

public interface ExcelValuesMapper<T> {
    public List<T> mapValues(Map<String, Integer> headerMap, List<List<String>> rowList);
}
