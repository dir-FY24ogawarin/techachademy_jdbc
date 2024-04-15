package dbSample.entity;
//DTO
public class Country {
    //フィールド
    private String name;
    private int population;
    
    //引数無しコンストラクタ
    public Country() {
        
    }
    //引数ありコンストラクタ
    public Country(String name, int population) {
        this.name=name;
        this.population=population;
    }
    
    //getter/setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int population) {
        this.population=population;
    }
    }
    