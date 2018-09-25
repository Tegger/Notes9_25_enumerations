public class main {
    enum Directions{
        EAST ("EAST", "E"),//this calls the constructor Directions to create EAST, E
        WEST ("WEST", "W"),
        NORTH ("NORTH", "N"),
        SOUTH ("SOUTH", "S");

        private final String shortDir;
        private final String properCase;

        Directions(String name, String code){
            this.properCase = name;
            this.shortDir = code;
        }

        public String getShortDir(){
            return this.shortDir;
        }

        public String getProperCase(){
            return this.properCase;
        }

    }//Directions



    //___________________________________________________


    public static void main(String args[]){

        Directions myDir = Directions.EAST;//not a string, just an object

        System.out.println(myDir.properCase);//.shortDir is added to print the string equivelent


    }//Public Static Void main


}//public class main
