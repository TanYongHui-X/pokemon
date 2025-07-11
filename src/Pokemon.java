public class Pokemon {
        String name;
        int level;
        Pokemon() {
            level = 1;
        }

        //constrctor #1 with parameters
        Pokemon(String name, int level){
            //set variable
            this.name = name;
            this.level = level;
        }

        void attack(){
            System.out.println(name + " attack!");
        }
}
