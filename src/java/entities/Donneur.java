package entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Donneur extends User {
    @OneToMany(mappedBy = "donneur")
    private List<Don> dons;

    public Donneur() {
    }
   

    public Donneur(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
    }

    public List<Don> getDons() {
        return dons;
    }

    public void setDons(List<Don> dons) {
        this.dons = dons;
    }
  
}
   
    
            



