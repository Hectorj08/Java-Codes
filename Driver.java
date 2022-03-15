public class Driver {
   
public static void main(String[] args){

      Farm p = new Farm("Hector's Farm",10);
      
       Animal a1 = new Animal("cow",2012,100.5,'f');
       Animal a2 = new Animal("pig",2009,550.5,'m');
       Animal a3 = new Animal("donkey",1999,773.42,'m');
       Animal a4 = new Animal("sheep",2016,164.23,'f');
       Animal a5 = new Animal("goose",2004,10.75,'f');
       
      
      p.addAnimal(a1);
      p.addAnimal(a2);
      p.addAnimal(a3);
      p.addAnimal(a4);
      p.addAnimal(a5);
      
      p.printAllDetails();

}
}