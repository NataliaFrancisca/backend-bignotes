package fundamentos.tiposDados;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class TiposReferencia {
    private String name;
    private List<Integer> grades = new ArrayList<>();
    private List<String> classes = new ArrayList<>();
    private OffsetDateTime registered;
    private OffsetDateTime lastUpdated;

    TiposReferencia(String name){
        this.name = name;
        this.registered = OffsetDateTime.now();
        this.lastUpdated = OffsetDateTime.now();
    }

    private void setLastUpdated(){
        this.lastUpdated = OffsetDateTime.now();
    }

    public void setName(String name){
        this.name = name;
        this.setLastUpdated();
    }

    public void setGrades(Integer grade){
        this.grades.add(grade);
        this.setLastUpdated();
    }

    public void setClass(String studentClass){
        if (this.classes.contains(studentClass)){
            return;
        }

        this.classes.add(studentClass);
        this.setLastUpdated();
    }

    public long howManyDaysAccountWasCreated(){
        return ChronoUnit.DAYS.between(this.registered, this.lastUpdated);
    }

    public void print(){
        System.out.println("my name is: " + this.name);
        System.out.println("register: " + this.registered);
        System.out.println("last update: " + this.lastUpdated);
        System.out.println("grades: " + this.grades);
        System.out.println("classes: " + this.classes);
    }
}
