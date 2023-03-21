package com.github.rsoi.service;

import com.github.rsoi.domain.Sing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Example class for showing how Spring concepts and context works
 */
public interface PlaylistService {
    void sortByListen(TreeMap<String, ArrayList<LocalDate>> first);

    void form (ArrayList<Sing> all,
               TreeMap<String, ArrayList<LocalDate>> allMap,
               TreeMap<String, ArrayList<LocalDate>> first,
               TreeMap<String, ArrayList<LocalDate>> second,
               TreeMap<String, ArrayList<LocalDate>> third);
}
