package assignmentold_4;

import java.util.Comparator;

public class AddressNameSort  implements Comparator<Bussiness> {

    public int compare(Bussiness a, Bussiness b){
        return a.getFname().compareTo(b.getFname());
    }
}
