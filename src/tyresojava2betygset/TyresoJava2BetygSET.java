
package tyresojava2betygset;

import java.util.HashSet;
import java.util.Set;

public class TyresoJava2BetygSET {

    public static void main(String[] args) {    
     
 Set<ElevsBetyg> elBy = new HashSet<ElevsBetyg>();   
     
      elBy.add(new ElevsBetyg ("710131-1234", 'G', 'G'));
      elBy.add(new ElevsBetyg ("820228-2345", 'U', 'G'));
      elBy.add(new ElevsBetyg ("930328-3456", 'G', 'G'));
      elBy.add(new ElevsBetyg ("940428-4567", 'G', 'U'));
      elBy.add(new ElevsBetyg ("950530-5678", 'U', 'U'));
      elBy.add(new ElevsBetyg ("960615-6789", 'U', 'U'));
      elBy.add(new ElevsBetyg ("970715-7890", 'G', 'G'));
      
 System.out.println("Alla elever som har fått godkända i svenska eller engelska: ");
    for(ElevsBetyg elev:elBy){
        if(elev.getSvenska().equals('G')||elev.getEngelska().equals('G')){
            System.out.println(elev);
    
            }
        } 
    
System.out.println("\nAlla elever som har fått godkända både i svenska och engelska: ");
    for(ElevsBetyg elev:elBy){
        if(elev.getSvenska().equals('G')&&elev.getEngelska().equals('G')){
            System.out.println(elev);
    
            }
        } 
    
System.out.println("\nAlla elever som inte har fått godkänd i någon kurs: ");
    for(ElevsBetyg elev:elBy){
        if(!(elev.getSvenska().equals('G')&&elev.getEngelska().equals('G'))){
            System.out.println(elev);
    
            }
        } 
    }
}
