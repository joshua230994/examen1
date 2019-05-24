package prueba.prueba;

public class TrainingGreeter {
    private Training training;
    public TrainingGreeter(Training training){
        this.training = training;
    }
    public String sayHelloo(){return "La lista "+ training.getCursName()+" "+training.getListName(); }
}
