
package tyresojava2betygset;

public class ElevsBetyg {
    private String personnummer;
    private Character svenska;
    private Character engelska;
    
    public ElevsBetyg(String personnummer, Character svenska, Character engelska){
    this.personnummer = personnummer;
    this.svenska = svenska;
    this.engelska = engelska;
    
    }

    public Character getSvenska() {
        return svenska;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public Character getEngelska() {
        return engelska;
    }

    @Override
    public String toString() {
        return "personnummer=" + personnummer + ", svenska=" + svenska + ", engelska=" + engelska;
        
    }
}
