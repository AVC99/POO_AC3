package Persistance;

import Business.Legendary;
import Business.Mythic;
import Business.Pokemon;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;


public class ReadFiles {
    private Gson gson= new Gson();

    public ArrayList<Pokemon> loadCommon(){
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        Pokemon[] commons;
        try{
            //o parsear de Jsonelement a
            commons=gson.fromJson(new FileReader("common.json"), Pokemon[].class);
            pokemons.addAll(Arrays.asList(commons));
            //System.out.println(pokemons.get(1).getName());
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return pokemons;
    }
    public ArrayList<Mythic> loadMythic(){
        ArrayList<Mythic> mythics = new ArrayList<>();
        Mythic[] mythicsArray;
        try{
            //o parsear de Jsonelement a
            mythicsArray=gson.fromJson(new FileReader("mythical.json"), Mythic[].class);
            mythics.addAll(Arrays.asList(mythicsArray));
            //System.out.println(mythics.get(1).getRarity());
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return mythics;
    }
    public ArrayList<Legendary> loadLegendaries(){
        ArrayList<Legendary> legendaryList = new ArrayList<>();
        Legendary[] legendaries;
        try{
            //o parsear de Jsonelement a
            legendaries=gson.fromJson(new FileReader("legendary.json"), Legendary[].class);
            legendaryList.addAll(Arrays.asList(legendaries));
           // System.out.println(legendaryList.get(1).getPower());
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return legendaryList;
    }
}
