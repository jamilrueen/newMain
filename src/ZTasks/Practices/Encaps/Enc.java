package ZTasks.Practices.Encaps;

public class Enc {
    private String make;
    private String model;
    private int year;

    Enc(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    //Get
    String getMake(){
        return make;
    }

    String getModel(){
        return model;
    }
    int getYear(){
        return year;
    }

    //Set Methods
    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
