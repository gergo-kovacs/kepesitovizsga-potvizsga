package hu.nive.ujratervezes.kepesitovizsga.forest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Forest {

    private List<Tree> trees;

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void rain(){
        for (Tree t:trees) {
            t.irrigate();
        }
    }

    public void cutTrees(Lumberjack jack){
        Iterator<Tree> treeIterator = trees.iterator();
        while(treeIterator.hasNext()){
            Tree tree = treeIterator.next();
            if(jack.canCut(tree)){
                treeIterator.remove();
            }
        }
    }

    public boolean isEmpty(){
        return trees.size()==0;
    }

    public List<String> getStatus(){
        List<String> stringList = new ArrayList<>();

        for (Tree t:trees) {
            stringList.add("There is a "+t.getHeight()+" tall "+t.toString()+" in the forest.");
        }
        return stringList;
    }

}
