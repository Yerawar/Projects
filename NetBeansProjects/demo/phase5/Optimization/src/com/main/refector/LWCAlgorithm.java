package com.main.refector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LWCAlgorithm {

    public static ArrayList<LCWDTO> process(ArrayList<String> list) {
        ArrayList<LCWDTO> arrayList = new ArrayList<>();
        Set<String> unique = new HashSet<>(list);
        for (String key : unique) {
            LCWDTO lCWDTO = new LCWDTO();
            lCWDTO.setWord(key);
            lCWDTO.setFrequncy(Collections.frequency(list, key) + "");
            arrayList.add(lCWDTO);
        }
        return arrayList;
    }
}
