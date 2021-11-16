/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok3.rentcar.providers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kelompok3.rentcar.models.Mobil;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kholiqul
 */
public class MobilProvider {
   
    static ObjectMapper mapper = new ObjectMapper();
    
    
    public static List<Mobil> getDataMobil(){
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        String currentDir = s+"/src/main/java/com/kelompok3/rentcar/providers/";
        File dataMobilJson = new File(currentDir+"data/datamobil.json");
        List<Mobil> data = new ArrayList<>();
        try {
            List<? extends Map<String, Object>> dataMobil = mapper.readValue(dataMobilJson, new TypeReference<List<? extends Map<String, Object>>>(){});
            for(int i = 0; i < dataMobil.size(); i++){
                Mobil mobil = new Mobil(
                        (int) dataMobil.get(i).get("id"), 
                        (String) dataMobil.get(i).get("merek"), 
                        (String) dataMobil.get(i).get("tipe"), 
                        (int) dataMobil.get(i).get("tahun"), 
                        (String) dataMobil.get(i).get("status"), 
                        (String) dataMobil.get(i).get("nopol"), 
                        (int) dataMobil.get(i).get("harga")
                );
                data.add(mobil);
            }
        } catch (IOException ex) {
            Logger.getLogger(MobilProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public static Mobil getDataMobilById(int id){
        List<Mobil> dataMobil = getDataMobil();
        Object result = new Object();
        for(int i = 0; i < dataMobil.size(); i++){
            Mobil mobil = dataMobil.get(i);
            if(mobil.id() == id){
                result = mobil;
            }
        }
        return (Mobil) result;
    }

    public static List<Mobil> getDataAvailableMobil(){
        List<Mobil> dataMobil = getDataMobil();
        List<Mobil> result = new ArrayList<>();
        for(int i = 0; i < dataMobil.size(); i++){
            Mobil mobil = dataMobil.get(i);
            if(mobil.status().equals("tersedia")){
                result.add(mobil);
            }
        }
        return result;
    }

    
}
