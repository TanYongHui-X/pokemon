public class Pokemon {
        String name;
        int level;
        Pokemon() {
            level = 1;
        }

        //constrctor #1 with parameters
        Pokemon(String pName, int pLevel){
            //set variable
            this.name = pName;
            this.level = pLevel;
        }

        void attack(){
            System.out.println(name + " attack!");
        }
}
