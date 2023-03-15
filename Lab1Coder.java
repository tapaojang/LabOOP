import java.util.ArrayList;
import java.util.Collections;
class Lab1Coder{
    private String name;
    int experience;
    private ArrayList<String> languages;

    Lab1Coder(){
        
    }

    Lab1Coder(String name){
        this.name = name;
    }

    Lab1Coder(String name, int experience){
        this.name = name;
        this.experience = 0;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setExperience(int experience){
        this.experience = experience;
    }

    int getExperience(){
        return experience;
    }

    void setLanguages(String... lang){
        languages = new ArrayList<String>();
        Collections.addAll(languages,lang);
    }

    ArrayList<String> getLanguages(){
        return languages;
    }

    ArrayList<String> findCommonLanguages(Lab1Coder other){
        ArrayList<String> listLang = new ArrayList<String>();
        for(int i = 0; i < getLanguages().size(); i++){
            for(int j = 0; j < other.getLanguages().size(); j++){
                if(getLanguages().get(i).equals(other.getLanguages().get(j))){
                    listLang.add(getLanguages().get(i));
                }
            }
        }
        if(listLang.size() == 0){
            listLang.add("none");
            return listLang;
        }
        else{
            return listLang;
        }
        
    }

    public String toString(){
        String total = "";
        for(int i = 0; i < getLanguages().size(); i++){
            total += getLanguages().get(i) + " ";
        }
        return String.format("%s(%d) knows %s" , name, experience, total);
    }

}