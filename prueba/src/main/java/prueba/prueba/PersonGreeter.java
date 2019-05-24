package prueba.prueba;

public class PersonGreeter {
    private Person person;
    public PersonGreeter (Person person){
        this.person = person;
    }
    public String sayHello(){ return "Guarde " + person.getFirstName()+" "+person.getLastName();}
}
