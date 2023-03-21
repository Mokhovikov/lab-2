package com.github.rsoi.service;



import com.github.rsoi.domain.Sing;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Service
public class PlaylistImpl implements PlaylistService {



    @Override
    public void sortByListen(TreeMap<String, ArrayList<LocalDate>> first) {

        TreeMap<String, Integer> sort = new TreeMap<>();
        for (Map.Entry<String, ArrayList<LocalDate>> entry : first.entrySet()){
            sort.put(entry.getKey(), entry.getValue().size());
        }


        System.out.println(
                sort
                        .entrySet().stream()
                        .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
                        .collect(Collectors.toList())
        );
    }


    @Override
    public void form(ArrayList<Sing> all,
                     TreeMap<String,ArrayList<LocalDate>> allMap,
                     TreeMap<String, ArrayList<LocalDate>> first,
                     TreeMap<String, ArrayList<LocalDate>> second,
                     TreeMap<String, ArrayList<LocalDate>> third) {
        for (int i = 0; i<all.size();i++){
            allMap.put(all.get(i).getSinger(),all.get(i).getDates());
        }
        for (Map.Entry<String, ArrayList<LocalDate>> entry : allMap.entrySet()){
            LocalDate date = LocalDate.now();

            for (int i =0; i <1;i++) {
                if (entry.getValue().get(i).getMonthValue() == date.getMonthValue()) {
                    first.put(entry.getKey(), entry.getValue());
                }else if (entry.getValue().get(i).getMonthValue() == date.getMonthValue() - 1) {
                    second.put(entry.getKey(), entry.getValue());
                }else {
                    third.put(entry.getKey(),entry.getValue());
                }
            }
        }

        third.put(first.firstKey(), first.get(first.firstKey()));
        third.put(second.firstKey(), second.get(second.firstKey()));
    }




}

