

public class Cow {
    private String name;
    private int Age;
  
    Cow( String name1, int Age1)
    {
        name = name1;
        Age = Age1;
    
    }
    Cow(){};
    public void setName( String name1)
    {
        name = name1;
    }
    public String getName()
    {
        return name;
    }
    public void setAge( int AgeCow)
    {
        if(AgeCow > 0){
              Age = AgeCow;
        }
    }
    public int getAge()
    {
        return Age;
    }
    public void loud()
    {
       System.out.println("My name is " + name);
       System.out.println("I'm " + Age +" years old");
        if(Age <5)
            System.out.println("the Cow say : 'moooooooo'");
        else
            System.out.println("the Cow say: 'I'm a man. good man!");
    }
}
