package com.kelompok3.rentcar.providers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.kelompok3.rentcar.models.Kelompok;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class KelompokProvider {
    static ObjectMapper mapper = new ObjectMapper();
    
    
    public static List<Kelompok> getData(){
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        String currentDir = s+"/src/main/java/com/kelompok3/rentcar/providers/";
        File dataMobilJson = new File(currentDir+"data/anggotaKelompok.json");
        List<Kelompok> data = new ArrayList<>();
        try {
            List<? extends Map<String, Object>> dataMobil = mapper.readValue(dataMobilJson, new TypeReference<List<? extends Map<String, Object>>>(){});
            for(int i = 0; i < dataMobil.size(); i++){
                Kelompok kelompok = new Kelompok(
                        (String) dataMobil.get(i).get("nama"), 
                        (String) dataMobil.get(i).get("nim")
                );
                data.add(kelompok);
            }
        } catch (IOException ex) {
            Logger.getLogger(MobilProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
