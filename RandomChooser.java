public class RandomChooser extends Player {
    public boolean cooperates(){
        return ((int)(Math.random()*2) == 1 ? true : false);
    }

    public String toString(){
        return "RandomChooser got: " + this.score();
    }
}
