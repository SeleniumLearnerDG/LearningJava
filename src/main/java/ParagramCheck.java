import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ParagramCheck {
    public static void main(String[] args) {
        String[] A= {"nmhed", "ouanm", "ytoxq", "vefsd", "chaka", "sygei", "xqdrk", "kmdpv", "pyodz", "kdogm", "mydfi", "qdqqu", "gmkfa", "xldyk", "dxceb", "jgdul", "jlvyq", "frxgw", "mnpvt", "myqlv" };
        System.out.println(new ParagramCheck().solve(A));
    }

    public int solve(String[] A) {
        HashSet<Character> h = new HashSet<Character>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length();j++){
                h.add(Character.toLowerCase(A[i].charAt(j)));
            }
        }
        if(h.size()==26) return 1;
        return 0;
    }
}



